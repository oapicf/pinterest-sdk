package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Error
import org.openapitools.model.KeywordUpdateBody
import org.openapitools.model.KeywordsGet200Response
import org.openapitools.model.KeywordsMetricsArrayResponse
import org.openapitools.model.KeywordsRequest
import org.openapitools.model.KeywordsResponse
import org.openapitools.model.MatchType
import org.openapitools.model.TrendType
import org.openapitools.model.TrendingKeywordsResponse
import org.openapitools.model.TrendsSupportedRegion

class KeywordsApi {
    String basePath = "https://api.pinterest.com/v5"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def countryKeywordsMetricsGet ( String adAccountId, String countryCode, List<String> keywords, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/keywords/metrics"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }
        // verify required params are set
        if (countryCode == null) {
            throw new RuntimeException("missing required params countryCode")
        }
        // verify required params are set
        if (keywords == null) {
            throw new RuntimeException("missing required params keywords")
        }

        if (countryCode != null) {
            queryParams.put("country_code", countryCode)
        }
        if (keywords != null) {
            queryParams.put("keywords", keywords)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    KeywordsMetricsArrayResponse.class )

    }

    def keywordsCreate ( String adAccountId, KeywordsRequest keywordsRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/keywords"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }
        // verify required params are set
        if (keywordsRequest == null) {
            throw new RuntimeException("missing required params keywordsRequest")
        }



        contentType = 'application/json';
        bodyParams = keywordsRequest


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "POST", "",
                    KeywordsResponse.class )

    }

    def keywordsGet ( String adAccountId, String campaignId, String adGroupId, List<MatchType> matchTypes, Integer pageSize, String bookmark, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/keywords"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }

        if (campaignId != null) {
            queryParams.put("campaign_id", campaignId)
        }
        if (adGroupId != null) {
            queryParams.put("ad_group_id", adGroupId)
        }
        if (matchTypes != null) {
            queryParams.put("match_types", matchTypes)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }
        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    KeywordsGet200Response.class )

    }

    def keywordsUpdate ( String adAccountId, KeywordUpdateBody keywordUpdateBody, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/keywords"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }
        // verify required params are set
        if (keywordUpdateBody == null) {
            throw new RuntimeException("missing required params keywordUpdateBody")
        }



        contentType = 'application/json';
        bodyParams = keywordUpdateBody


        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "PATCH", "",
                    KeywordsResponse.class )

    }

    def trendingKeywordsList ( TrendsSupportedRegion region, TrendType trendType, List<String> interests, List<String> genders, List<String> ages, Boolean normalizeAgainstGroup, Integer limit, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/trends/keywords/${region}/top/${trend_type}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (region == null) {
            throw new RuntimeException("missing required params region")
        }
        // verify required params are set
        if (trendType == null) {
            throw new RuntimeException("missing required params trendType")
        }

        if (interests != null) {
            queryParams.put("interests", interests)
        }
        if (genders != null) {
            queryParams.put("genders", genders)
        }
        if (ages != null) {
            queryParams.put("ages", ages)
        }
        if (normalizeAgainstGroup != null) {
            queryParams.put("normalize_against_group", normalizeAgainstGroup)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    TrendingKeywordsResponse.class )

    }

}
