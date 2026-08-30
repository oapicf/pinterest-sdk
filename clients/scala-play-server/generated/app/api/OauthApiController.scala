package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.ConversionAccessToken
import model.Error
import model.OauthAccessToken
import model.TokenGrantType
import model.TokenTypeHint

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@Singleton
class OauthApiController @Inject()(cc: ControllerComponents, api: OauthApi) extends AbstractController(cc) {
  /**
    * POST /v5/oauth/conversion_token
    */
  def oauthConversionToken(): Action[AnyContent] = Action { request =>
    def executeApi(): ConversionAccessToken = {
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
    def executeApi(): OauthAccessToken = {
      val code = (request.body.asMultipartFormData.map(_.asFormUrlEncoded) orElse request.body.asFormUrlEncoded)
        .flatMap(_.get("code"))
        .flatMap(_.headOption)
        
      val continuousRefresh = (request.body.asMultipartFormData.map(_.asFormUrlEncoded) orElse request.body.asFormUrlEncoded)
        .flatMap(_.get("continuous_refresh"))
        .flatMap(_.headOption)
        
      val grantType = (request.body.asMultipartFormData.map(_.asFormUrlEncoded) orElse request.body.asFormUrlEncoded)
        .flatMap(_.get("grant_type"))
        .flatMap(_.headOption)
        .map(value => )
        .getOrElse {
          throw new OpenApiExceptions.MissingRequiredParameterException("grant_type", "form")
        }
        
      val redirectUri = (request.body.asMultipartFormData.map(_.asFormUrlEncoded) orElse request.body.asFormUrlEncoded)
        .flatMap(_.get("redirect_uri"))
        .flatMap(_.headOption)
        
      val refreshToken = (request.body.asMultipartFormData.map(_.asFormUrlEncoded) orElse request.body.asFormUrlEncoded)
        .flatMap(_.get("refresh_token"))
        .flatMap(_.headOption)
        
      val scope = (request.body.asMultipartFormData.map(_.asFormUrlEncoded) orElse request.body.asFormUrlEncoded)
        .flatMap(_.get("scope"))
        .flatMap(_.headOption)
        
      api.oauthToken(grantType, code, continuousRefresh, redirectUri, refreshToken, scope)
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
        .map(value => )
        
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
