package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.RelatedTerms;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface TermsApi  {
    //terms_related/list
    void termsRelatedList(List<String> terms, Handler<AsyncResult<RelatedTerms>> handler);

    //terms_suggested/list
    void termsSuggestedList(String term, Integer limit, Handler<AsyncResult<List<String>>> handler);

}
