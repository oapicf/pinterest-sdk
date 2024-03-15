package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.TermsOfService;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface TermsOfServiceApi  {
    //terms_of_service/get
    void termsOfServiceGet(String adAccountId, Boolean includeHtml, String tosType, Handler<AsyncResult<TermsOfService>> handler);

}
