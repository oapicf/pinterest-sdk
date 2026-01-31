package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for OauthAccessTokenRequestClientCredentials.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class OauthAccessTokenRequestClientCredentials(
  scope: String,
  grantType: OauthAccessTokenRequestClientCredentials.GrantType.Value
  additionalProperties: 
)

object OauthAccessTokenRequestClientCredentials {
  implicit lazy val oauthAccessTokenRequestClientCredentialsJsonFormat: Format[OauthAccessTokenRequestClientCredentials] = {
    val realJsonFormat = Json.format[OauthAccessTokenRequestClientCredentials]
    val declaredPropNames = Set("scope", "grantType")
    
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
      Writes { oauthAccessTokenRequestClientCredentials =>
        val jsObj = realJsonFormat.writes(oauthAccessTokenRequestClientCredentials)
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

