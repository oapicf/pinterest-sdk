package org.openapitools.server.api.api

import jakarta.inject.Inject
import jakarta.inject.Singleton
import jakarta.validation.Valid
import jakarta.validation.constraints.DecimalMax
import jakarta.validation.constraints.DecimalMin
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.Max
import jakarta.validation.constraints.Min
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Pattern
import jakarta.validation.constraints.Size
import misk.web.actions.WebAction
import misk.web.interceptors.LogRequestResponse
import misk.web.Delete
import misk.web.Description
import misk.web.Get
import misk.web.HttpCall
import misk.web.Patch
import misk.web.PathParam
import misk.web.Post
import misk.web.Put
import misk.web.QueryParam
import misk.web.RequestBody
import misk.web.RequestContentType
import misk.web.RequestHeader
import misk.web.Response
import misk.web.ResponseContentType
import misk.web.mediatype.MediaTypes
import org.openapitools.server.api.model.Keywords
import org.openapitools.server.api.model.KeywordsCreate
import org.openapitools.server.api.model.KeywordsGet200Response
import org.openapitools.server.api.model.KeywordsMetricsArrayResponse
import org.openapitools.server.api.model.KeywordsUpdate
import org.openapitools.server.api.model.MatchType
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.TrendType
import org.openapitools.server.api.model.TrendingKeywordsResponse
import org.openapitools.server.api.model.TrendsAgeBucket
import org.openapitools.server.api.model.TrendsGenderFilter
import org.openapitools.server.api.model.TrendsL1Interest
import org.openapitools.server.api.model.TrendsSupportedRegion

/**
* @TODO("Fill out implementation")
*/
@Singleton
class KeywordsApiAction @Inject constructor(
) : WebAction {

    @Get("/ad_accounts/{ad_account_id}/keywords/metrics")
    @Description("Get country's keyword metrics")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun countryKeywordsMetricsGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
         @QueryParam(value = "country_code") countryCode: kotlin.String, 
         @QueryParam(value = "keywords") keywords: kotlin.collections.List<kotlin.String>
    ): KeywordsMetricsArrayResponse {
        TODO()
    }

    @Post("/ad_accounts/{ad_account_id}/keywords")
    @Description("Create keywords")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun keywordsCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Valid @RequestBody keywordsCreate: KeywordsCreate
    ): Keywords {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/keywords")
    @Description("Get keywords")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun keywordsGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
         @QueryParam(value = "campaign_id") campaignId: kotlin.String?, 
         @QueryParam(value = "ad_group_id") adGroupId: kotlin.String?, 
         @QueryParam(value = "ad_group_ids") adGroupIds: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "match_types") matchTypes: kotlin.collections.List<MatchType>?, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int
    ): KeywordsGet200Response {
        TODO()
    }

    @Patch("/ad_accounts/{ad_account_id}/keywords")
    @Description("Update keywords")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun keywordsUpdate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Valid @RequestBody keywordsUpdate: KeywordsUpdate
    ): Keywords {
        TODO()
    }

    @Get("/trends/keywords/{region}/top/{trend_type}")
    @Description("List trending keywords")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun trendingKeywordsList(
        @PathParam("region") region: TrendsSupportedRegion, 
        @PathParam("trend_type") trendType: TrendType, 
         @QueryParam(value = "interests") interests: kotlin.collections.List<TrendsL1Interest>?, 
         @QueryParam(value = "genders") genders: kotlin.collections.List<TrendsGenderFilter>?, 
         @QueryParam(value = "ages") ages: kotlin.collections.List<TrendsAgeBucket>?, 
         @QueryParam(value = "include_keywords") includeKeywords: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "normalize_against_group") normalizeAgainstGroup: kotlin.Boolean, 
         @QueryParam(value = "limit") limit: kotlin.Int, 
         @QueryParam(value = "include_demographics") includeDemographics: kotlin.Boolean
    ): TrendingKeywordsResponse {
        TODO()
    }
}
