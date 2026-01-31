package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for OauthAccessTokenRequestRefresh.
  * @param refreshOn Setting this field to <code>true</code> will add a new refresh token to your 200 response, as well as the refresh_token_expires_in and refresh_token_expires_at fields. To see the structure of this payload, set the 200 response_type to \"everlasting_refresh\".
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class OauthAccessTokenRequestRefresh(
  refreshToken: String,
  scope: Option[String],
  refreshOn: Option[Boolean],
  grantType: OauthAccessTokenRequestRefresh.GrantType.Value
  additionalProperties: 
)

object OauthAccessTokenRequestRefresh {
  implicit lazy val oauthAccessTokenRequestRefreshJsonFormat: Format[OauthAccessTokenRequestRefresh] = {
    val realJsonFormat = Json.format[OauthAccessTokenRequestRefresh]
    val declaredPropNames = Set("refreshToken", "scope", "refreshOn", "grantType")
    
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
    val ClientCredentials = Value("client_credentials")

    type GrantType = Value
    implicit lazy val GrantTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

