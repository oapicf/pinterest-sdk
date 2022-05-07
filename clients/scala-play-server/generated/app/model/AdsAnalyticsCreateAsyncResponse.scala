package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdsAnalyticsCreateAsyncResponse.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-07T10:47:31.836531Z[Etc/UTC]")
case class AdsAnalyticsCreateAsyncResponse(
  reportStatus: Option[String],
  token: Option[String],
  message: Option[String]
  additionalProperties: 
)

object AdsAnalyticsCreateAsyncResponse {
  implicit lazy val adsAnalyticsCreateAsyncResponseJsonFormat: Format[AdsAnalyticsCreateAsyncResponse] = {
    val realJsonFormat = Json.format[AdsAnalyticsCreateAsyncResponse]
    val declaredPropNames = Set("reportStatus", "token", "message")
    
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
      Writes { adsAnalyticsCreateAsyncResponse =>
        val jsObj = realJsonFormat.writes(adsAnalyticsCreateAsyncResponse)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

