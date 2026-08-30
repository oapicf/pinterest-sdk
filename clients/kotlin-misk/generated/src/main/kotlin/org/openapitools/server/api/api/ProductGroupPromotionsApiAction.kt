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
import org.openapitools.server.api.model.EntityStatus
import org.openapitools.server.api.model.Granularity
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.PinterestLibPaginationOrder
import org.openapitools.server.api.model.ProductGroupAnalyticsItems
import org.openapitools.server.api.model.ProductGroupPromotion
import org.openapitools.server.api.model.ProductGroupPromotions
import org.openapitools.server.api.model.ProductGroupPromotionsCreate
import org.openapitools.server.api.model.ProductGroupPromotionsList200Response
import org.openapitools.server.api.model.ProductGroupPromotionsUpdateWithRequiredBody
import org.openapitools.server.api.model.ReportingColumnSync
import org.openapitools.server.api.model.ReportingTimeZone

/**
* @TODO("Fill out implementation")
*/
@Singleton
class ProductGroupPromotionsApiAction @Inject constructor(
) : WebAction {

    @Post("/ad_accounts/{ad_account_id}/product_group_promotions")
    @Description("Create product group promotions")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun productGroupPromotionsCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Valid @RequestBody productGroupPromotionsCreate: ProductGroupPromotionsCreate
    ): ProductGroupPromotions {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}")
    @Description("Get a product group promotion by id")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun productGroupPromotionsGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("product_group_promotion_id") productGroupPromotionId: kotlin.String
    ): ProductGroupPromotion {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/product_group_promotions")
    @Description("Get product group promotions")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun productGroupPromotionsList(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int, 
         @QueryParam(value = "order") order: PinterestLibPaginationOrder?, 
         @QueryParam(value = "product_group_promotion_ids") productGroupPromotionIds: kotlin.collections.List<kotlin.String>?, 
         @QueryParam(value = "entity_statuses") entityStatuses: kotlin.collections.List<EntityStatus>, 
         @QueryParam(value = "ad_group_id") adGroupId: kotlin.String?
    ): ProductGroupPromotionsList200Response {
        TODO()
    }

    @Patch("/ad_accounts/{ad_account_id}/product_group_promotions")
    @Description("Update product group promotions")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun productGroupPromotionsUpdate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Valid @RequestBody productGroupPromotionsUpdateWithRequiredBody: ProductGroupPromotionsUpdateWithRequiredBody
    ): ProductGroupPromotions {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/product_groups/analytics")
    @Description("Get product group analytics")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun productGroupsAnalytics(
         @QueryParam(value = "start_date") startDate: java.time.LocalDate, 
         @QueryParam(value = "end_date") endDate: java.time.LocalDate, 
         @QueryParam(value = "product_group_ids") productGroupIds: kotlin.collections.List<kotlin.String>, 
         @QueryParam(value = "columns") columns: kotlin.collections.List<ReportingColumnSync>, 
         @QueryParam(value = "granularity") granularity: Granularity, 
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
         @QueryParam(value = "click_window_days") clickWindowDays: java.math.BigDecimal, 
         @QueryParam(value = "engagement_window_days") engagementWindowDays: java.math.BigDecimal, 
         @QueryParam(value = "view_window_days") viewWindowDays: java.math.BigDecimal, 
         @QueryParam(value = "conversion_report_time") conversionReportTime: kotlin.String, 
         @QueryParam(value = "reporting_timezone") reportingTimezone: ReportingTimeZone?
    ): kotlin.collections.List<ProductGroupAnalyticsItems> {
        TODO()
    }
}
