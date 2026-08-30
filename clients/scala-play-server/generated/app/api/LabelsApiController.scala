package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Error
import model.LabelCreateRequest
import model.LabelUpdateRequest
import model.LabeledEntities
import model.LabeledEntitiesCreate
import model.LabelsList200Response
import model.LabelsResponse
import model.QueryLabelEntityStatusesItems
import model.QueryLabelTypesItems

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Singleton
class LabelsApiController @Inject()(cc: ControllerComponents, api: LabelsApi) extends AbstractController(cc) {
  /**
    * POST /v5/ad_accounts/:adAccountId/labels/:labelId/apply
    * @param labelId Label ID.
    */
  def labelsApply(adAccountId: String, labelId: String): Action[AnyContent] = Action { request =>
    def executeApi(): LabeledEntities = {
      val labeledEntitiesCreate = request.body.asJson.map(_.as[LabeledEntitiesCreate]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "labeledEntitiesCreate")
      }
      api.labelsApply(adAccountId, labelId, labeledEntitiesCreate)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/ad_accounts/:adAccountId/labels
    * @param adAccountId Unique identifier of an ad account.
    */
  def labelsCreate(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): LabelsResponse = {
      val labelCreateRequest = request.body.asJson.map(_.as[LabelCreateRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "labelCreateRequest")
      }
      api.labelsCreate(adAccountId, labelCreateRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/labels?campaignIds=[value]&labelIds=[value]&entityStatuses=[value]&labelTypes=[value]&bookmark=[value]&pageSize=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def labelsList(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): LabelsList200Response = {
      val campaignIds = request.queryString.get("campaign_ids")
        .map(_.toList)
        
      val labelIds = request.queryString.get("label_ids")
        .map(_.toList)
        
      val entityStatuses = request.queryString.get("entity_statuses")
        .map(_.toList)
        .map(_.map(value => )
        
      val labelTypes = request.queryString.get("label_types")
        .map(_.toList)
        .map(_.map(value => )
        
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      api.labelsList(adAccountId, campaignIds, labelIds, entityStatuses, labelTypes, bookmark, pageSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/ad_accounts/:adAccountId/labels/:labelId/remove
    * @param labelId Label ID.
    */
  def labelsRemove(adAccountId: String, labelId: String): Action[AnyContent] = Action { request =>
    def executeApi(): LabeledEntities = {
      val labeledEntitiesCreate = request.body.asJson.map(_.as[LabeledEntitiesCreate]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "labeledEntitiesCreate")
      }
      api.labelsRemove(adAccountId, labelId, labeledEntitiesCreate)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /v5/ad_accounts/:adAccountId/labels
    * @param adAccountId Unique identifier of an ad account.
    */
  def labelsUpdate(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): LabelsResponse = {
      val labelUpdateRequest = request.body.asJson.map(_.as[LabelUpdateRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "labelUpdateRequest")
      }
      api.labelsUpdate(adAccountId, labelUpdateRequest)
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
