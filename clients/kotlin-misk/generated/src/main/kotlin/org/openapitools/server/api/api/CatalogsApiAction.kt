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
import org.openapitools.server.api.model.Catalog
import org.openapitools.server.api.model.CatalogCreate
import org.openapitools.server.api.model.CatalogsAvailableFilterValues
import org.openapitools.server.api.model.CatalogsList200Response
import org.openapitools.server.api.model.CatalogsLocale
import org.openapitools.server.api.model.Country
import org.openapitools.server.api.model.PinterestLibError

/**
* @TODO("Fill out implementation")
*/
@Singleton
class CatalogsApiAction @Inject constructor(
) : WebAction {

    @Get("/catalogs/available_filter_values")
    @Description("List available filter values")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun catalogsAvailableFilterValues(
         @QueryParam(value = "catalog_id") catalogId: kotlin.String, 
         @QueryParam(value = "feed_id") feedId: kotlin.String?, 
         @QueryParam(value = "country") country: Country?, 
         @QueryParam(value = "language") language: CatalogsLocale?, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): CatalogsAvailableFilterValues {
        TODO()
    }

    @Post("/catalogs")
    @Description("Create catalog")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun catalogsCreate(
        @Valid @RequestBody catalogCreate: CatalogCreate, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): Catalog {
        TODO()
    }

    @Get("/catalogs")
    @Description("List catalogs")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun catalogsList(
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int
    ): CatalogsList200Response {
        TODO()
    }
}
