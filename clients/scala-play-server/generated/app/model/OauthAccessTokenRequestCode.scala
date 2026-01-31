package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for OauthAccessTokenRequestCode.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class OauthAccessTokenRequestCode(
  code: String,
  redirectUri: String,
  grantType: OauthAccessTokenRequestCode.GrantType.Value
  additionalProperties: 
)

object OauthAccessTokenRequestCode {
  implicit lazy val oauthAccessTokenRequestCodeJsonFormat: Format[OauthAccessTokenRequestCode] = {
    val realJsonFormat = Json.format[OauthAccessTokenRequestCode]
    val declaredPropNames = Set("code", "redirectUri", "grantType")
    
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
      Writes { oauthAccessTokenRequestCode =>
        val jsObj = realJsonFormat.writes(oauthAccessTokenRequestCode)
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

