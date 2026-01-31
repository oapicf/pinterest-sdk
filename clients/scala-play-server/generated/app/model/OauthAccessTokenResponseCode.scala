package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for OauthAccessTokenResponseCode.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class OauthAccessTokenResponseCode(
  refreshToken: Option[String],
  refreshTokenExpiresAt: Option[Int],
  refreshTokenExpiresIn: Option[Int],
  accessToken: String,
  expiresIn: Int,
  responseType: Option[OauthAccessTokenResponseCode.ResponseType.Value],
  scope: String,
  tokenType: String
  additionalProperties: 
)

object OauthAccessTokenResponseCode {
  implicit lazy val oauthAccessTokenResponseCodeJsonFormat: Format[OauthAccessTokenResponseCode] = {
    val realJsonFormat = Json.format[OauthAccessTokenResponseCode]
    val declaredPropNames = Set("refreshToken", "refreshTokenExpiresAt", "refreshTokenExpiresIn", "accessToken", "expiresIn", "responseType", "scope", "tokenType")
    
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
      Writes { oauthAccessTokenResponseCode =>
        val jsObj = realJsonFormat.writes(oauthAccessTokenResponseCode)
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

