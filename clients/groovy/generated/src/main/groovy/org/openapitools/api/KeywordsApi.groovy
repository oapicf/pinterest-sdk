package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Keywords
import org.openapitools.model.KeywordsCreate
import org.openapitools.model.KeywordsGet200Response
import org.openapitools.model.KeywordsMetricsArrayResponse
import org.openapitools.model.KeywordsUpdate
import org.openapitools.model.MatchType
import org.openapitools.model.PinterestLibError
import org.openapitools.model.TrendType
import org.openapitools.model.TrendingKeywordsResponse
import org.openapitools.model.TrendsAgeBucket
import org.openapitools.model.TrendsGenderFilter
import org.openapitools.model.TrendsL1Interest
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
        def accept
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




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    KeywordsMetricsArrayResponse.class )

    }

    def keywordsCreate ( String adAccountId, KeywordsCreate keywordsCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/keywords"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }
        // verify required params are set
        if (keywordsCreate == null) {
            throw new RuntimeException("missing required params keywordsCreate")
        }



        contentType = 'application/json';
        bodyParams = keywordsCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Keywords.class )

    }

    def keywordsGet ( String adAccountId, String campaignId, String adGroupId, List<String> adGroupIds, List<MatchType> matchTypes, String bookmark, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/keywords"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
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
        if (adGroupIds != null) {
            queryParams.put("ad_group_ids", adGroupIds)
        }
        if (matchTypes != null) {
            queryParams.put("match_types", matchTypes)
        }
        if (bookmark != null) {
            queryParams.put("bookmark", bookmark)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    KeywordsGet200Response.class )

    }

    def keywordsUpdate ( String adAccountId, KeywordsUpdate keywordsUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/ad_accounts/${ad_account_id}/keywords"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (adAccountId == null) {
            throw new RuntimeException("missing required params adAccountId")
        }
        // verify required params are set
        if (keywordsUpdate == null) {
            throw new RuntimeException("missing required params keywordsUpdate")
        }



        contentType = 'application/json';
        bodyParams = keywordsUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PATCH", "",
                    Keywords.class )

    }

    def trendingKeywordsList ( TrendsSupportedRegion region, TrendType trendType, List<TrendsL1Interest> interests, List<TrendsGenderFilter> genders, List<TrendsAgeBucket> ages, List<String> includeKeywords, Boolean normalizeAgainstGroup, Integer limit, Boolean includeDemographics, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/trends/keywords/${region}/top/${trend_type}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
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
        if (includeKeywords != null) {
            queryParams.put("include_keywords", includeKeywords)
        }
        if (normalizeAgainstGroup != null) {
            queryParams.put("normalize_against_group", normalizeAgainstGroup)
        }
        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (includeDemographics != null) {
            queryParams.put("include_demographics", includeDemographics)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    TrendingKeywordsResponse.class )

    }

}
