package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.TermsOfService;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class TermsOfServiceApiImpl implements TermsOfServiceApi {
    public Future<ApiResponse<TermsOfService>> termsOfServiceGet(String adAccountId, Boolean includeHtml, String tosType) {
        return Future.failedFuture(new HttpException(501));
    }

}
