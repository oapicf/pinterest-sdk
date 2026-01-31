package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for OauthAccessTokenRequestRefresh.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class OauthAccessTokenRequestRefresh(
  refreshToken: String,
  scope: Option[String],
  grantType: OauthAccessTokenRequestRefresh.GrantType.Value
  additionalProperties: 
)

object OauthAccessTokenRequestRefresh {
  implicit lazy val oauthAccessTokenRequestRefreshJsonFormat: Format[OauthAccessTokenRequestRefresh] = {
    val realJsonFormat = Json.format[OauthAccessTokenRequestRefresh]
    val declaredPropNames = Set("refreshToken", "scope", "grantType")
    
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

