package kz.idsoftware.yandex.pdd;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;

public class YandexDomainServiceAdapter {

  private static final String endpoint = "https://pddimp.yandex.ru";

  private static final String PddTokenHeader = "PddToken";

  public static YandexDomainService getYandexService(final String token) {
    HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
    httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

    OkHttpClient client = new OkHttpClient
            .Builder()
            .addInterceptor(new Interceptor() {
              public Response intercept(Chain chain) throws IOException {
                Request newRequest = chain.request().newBuilder().addHeader(PddTokenHeader, token).build();
                return chain.proceed(newRequest);
              }
            })
            .addInterceptor(httpLoggingInterceptor)
            .build();

    Retrofit.Builder builder = new Retrofit
            .Builder()
            .baseUrl(endpoint)
            .addConverterFactory(GsonConverterFactory.create())
            .client(client);
    Retrofit retrofit = builder.build();

    YandexDomainService yandexDomainService = retrofit.create(YandexDomainService.class);
    return yandexDomainService;
  }

}
