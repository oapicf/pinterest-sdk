package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.RelatedTerms;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface TermsApi  {
    Future<ApiResponse<RelatedTerms>> termsRelatedList(List<String> terms);
    Future<ApiResponse<List<String>>> termsSuggestedList(String term, Integer limit);
}
