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
import org.openapitools.server.api.model.BoardsList200Response
import org.openapitools.server.api.model.PinsList200Response
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.SearchPartnerPins200Response

/**
* @TODO("Fill out implementation")
*/
@Singleton
class SearchApiAction @Inject constructor(
) : WebAction {

    @Get("/search/partner/pins")
    @Description("Search pins by a given search term")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun searchPartnerPins(
         @QueryParam(value = "term") term: kotlin.String, 
         @QueryParam(value = "country_code") countryCode: kotlin.String, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "locale") locale: kotlin.String?, 
         @QueryParam(value = "limit") limit: kotlin.Int
    ): SearchPartnerPins200Response {
        TODO()
    }

    @Get("/search/boards")
    @Description("Search user's boards")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun searchUserBoardsGet(
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?, 
         @QueryParam(value = "query") query: kotlin.String?, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int
    ): BoardsList200Response {
        TODO()
    }

    @Get("/search/pins")
    @Description("Search user's Pins")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun searchUserPinsList(
         @QueryParam(value = "query") query: kotlin.String, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?
    ): PinsList200Response {
        TODO()
    }
}
