package io.github.liuziyuan.quarkus.easyretrofit.integration.sample;


import io.github.easyretrofit.core.annotation.RetrofitBuilder;
import io.github.liuziyuan.quarkus.easy.retrofit.integration.runtime.PrintInfo;

/**
 * <p><b>Base URLs should always end in {@code /}.</b>
 * <p><b>Endpoint values which contain a leading {@code /} are absolute.</b>
 *
 * @author liuziyuan
 */
@PrintInfo(value = "info: ")
@RetrofitBuilder(baseUrl = "http://localhost:8081/")
public interface BaseApi {
}
