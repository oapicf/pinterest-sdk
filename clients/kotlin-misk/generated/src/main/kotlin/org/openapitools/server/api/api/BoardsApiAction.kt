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
import org.openapitools.server.api.model.Board
import org.openapitools.server.api.model.BoardCreate
import org.openapitools.server.api.model.BoardPrivacyFilter
import org.openapitools.server.api.model.BoardSection
import org.openapitools.server.api.model.BoardSectionCreate
import org.openapitools.server.api.model.BoardSectionUpdateWithRequiredBody
import org.openapitools.server.api.model.BoardSectionsList200Response
import org.openapitools.server.api.model.BoardWithUpdatePrivacy
import org.openapitools.server.api.model.BoardWithUpdatePrivacyUpdate
import org.openapitools.server.api.model.BoardsList200Response
import org.openapitools.server.api.model.BoardsListPins200Response
import org.openapitools.server.api.model.CreativeType
import org.openapitools.server.api.model.PinterestLibError

/**
* @TODO("Fill out implementation")
*/
@Singleton
class BoardsApiAction @Inject constructor(
) : WebAction {

    @Post("/boards/{board_id}/sections")
    @Description("Create board section")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun boardSectionsCreate(
        @Pattern(regexp="^\\d+$") @PathParam("board_id") boardId: kotlin.String, 
        @Valid @RequestBody boardSectionCreate: BoardSectionCreate, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): BoardSection {
        TODO()
    }

    @Delete("/boards/{board_id}/sections/{section_id}")
    @Description("Delete board section")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun boardSectionsDelete(
        @Pattern(regexp="^\\d+$") @PathParam("board_id") boardId: kotlin.String, 
        @Pattern(regexp="^\\d+$") @PathParam("section_id") sectionId: kotlin.String, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): BoardSection {
        TODO()
    }

    @Get("/boards/{board_id}/sections")
    @Description("List board sections")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun boardSectionsList(
        @Pattern(regexp="^\\d+$") @PathParam("board_id") boardId: kotlin.String, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int
    ): BoardSectionsList200Response {
        TODO()
    }

    @Get("/boards/{board_id}/sections/{section_id}/pins")
    @Description("List Pins on board section")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun boardSectionsListPins(
        @Pattern(regexp="^\\d+$") @PathParam("board_id") boardId: kotlin.String, 
        @Pattern(regexp="^\\d+$") @PathParam("section_id") sectionId: kotlin.String, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int
    ): BoardsListPins200Response {
        TODO()
    }

    @Patch("/boards/{board_id}/sections/{section_id}")
    @Description("Update board section")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun boardSectionsUpdate(
        @Pattern(regexp="^\\d+$") @PathParam("board_id") boardId: kotlin.String, 
        @Pattern(regexp="^\\d+$") @PathParam("section_id") sectionId: kotlin.String, 
        @Valid @RequestBody boardSectionUpdateWithRequiredBody: BoardSectionUpdateWithRequiredBody, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): BoardSection {
        TODO()
    }

    @Post("/boards")
    @Description("Create board")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun boardsCreate(
        @Valid @RequestBody boardCreate: BoardCreate, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): Board {
        TODO()
    }

    @Delete("/boards/{board_id}")
    @Description("Delete board")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun boardsDelete(
        @Pattern(regexp="^\\d+$") @PathParam("board_id") boardId: kotlin.String, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): Board {
        TODO()
    }

    @Get("/boards/{board_id}")
    @Description("Get board")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun boardsGet(
        @Pattern(regexp="^\\d+$") @PathParam("board_id") boardId: kotlin.String, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): Board {
        TODO()
    }

    @Get("/boards")
    @Description("List boards")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun boardsList(
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?, 
         @QueryParam(value = "privacy") privacy: BoardPrivacyFilter?, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int
    ): BoardsList200Response {
        TODO()
    }

    @Get("/boards/{board_id}/pins")
    @Description("List Pins on board")
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun boardsListPins(
        @Pattern(regexp="^\\d+$") @PathParam("board_id") boardId: kotlin.String, 
         @QueryParam(value = "creative_types") creativeTypes: kotlin.collections.List<CreativeType>?, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?, 
         @QueryParam(value = "pin_metrics") pinMetrics: kotlin.Boolean, 
         @QueryParam(value = "bookmark") bookmark: kotlin.String?, 
         @QueryParam(value = "page_size") pageSize: kotlin.Int
    ): BoardsListPins200Response {
        TODO()
    }

    @Patch("/boards/{board_id}")
    @Description("Update board")
    @RequestContentType(MediaTypes.APPLICATION_JSON)
    @ResponseContentType(MediaTypes.APPLICATION_JSON)
    @LogRequestResponse(bodySampling = 1.0, errorBodySampling = 1.0)
    fun boardsUpdate(
        @Pattern(regexp="^\\d+$") @PathParam("board_id") boardId: kotlin.String, 
        @Valid @RequestBody boardWithUpdatePrivacyUpdate: BoardWithUpdatePrivacyUpdate, 
         @QueryParam(value = "ad_account_id") adAccountId: kotlin.String?
    ): BoardWithUpdatePrivacy {
        TODO()
    }
}
