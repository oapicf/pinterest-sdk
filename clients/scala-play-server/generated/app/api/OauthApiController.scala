package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.Error
import model.OauthAccessTokenResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-08T00:41:34.847921Z[Etc/UTC]")
@Singleton
class OauthApiController @Inject()(cc: ControllerComponents, api: OauthApi) extends AbstractController(cc) {
  /**
    * POST /v5/oauth/token
    */
  def oauthToken(): Action[AnyContent] = Action { request =>
    def executeApi(): OauthAccessTokenResponse = {
      val grantType = (request.body.asMultipartFormData.map(_.asFormUrlEncoded) orElse request.body.asFormUrlEncoded)
        .flatMap(_.get("grant_type"))
        .flatMap(_.headOption)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("grant_type", "form")
        }
      api.oauthToken(grantType)
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
