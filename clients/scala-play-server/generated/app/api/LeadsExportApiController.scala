package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Error
import model.LeadsExportResponseData
import model.LeadsExports
import model.LeadsExportsCreate

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Singleton
class LeadsExportApiController @Inject()(cc: ControllerComponents, api: LeadsExportApi) extends AbstractController(cc) {
  /**
    * POST /v5/ad_accounts/:adAccountId/leads_export
    * @param adAccountId Unique identifier of an ad account.
    */
  def leadsExportCreate(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): LeadsExports = {
      val leadsExportsCreate = request.body.asJson.map(_.as[LeadsExportsCreate]).getOrElse {
        throw new OpenApiExceptions.MissingRequiredParameterException("body", "leadsExportsCreate")
      }
      api.leadsExportCreate(adAccountId, leadsExportsCreate)
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
