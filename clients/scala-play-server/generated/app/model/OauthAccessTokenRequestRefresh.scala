package model

import play.api.libs.json._

/**
  * A request to exchange a refresh token for a new access token.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-08T00:41:34.847921Z[Etc/UTC]")
case class OauthAccessTokenRequestRefresh(
  grantType: OauthAccessTokenRequestRefresh.GrantType.Value,
  refreshToken: String,
  scope: Option[String]
  additionalProperties: OauthAccessTokenRequest
)

object OauthAccessTokenRequestRefresh {
  implicit lazy val oauthAccessTokenRequestRefreshJsonFormat: Format[OauthAccessTokenRequestRefresh] = {
    val realJsonFormat = Json.format[OauthAccessTokenRequestRefresh]
    val declaredPropNames = Set("grantType", "refreshToken", "scope")
    
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

