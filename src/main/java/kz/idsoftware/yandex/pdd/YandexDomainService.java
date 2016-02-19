package kz.idsoftware.yandex.pdd;

import kz.idsoftware.yandex.pdd.domain.DeleteResponse;
import kz.idsoftware.yandex.pdd.domain.DetailsResponse;
import kz.idsoftware.yandex.pdd.domain.RegisterResponse;
import kz.idsoftware.yandex.pdd.domain.RegistrationStatusResponse;
import kz.idsoftware.yandex.pdd.domain.SetCountryResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface YandexDomainService {

  @POST("/api2/admin/domain/register")
  public RegisterResponse register(String domain);

  @GET("/api2/admin/domain/registration_status")
  public Call<RegistrationStatusResponse> registrationStatus(@Query("domain") String domain);

  @GET("/api2/admin/domain/details")
  public Call<DetailsResponse> details(@Query("domain") String domain);

  @POST("/api2/admin/domain/delete")
  public DeleteResponse deleteDomain(String domain);

  @POST("/api2/admin/domain/settings/set_country")
  public SetCountryResponse setCountry(String domain, String country);

}
