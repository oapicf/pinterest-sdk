package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Error
import model.TermsOfService

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Singleton
class TermsOfServiceApiController @Inject()(cc: ControllerComponents, api: TermsOfServiceApi) extends AbstractController(cc) {
  /**
    * GET /v5/ad_accounts/:adAccountId/terms_of_service?includeHtml=[value]&tosType=[value]
    * @param adAccountId Unique identifier of an ad account.
    */
  def termsOfServiceGet(adAccountId: String): Action[AnyContent] = Action { request =>
    def executeApi(): TermsOfService = {
      val includeHtml = request.getQueryString("include_html")
        .map(value => value.toBoolean)
        
      val tosType = request.getQueryString("tos_type")
        
      api.termsOfServiceGet(adAccountId, includeHtml, tosType)
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
