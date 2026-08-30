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
import org.openapitools.server.api.model.IntegrationLogsInvalidLogResponse
import org.openapitools.server.api.model.IntegrationLogsRequestCreate
import org.openapitools.server.api.model.IntegrationLogsSuccessResponse
import org.openapitools.server.api.model.IntegrationMetadata
import org.openapitools.server.api.model.IntegrationMetadataCreate
import org.openapitools.server.api.model.IntegrationMetadataUpdate
import org.openapitools.server.api.model.IntegrationRecord
import org.openapitools.server.api.model.IntegrationsGetList200Response
import org.openapitools.server.api.model.PinterestLibError

/**
* @TODO("Fill out implementation")
*/
@Singleton
class IntegrationsApiAction @Inject constructor(
) : WebAction {

    @Delete("/integrations/commerce/{external_business_id}")
    @Description("Delete commerce integration")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun integrationsCommerceDel(
        @PathParam("external_business_id") externalBusinessId: kotlin.String
    ): IntegrationMetadata {
        TODO()
    }

    @Get("/integrations/commerce/{external_business_id}")
    @Description("Get commerce integration")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun integrationsCommerceGet(
        @PathParam("external_business_id") externalBusinessId: kotlin.String
    ): IntegrationMetadata {
        TODO()
    }

    @Patch("/integrations/commerce/{external_business_id}")
    @Description("Update commerce integration")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun integrationsCommercePatch(
        @PathParam("external_business_id") externalBusinessId: kotlin.String, 
        @Valid @RequestBody integrationMetadataUpdate: IntegrationMetadataUpdate
    ): IntegrationMetadata {
        TODO()
    }

    @Post("/integrations/commerce")
    @Description("Create commerce integration")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun integrationsCommercePost(
        @Valid @RequestBody integrationMetadataCreate: IntegrationMetadataCreate
    ): IntegrationMetadata {
        TODO()
    }

    @Get("/integrations/{id}")
    @Description("Get integration metadata")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun integrationsGetById(
        @Pattern(regexp="^\\d+$") @PathParam("id") id: kotlin.String
    ): IntegrationRecord {
        TODO()
    }

    @Get("/integrations")
    @Description("Get integration metadata list")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun integrationsGetList(
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int
    ): IntegrationsGetList200Response {
        TODO()
    }

    @Post("/integrations/logs")
    @Description("Receives batched logs from integration applications.")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun integrationsLogsPost(
        @Valid @RequestBody integrationLogsRequestCreate: IntegrationLogsRequestCreate
    ): IntegrationLogsSuccessResponse {
        TODO()
    }
}
