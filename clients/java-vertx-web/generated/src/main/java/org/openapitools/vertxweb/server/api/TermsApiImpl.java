package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.RelatedTerms;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.handler.HttpException;

import java.util.List;
import java.util.Map;

// Implement this class

public class TermsApiImpl implements TermsApi {
    public Future<ApiResponse<RelatedTerms>> termsRelatedList(List<String> terms) {
        return Future.failedFuture(new HttpException(501));
    }

    public Future<ApiResponse<List<String>>> termsSuggestedList(String term, Integer limit) {
        return Future.failedFuture(new HttpException(501));
    }

}
