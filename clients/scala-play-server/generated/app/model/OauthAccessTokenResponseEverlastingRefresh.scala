package model

import play.api.libs.json._

/**
  * A successful OAuth access token response for the refresh token flow, with an added everlasting refresh token.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class OauthAccessTokenResponseEverlastingRefresh(
  responseType: Option[OauthAccessTokenResponseEverlastingRefresh.ResponseType.Value],
  accessToken: String,
  tokenType: String,
  expiresIn: Int,
  scope: String,
  refreshToken: String,
  refreshTokenExpiresIn: Int,
  refreshTokenExpiresAt: Int
  additionalProperties: OauthAccessTokenResponse
)

object OauthAccessTokenResponseEverlastingRefresh {
  implicit lazy val oauthAccessTokenResponseEverlastingRefreshJsonFormat: Format[OauthAccessTokenResponseEverlastingRefresh] = {
    val realJsonFormat = Json.format[OauthAccessTokenResponseEverlastingRefresh]
    val declaredPropNames = Set("responseType", "accessToken", "tokenType", "expiresIn", "scope", "refreshToken", "refreshTokenExpiresIn", "refreshTokenExpiresAt")
    
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
      Writes { oauthAccessTokenResponseEverlastingRefresh =>
        val jsObj = realJsonFormat.writes(oauthAccessTokenResponseEverlastingRefresh)
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

    type ResponseType = Value
    implicit lazy val ResponseTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

