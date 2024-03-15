package model

import play.api.libs.json._

/**
  * A request to exchange a refresh token for a new access token.
  * @param refreshOn Setting this field to <code>true</code> will add a new refresh token to your 200 response, as well as the refresh_token_expires_in and refresh_token_expires_at fields. To see the structure of this payload, set the 200 response_type to \"everlasting_refresh\".
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class OauthAccessTokenRequestRefresh(
  grantType: OauthAccessTokenRequestRefresh.GrantType.Value,
  refreshToken: String,
  scope: Option[String],
  refreshOn: Option[Boolean]
  additionalProperties: OauthAccessTokenRequest
)

object OauthAccessTokenRequestRefresh {
  implicit lazy val oauthAccessTokenRequestRefreshJsonFormat: Format[OauthAccessTokenRequestRefresh] = {
    val realJsonFormat = Json.format[OauthAccessTokenRequestRefresh]
    val declaredPropNames = Set("grantType", "refreshToken", "scope", "refreshOn")
    
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
      Writes { oauthAccessTokenRequestRefresh =>
        val jsObj = realJsonFormat.writes(oauthAccessTokenRequestRefresh)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }

  // noinspection TypeAnnotation
  object GrantType extends Enumeration {
    val AuthorizationCode = Value("authorization_code")
    val RefreshToken = Value("refresh_token")

    type GrantType = Value
    implicit lazy val GrantTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

