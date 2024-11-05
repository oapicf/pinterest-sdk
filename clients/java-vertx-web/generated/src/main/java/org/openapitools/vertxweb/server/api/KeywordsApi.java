package org.openapitools.vertxweb.server.api;

import org.openapitools.vertxweb.server.model.Error;
import org.openapitools.vertxweb.server.model.KeywordUpdateBody;
import org.openapitools.vertxweb.server.model.KeywordsGet200Response;
import org.openapitools.vertxweb.server.model.KeywordsMetricsArrayResponse;
import org.openapitools.vertxweb.server.model.KeywordsRequest;
import org.openapitools.vertxweb.server.model.KeywordsResponse;
import org.openapitools.vertxweb.server.model.MatchType;
import org.openapitools.vertxweb.server.model.TrendType;
import org.openapitools.vertxweb.server.model.TrendingKeywordsResponse;
import org.openapitools.vertxweb.server.model.TrendsSupportedRegion;

import org.openapitools.vertxweb.server.ApiResponse;

import io.vertx.core.Future;
import io.vertx.core.json.JsonObject;

import java.util.List;
import java.util.Map;

public interface KeywordsApi  {
    Future<ApiResponse<KeywordsMetricsArrayResponse>> countryKeywordsMetricsGet(String adAccountId, String countryCode, List<String> keywords);
    Future<ApiResponse<KeywordsResponse>> keywordsCreate(String adAccountId, KeywordsRequest keywordsRequest);
    Future<ApiResponse<KeywordsGet200Response>> keywordsGet(String adAccountId, String campaignId, String adGroupId, List<MatchType> matchTypes, Integer pageSize, String bookmark);
    Future<ApiResponse<KeywordsResponse>> keywordsUpdate(String adAccountId, KeywordUpdateBody keywordUpdateBody);
    Future<ApiResponse<TrendingKeywordsResponse>> trendingKeywordsList(TrendsSupportedRegion region, TrendType trendType, List<String> interests, List<String> genders, List<String> ages, List<String> includeKeywords, Boolean normalizeAgainstGroup, Integer limit);
}
