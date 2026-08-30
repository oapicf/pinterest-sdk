package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.CatalogsCreateReportResponse
import model.CatalogsReport
import model.CatalogsReportParameters
import model.CatalogsReportStatsParameters
import model.Error
import model.ReportsStats200Response

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Singleton
class CatalogReportsApiController @Inject()(cc: ControllerComponents, api: CatalogReportsApi) extends AbstractController(cc) {
  /**
    * POST /v5/catalogs/reports?adAccountId=[value]
    */
  def reportsCreate(): Action[AnyContent] = Action { request =>
    def executeApi(): CatalogsCreateReportResponse = {
      val catalogsReportParameters = request.body.asJson.map(_.as[CatalogsReportParameters]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "catalogsReportParameters")
      }
      val adAccountId = request.getQueryString("ad_account_id")
        
      api.reportsCreate(catalogsReportParameters, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/catalogs/reports?adAccountId=[value]&token=[value]
    */
  def reportsGet(): Action[AnyContent] = Action { request =>
    def executeApi(): CatalogsReport = {
      val adAccountId = request.getQueryString("ad_account_id")
        
      val token = request.getQueryString("token")
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("token", "query string")
        }
        
      api.reportsGet(token, adAccountId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/catalogs/reports/stats?adAccountId=[value]&parameters=[value]&bookmark=[value]&pageSize=[value]
    */
  def reportsStats(): Action[AnyContent] = Action { request =>
    def executeApi(): ReportsStats200Response = {
      val adAccountId = request.getQueryString("ad_account_id")
        
      val parameters = request.getQueryString("parameters")
        .map(value => )
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("parameters", "query string")
        }
        
      val bookmark = request.getQueryString("bookmark")
        
      val pageSize = request.getQueryString("page_size")
        .map(value => value.toInt)
        
      api.reportsStats(parameters, adAccountId, bookmark, pageSize)
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
