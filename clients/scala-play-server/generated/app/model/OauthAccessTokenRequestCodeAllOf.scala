package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for OauthAccessTokenRequestCode_allOf.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-07-01T12:06:32.599878Z[Etc/UTC]")
case class OauthAccessTokenRequestCodeAllOf(
  code: String,
  redirectUri: String
  additionalProperties: 
)

object OauthAccessTokenRequestCodeAllOf {
  implicit lazy val oauthAccessTokenRequestCodeAllOfJsonFormat: Format[OauthAccessTokenRequestCodeAllOf] = {
    val realJsonFormat = Json.format[OauthAccessTokenRequestCodeAllOf]
    val declaredPropNames = Set("code", "redirectUri")
    
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
      Writes { oauthAccessTokenRequestCodeAllOf =>
        val jsObj = realJsonFormat.writes(oauthAccessTokenRequestCodeAllOf)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

