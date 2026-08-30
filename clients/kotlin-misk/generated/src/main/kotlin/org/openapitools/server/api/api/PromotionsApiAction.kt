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
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.PinterestLibPaginationOrder
import org.openapitools.server.api.model.Promotion
import org.openapitools.server.api.model.PromotionBatchUpdate
import org.openapitools.server.api.model.PromotionCreate
import org.openapitools.server.api.model.PromotionsList200Response
import org.openapitools.server.api.model.PromotionsResponse

/**
* @TODO("Fill out implementation")
*/
@Singleton
class PromotionsApiAction @Inject constructor(
) : WebAction {

    @Post("/ad_accounts/{ad_account_id}/promotions")
    @Description("Create promotions")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun promotionsCreate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Valid@Size(min=1,max=30)  @RequestBody promotionCreate: kotlin.collections.List<PromotionCreate>
    ): PromotionsResponse {
        TODO()
    }

    @Delete("/ad_accounts/{ad_account_id}/promotions/{promotion_id}")
    @Description("Delete promotion by id")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun promotionsDelete(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("promotion_id") promotionId: kotlin.String, 
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String
    ): Promotion {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/promotions/{promotion_id}")
    @Description("Get promotion by id")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun promotionsGet(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("promotion_id") promotionId: kotlin.String, 
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String
    ): Promotion {
        TODO()
    }

    @Get("/ad_accounts/{ad_account_id}/promotions")
    @Description("Get promotions")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun promotionsList(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int, 
         @QueryParam(value = "order") order: PinterestLibPaginationOrder?
    ): PromotionsList200Response {
        TODO()
    }

    @Patch("/ad_accounts/{ad_account_id}/promotions")
    @Description("Update promotions")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun promotionsUpdate(
        @Pattern(regexp="^\\d+$") @Size(max=18) @PathParam("ad_account_id") adAccountId: kotlin.String, 
        @Valid@Size(min=1,max=30)  @RequestBody promotionBatchUpdate: kotlin.collections.List<PromotionBatchUpdate>
    ): PromotionsResponse {
        TODO()
    }
}
