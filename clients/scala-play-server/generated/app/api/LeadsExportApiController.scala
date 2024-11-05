package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Error
import model.LeadsExportCreateRequest
import model.LeadsExportCreateResponse
import model.LeadsExportResponseData

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Singleton
class LeadsExportApiController @Inject()(cc: ControllerComponents, api: LeadsExportApi) extends AbstractController(cc) {
  /**
    * POST /v5/ad_accounts/:adAccountId/leads_export
    * @param adAccountId Unique identifier of an ad account.
    */
  def leadsExportCreate(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): LeadsExportCreateResponse = {
      val leadsExportCreateRequest = request.body.asJson.map(_.as[LeadsExportCreateRequest]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "leadsExportCreateRequest")
      }
      api.leadsExportCreate(adAccountId, leadsExportCreateRequest)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v5/ad_accounts/:adAccountId/leads_export/:leadsExportId
    * @param adAccountId Unique identifier of an ad account.
    * @param leadsExportId lead_export_id token returned from the create a lead export endpoint
    */
  def leadsExportGet(adAccountId: String, leadsExportId: String): Action[AnyContent] = Action { request =>
    def executeApi(): LeadsExportResponseData = {
      api.leadsExportGet(adAccountId, leadsExportId)
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
