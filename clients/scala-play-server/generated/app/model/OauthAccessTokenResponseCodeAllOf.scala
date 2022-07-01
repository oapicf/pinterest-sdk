package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for OauthAccessTokenResponseCode_allOf.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-07-01T12:06:32.599878Z[Etc/UTC]")
case class OauthAccessTokenResponseCodeAllOf(
  refreshToken: String,
  refreshTokenExpiresIn: Int
  additionalProperties: 
)

object OauthAccessTokenResponseCodeAllOf {
  implicit lazy val oauthAccessTokenResponseCodeAllOfJsonFormat: Format[OauthAccessTokenResponseCodeAllOf] = {
    val realJsonFormat = Json.format[OauthAccessTokenResponseCodeAllOf]
    val declaredPropNames = Set("refreshToken", "refreshTokenExpiresIn")
    
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
      Writes { oauthAccessTokenResponseCodeAllOf =>
        val jsObj = realJsonFormat.writes(oauthAccessTokenResponseCodeAllOf)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

