package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.CustomerSegment
import model.CustomerSegmentCreate
import model.CustomerSegmentList200Response
import model.CustomerSegmentUpdateRequestUpdateWithRequiredBody
import model.Error
import model.PaginationOrder

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Singleton
class CustomerSegmentApiController @Inject()(cc: ControllerComponents, api: CustomerSegmentApi) extends AbstractController(cc) {
  /**
    * POST /v5/ad_accounts/:adAccountId/customer_segments
    * @param adAccountId Unique identifier of an ad account.
    */
  def customerSegmentCreate(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): CustomerSegment = {
      val customerSegmentCreate = request.body.asJson.map(_.as[CustomerSegmentCreate]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "customerSegmentCreate")
      }
      api.customerSegmentCreate(adAccountId, customerSegmentCreate)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/customer_segments?bookmark=[value]&pageSize=[value]&order=[value]&includeSizing=[value]&searchQuery=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def customerSegmentList(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): CustomerSegmentList200Response = {
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      val order = request.getQueryString("order")
        .map(value => )
        
      val includeSizing = request.getQueryString("include_sizing")
        .map(value => value.toBoolean)
        
      val searchQuery = request.getQueryString("search_query")
        
      api.customerSegmentList(adAccountId, bookmark, pageSize, order, includeSizing, searchQuery)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * PATCH /v5/ad_accounts/:adAccountId/customer_segments
    * @param adAccountId Unique identifier of an ad account.
    */
  def customerSegmentUpdate(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val customerSegmentUpdateRequestUpdateWithRequiredBody = request.body.asJson.map(_.as[CustomerSegmentUpdateRequestUpdateWithRequiredBody]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "customerSegmentUpdateRequestUpdateWithRequiredBody")
      }
      api.customerSegmentUpdate(adAccountId, customerSegmentUpdateRequestUpdateWithRequiredBody)
    }

    executeApi()
    Ok
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
