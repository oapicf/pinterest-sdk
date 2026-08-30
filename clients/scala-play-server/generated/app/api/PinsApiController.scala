package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.CreativeType
import model.Error
import java.time.LocalDate
import model.MultiPinsAnalyticsMetricTypesItem
import model.Pin
import model.PinAnalyticsMetricsResponse
import model.PinCreate
import model.PinFilter
import model.PinType
import model.PinUpdate
import model.PinsList200Response
import model.PinsSaveRequestCreate
import model.QuerypinanalyticsmetrictypesItems

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Singleton
class PinsApiController @Inject()(cc: ControllerComponents, api: PinsApi) extends AbstractController(cc) {
  /**
    * GET /v5/pins/analytics?pinIds=[value]&startDate=[value]&endDate=[value]&appTypes=[value]&metricTypes=[value]&adAccountId=[value]
    */
  def multiPinsAnalytics(): Action[AnyContent] = Action { request =>
    def executeApi(): Map[String, Map[String, PinAnalyticsMetricsResponse]] = {
      val pinIds = request.queryString.get("pin_ids")
        .map(_.toList)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("pin_ids", "query string")
        }
        
      val startDate = request.getQueryString("start_date")
        .map(value => LocalDate.parse(value))
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("start_date", "query string")
        }
        
      val endDate = request.getQueryString("end_date")
        .map(value => LocalDate.parse(value))
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("end_date", "query string")
        }
        
      val appTypes = request.getQueryString("app_types")
        
      val metricTypes = request.getQueryString("metric_types")
        .map(values => splitCollectionParam(values, "csv"))
        .map(_.map(value => )
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("metric_types", "query string")
        }
        
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.multiPinsAnalytics(pinIds, startDate, endDate, metricTypes, appTypes, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/pins/:pinId/analytics?startDate=[value]&endDate=[value]&appTypes=[value]&metricTypes=[value]&splitField=[value]&adAccountId=[value]
    * @param pinId Unique identifier of a Pin.
    */
  def pinsAnalytics(pinId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Map[String, PinAnalyticsMetricsResponse] = {
      val startDate = request.getQueryString("start_date")
        .map(value => LocalDate.parse(value))
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("start_date", "query string")
        }
        
      val endDate = request.getQueryString("end_date")
        .map(value => LocalDate.parse(value))
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("end_date", "query string")
        }
        
      val appTypes = request.getQueryString("app_types")
        
      val metricTypes = request.getQueryString("metric_types")
        .map(values => splitCollectionParam(values, "csv"))
        .map(_.map(value => )
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("metric_types", "query string")
        }
        
      val splitField = request.getQueryString("split_field")
        
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.pinsAnalytics(pinId, startDate, endDate, metricTypes, appTypes, splitField, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/pins?adAccountId=[value]
    */
  def pinsCreate(): Action[AnyContent] = Action { request =>
    def executeApi(): Pin = {
      val pinCreate = request.body.asJson.map(_.as[PinCreate]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "pinCreate")
      }
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.pinsCreate(pinCreate, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * DELETE /v5/pins/:pinId?adAccountId=[value]
    */
  def pinsDelete(pinId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Pin = {
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.pinsDelete(pinId, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/pins/:pinId?adAccountId=[value]&pinMetrics=[value]
    */
  def pinsGet(pinId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Pin = {
      val adAccountId = request.getQueryString("ad_account_id")
        
      val pinMetrics = request.getQueryString("pin_metrics")
        .map(value => value.toBoolean)
        
      api.pinsGet(pinId, adAccountId, pinMetrics)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/pins?pinFilter=[value]&pinMetrics=[value]&includeProtectedPins=[value]&pinType=[value]&creativeTypes=[value]&adAccountId=[value]&domain=[value]&domains=[value]&includeProductTagObj=[value]&bookmark=[value]&pageSize=[value]
    */
  def pinsList(): Action[AnyContent] = Action { request =>
    def executeApi(): PinsList200Response = {
      val pinFilter = request.getQueryString("pin_filter")
        .map(value => )
        
      val pinMetrics = request.getQueryString("pin_metrics")
        .map(value => value.toBoolean)
        
      val includeProtectedPins = request.getQueryString("include_protected_pins")
        .map(value => value.toBoolean)
        
      val pinType = request.getQueryString("pin_type")
        .map(value => )
        
      val creativeTypes = request.queryString.get("creative_types")
        .map(_.toList)
        .map(_.map(value => )
        
      val adAccountId = request.getQueryString("ad_account_id")
        
      val domain = request.getQueryString("domain")
        
      val domains = request.queryString.get("domains")
        .map(_.toList)
        
      val includeProductTagObj = request.getQueryString("include_product_tag_obj")
        .map(value => value.toBoolean)
        
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      api.pinsList(pinFilter, pinMetrics, includeProtectedPins, pinType, creativeTypes, adAccountId, domain, domains, includeProductTagObj, bookmark, pageSize)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * POST /v5/pins/:pinId/save?adAccountId=[value]
    * @param pinId Unique identifier of a Pin.
    */
  def pinsSave(pinId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Pin = {
      val pinsSaveRequestCreate = request.body.asJson.map(_.as[PinsSaveRequestCreate]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "pinsSaveRequestCreate")
      }
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.pinsSave(pinId, pinsSaveRequestCreate, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /v5/pins/:pinId?adAccountId=[value]
    */
  def pinsUpdate(pinId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Pin = {
      val pinUpdate = request.body.asJson.map(_.as[PinUpdate]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "pinUpdate")
      }
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.pinsUpdate(pinId, pinUpdate, adAccountId)
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
