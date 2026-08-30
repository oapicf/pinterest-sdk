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
import org.openapitools.server.api.model.AdvancedAuctionItems
import org.openapitools.server.api.model.AdvancedAuctionItemsGetRequest
import org.openapitools.server.api.model.AdvancedAuctionItemsSubmitRequest
import org.openapitools.server.api.model.AdvancedAuctionProcessedItems
import org.openapitools.server.api.model.PinterestLibError

/**
* @TODO("Fill out implementation")
*/
@Singleton
class AdvancedAuctionApiAction @Inject constructor(
) : WebAction {

    @Post("/advanced_auction/items/get")
    @Description("Get item bid options (POST)")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun advancedAuctionItemsGetPost(
        @Valid @RequestBody advancedAuctionItemsGetRequest: AdvancedAuctionItemsGetRequest, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): AdvancedAuctionItems {
        TODO()
    }

    @Post("/advanced_auction/items/submit")
    @Description("Operate on item level bid options")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun advancedAuctionItemsSubmitPost(
        @Valid @RequestBody advancedAuctionItemsSubmitRequest: AdvancedAuctionItemsSubmitRequest, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): AdvancedAuctionProcessedItems {
        TODO()
    }
}
