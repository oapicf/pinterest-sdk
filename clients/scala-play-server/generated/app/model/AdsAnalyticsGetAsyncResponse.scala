package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdsAnalyticsGetAsyncResponse.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-07-01T12:06:32.599878Z[Etc/UTC]")
case class AdsAnalyticsGetAsyncResponse(
  reportStatus: Option[String],
  url: Option[String],
  size: Option[BigDecimal]
  additionalProperties: 
)

object AdsAnalyticsGetAsyncResponse {
  implicit lazy val adsAnalyticsGetAsyncResponseJsonFormat: Format[AdsAnalyticsGetAsyncResponse] = {
    val realJsonFormat = Json.format[AdsAnalyticsGetAsyncResponse]
    val declaredPropNames = Set("reportStatus", "url", "size")
    
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
      Writes { adsAnalyticsGetAsyncResponse =>
        val jsObj = realJsonFormat.writes(adsAnalyticsGetAsyncResponse)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

