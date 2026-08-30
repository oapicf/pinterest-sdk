package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Error
import model.PaginationOrder
import model.Schedule
import model.ScheduleBatchUpdate
import model.ScheduleCreate
import model.ScheduleStatus
import model.ScheduleType
import model.SchedulesCreate200ResponseInner
import model.SchedulesList200Response

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Singleton
class SchedulesApiController @Inject()(cc: ControllerComponents, api: SchedulesApi) extends AbstractController(cc) {
  /**
    * POST /v5/ad_accounts/:adAccountId/schedules
    */
  def schedulesCreate(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): List[SchedulesCreate200ResponseInner] = {
      val scheduleCreate = request.body.asJson.map(_.as[List[ScheduleCreate]]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "scheduleCreate")
      }
      api.schedulesCreate(adAccountId, scheduleCreate)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/schedules?bookmark=[value]&pageSize=[value]&order=[value]&scheduleStatuses=[value]&scheduleType=[value]&entityIds=[value]
    */
  def schedulesList(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): SchedulesList200Response = {
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val order = request.getQueryString("order")
        .map(value => )
        
      val scheduleStatuses = request.queryString.get("schedule_statuses")
        .map(_.toList)
        .map(_.map(value => )
        
      val scheduleType = request.getQueryString("schedule_type")
        .map(value => )
        
      val entityIds = request.queryString.get("entity_ids")
        .map(_.toList)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("entity_ids", "query string")
        }
        
      api.schedulesList(adAccountId, entityIds, bookmark, pageSize, order, scheduleStatuses, scheduleType)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /v5/ad_accounts/:adAccountId/schedules
    */
  def schedulesUpdate(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): List[SchedulesCreate200ResponseInner] = {
      val scheduleBatchUpdate = request.body.asJson.map(_.as[List[ScheduleBatchUpdate]]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "scheduleBatchUpdate")
      }
      api.schedulesUpdate(adAccountId, scheduleBatchUpdate)
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
