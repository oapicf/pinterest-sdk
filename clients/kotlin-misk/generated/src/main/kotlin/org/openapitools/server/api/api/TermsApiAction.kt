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
import org.openapitools.server.api.model.RelatedTerms

/**
* @TODO("Fill out implementation")
*/
@Singleton
class TermsApiAction @Inject constructor(
) : WebAction {

    @Get("/terms/related")
    @Description("List related terms")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun termsRelatedList(
         @QueryParam(value = "terms") terms: kotlin.collections.List<kotlin.String>
    ): RelatedTerms {
        TODO()
    }

    @Get("/terms/suggested")
    @Description("List suggested terms")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun termsSuggestedList(
         @QueryParam(value = "term") term: kotlin.String, 
         @QueryParam(value = "limit") limit: kotlin.Int
    ): kotlin.collections.List<kotlin.String> {
        TODO()
    }
}
