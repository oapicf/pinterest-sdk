package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Error;
import org.openapitools.server.api.model.KeywordUpdateBody;
import org.openapitools.server.api.model.KeywordsGet200Response;
import org.openapitools.server.api.model.KeywordsMetricsArrayResponse;
import org.openapitools.server.api.model.KeywordsRequest;
import org.openapitools.server.api.model.KeywordsResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.MatchType;
import org.openapitools.server.api.model.TrendType;
import org.openapitools.server.api.model.TrendingKeywordsResponse;
import org.openapitools.server.api.model.TrendsSupportedRegion;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface KeywordsApi  {
    //country_keywords_metrics/get
    void countryKeywordsMetricsGet(String adAccountId, String countryCode, List<String> keywords, Handler<AsyncResult<KeywordsMetricsArrayResponse>> handler);

    //keywords/create
    void keywordsCreate(String adAccountId, KeywordsRequest keywordsRequest, Handler<AsyncResult<KeywordsResponse>> handler);

    //keywords/get
    void keywordsGet(String adAccountId, String campaignId, String adGroupId, List<MatchType> matchTypes, Integer pageSize, String bookmark, Handler<AsyncResult<KeywordsGet200Response>> handler);

    //keywords/update
    void keywordsUpdate(String adAccountId, KeywordUpdateBody keywordUpdateBody, Handler<AsyncResult<KeywordsResponse>> handler);

    //trending_keywords/list
    void trendingKeywordsList(TrendsSupportedRegion region, TrendType trendType, List<String> interests, List<String> genders, List<String> ages, Boolean normalizeAgainstGroup, Integer limit, Handler<AsyncResult<TrendingKeywordsResponse>> handler);

}
