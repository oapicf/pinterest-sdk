package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.ConversionAccessTokenResponse
import model.Error
import model.OauthAccessTokenResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@Singleton
class OauthApiController @Inject()(cc: ControllerComponents, api: OauthApi) extends AbstractController(cc) {
  /**
    * POST /v5/oauth/conversion_token
    */
  def oauthConversionToken(): Action[AnyContent] = Action { request =>
    def executeApi(): ConversionAccessTokenResponse = {
      api.oauthConversionToken()
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

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

  /**
    * POST /v5/oauth/token/revoke
    */
  def tokenRevoke(): Action[AnyContent] = Action { request =>
    def executeApi(): Unit = {
      val token = (request.body.asMultipartFormData.map(_.asFormUrlEncoded) orElse request.body.asFormUrlEncoded)
        .flatMap(_.get("token"))
        .flatMap(_.headOption)
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("token", "form")
        }
        
      val tokenTypeHint = (request.body.asMultipartFormData.map(_.asFormUrlEncoded) orElse request.body.asFormUrlEncoded)
        .flatMap(_.get("token_type_hint"))
        .flatMap(_.headOption)
        
      api.tokenRevoke(token, tokenTypeHint)
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
