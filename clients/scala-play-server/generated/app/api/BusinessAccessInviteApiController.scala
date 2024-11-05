package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.AuthRespondInvitesBody
import model.CancelInvitesBody
import model.CreateAssetAccessRequestBody
import model.CreateAssetAccessRequestResponse
import model.CreateAssetInvitesRequest
import model.CreateInvitesResultsResponseArray
import model.CreateMembershipOrPartnershipInvitesBody
import model.DeleteInvitesResultsResponseArray
import model.Error
import model.GetInvites200Response
import model.InviteType
import model.RespondToInvitesResponseArray
import model.UpdateInvitesResultsResponseArray

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Singleton
class BusinessAccessInviteApiController @Inject()(cc: ControllerComponents, api: BusinessAccessInviteApi) extends AbstractController(cc) {
  /**
    * POST /v5/businesses/:businessId/requests/assets/access
    * @param businessId Unique identifier of the requesting business.
    */
  def assetAccessRequestsCreate(businessId: String): Action[AnyContent] = Action { request =>
    def executeApi(): CreateAssetAccessRequestResponse = {
      val createAssetAccessRequestBody = request.body.asJson.map(_.as[CreateAssetAccessRequestBody]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "createAssetAccessRequestBody")
      }
      api.assetAccessRequestsCreate(businessId, createAssetAccessRequestBody)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /v5/businesses/:businessId/invites
    * @param businessId Business id
    */
  def cancelInvitesOrRequests(businessId: String): Action[AnyContent] = Action { request =>
    def executeApi(): DeleteInvitesResultsResponseArray = {
      val cancelInvitesBody = request.body.asJson.map(_.as[CancelInvitesBody]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "cancelInvitesBody")
      }
      api.cancelInvitesOrRequests(businessId, cancelInvitesBody)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/businesses/:businessId/invites/assets/access
    * @param businessId Unique identifier of the requesting business.
    */
  def createAssetInvites(businessId: String): Action[AnyContent] = Action { request =>
    def executeApi(): UpdateInvitesResultsResponseArray = {
      val createAssetInvitesRequest = request.body.asJson.map(_.as[CreateAssetInvitesRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "createAssetInvitesRequest")
      }
      api.createAssetInvites(businessId, createAssetInvitesRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/businesses/:businessId/invites
    * @param businessId Business id
    */
  def createMembershipOrPartnershipInvites(businessId: String): Action[AnyContent] = Action { request =>
    def executeApi(): CreateInvitesResultsResponseArray = {
      val createMembershipOrPartnershipInvitesBody = request.body.asJson.map(_.as[CreateMembershipOrPartnershipInvitesBody]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "createMembershipOrPartnershipInvitesBody")
      }
      api.createMembershipOrPartnershipInvites(businessId, createMembershipOrPartnershipInvitesBody)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/businesses/:businessId/invites?isMember=[value]&inviteStatus=[value]&inviteType=[value]&bookmark=[value]&pageSize=[value]
    * @param businessId Unique identifier of the requesting business.
    */
  def getInvites(businessId: String): Action[AnyContent] = Action { request =>
    def executeApi(): GetInvites200Response = {
      val isMember = request.getQueryString("is_member")
        .map(value => value.toBoolean)
        
      val inviteStatus = request.queryString.get("invite_status")
        .map(_.toList)
        
      val inviteType = request.getQueryString("invite_type")
        .map(value => )
        
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      api.getInvites(businessId, isMember, inviteStatus, inviteType, bookmark, pageSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /v5/businesses/invites
    */
  def respondBusinessAccessInvites(): Action[AnyContent] = Action { request =>
    def executeApi(): RespondToInvitesResponseArray = {
      val authRespondInvitesBody = request.body.asJson.map(_.as[AuthRespondInvitesBody]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "authRespondInvitesBody")
      }
      api.respondBusinessAccessInvites(authRespondInvitesBody)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  private def splitCollectionParam(paramValues: String, collectionFormat: String): List[String] = {
    val splitBy =
      collectionFormat match {
        case "csv" => ",+"
        case "tsv" => "\t+"
        case "ssv" => " +"
        case "pipes" => "|+"
      }

    paramValues.split(splitBy).toList
  }
}
