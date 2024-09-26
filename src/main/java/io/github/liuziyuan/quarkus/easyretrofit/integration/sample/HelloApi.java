package io.github.liuziyuan.quarkus.easyretrofit.integration.sample;


import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * <p><b>Base URLs should always end in {@code /}.</b>
 * <p><b>Endpoint values which contain a leading {@code /} are absolute.</b>
 *
 * @author liuziyuan
 */
public interface HelloApi extends BaseApi{

    @GET("/api/hello")
    Call<ResponseBody> hello();
}
