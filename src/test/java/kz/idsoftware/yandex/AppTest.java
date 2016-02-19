package kz.idsoftware.yandex;

import kz.idsoftware.yandex.pdd.YandexDomainService;
import kz.idsoftware.yandex.pdd.YandexDomainServiceAdapter;
import kz.idsoftware.yandex.pdd.domain.DetailsResponse;
import kz.idsoftware.yandex.pdd.domain.RegistrationStatusResponse;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

public class AppTest {

  private String token = "${pddToken}";

  private YandexDomainService domainService;

  @Before
  public void setup() {
    domainService = YandexDomainServiceAdapter.getYandexService(token);
  }

  @Test
  public void testDomainCheck() throws IOException {
    String domain = "idsoftware.kz";

    Call<RegistrationStatusResponse> call = domainService.registrationStatus(domain);
    Response<RegistrationStatusResponse> callResponse = call.execute();
    RegistrationStatusResponse registrationStatusResponse = callResponse.body();
    Assert.assertNotNull(registrationStatusResponse);
    Assert.assertEquals(domain, registrationStatusResponse.getDomain());
    System.out.println(registrationStatusResponse.getCheckResult());
    System.out.println(registrationStatusResponse.getNextCheck());
  }

  @Test
  public void testDetails() throws IOException {
    String domain = "idsoftware.kz";

    Call<DetailsResponse> call = domainService.details(domain);

    Response<DetailsResponse> callResponse = call.execute();
    DetailsResponse detailsResponse = callResponse.body();
    Assert.assertNotNull(detailsResponse);

  }
}
