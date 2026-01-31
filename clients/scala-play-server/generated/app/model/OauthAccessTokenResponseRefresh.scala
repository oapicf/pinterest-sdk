package model

import play.api.libs.json._

/**
  * A successful OAuth access token response for the refresh token flow.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class OauthAccessTokenResponseRefresh(
  accessToken: String,
  expiresIn: Int,
  responseType: Option[OauthAccessTokenResponseRefresh.ResponseType.Value],
  scope: String,
  tokenType: String,
  refreshToken: String,
  refreshTokenExpiresAt: Int,
  refreshTokenExpiresIn: Int
  additionalProperties: 
)

object OauthAccessTokenResponseRefresh {
  implicit lazy val oauthAccessTokenResponseRefreshJsonFormat: Format[OauthAccessTokenResponseRefresh] = {
    val realJsonFormat = Json.format[OauthAccessTokenResponseRefresh]
    val declaredPropNames = Set("accessToken", "expiresIn", "responseType", "scope", "tokenType", "refreshToken", "refreshTokenExpiresAt", "refreshTokenExpiresIn")
    
    Format(
      Reads {
        case JsObject(xs) =>
          val declaredProps = xs.filterKeys(declaredPropNames)
          val additionalProps = JsObject(xs -- declaredPropNames)
          val restructuredProps = declaredProps + ("additionalProperties" -> additionalProps)
          val newObj = JsObject(restructuredProps)
          realJsonFormat.reads(newObj)
        case _ =>
          JsError("error.expected.jsobject")
      },
      Writes { oauthAccessTokenResponseRefresh =>
        val jsObj = realJsonFormat.writes(oauthAccessTokenResponseRefresh)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }

  // noinspection TypeAnnotation
  object ResponseType extends Enumeration {
    val AuthorizationCode = Value("authorization_code")
    val RefreshToken = Value("refresh_token")
    val ClientCredentials = Value("client_credentials")

    type ResponseType = Value
    implicit lazy val ResponseTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

