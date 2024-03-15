package model

import play.api.libs.json._
import java.time.LocalDate

/**
  * Represents the Swagger definition for AdsAnalyticsResponse_inner.
  * @param AD_ID The ID of the ad that this metrics belongs to.
  * @param DATE Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class AdsAnalyticsResponseInner(
  AD_ID: String,
  DATE: Option[LocalDate]
  additionalProperties: Map[String, OasAnyTypeNotMapped]
)

object AdsAnalyticsResponseInner {
  implicit lazy val adsAnalyticsResponseInnerJsonFormat: Format[AdsAnalyticsResponseInner] = {
    val realJsonFormat = Json.format[AdsAnalyticsResponseInner]
    val declaredPropNames = Set("AD_ID", "DATE")
    
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
      Writes { adsAnalyticsResponseInner =>
        val jsObj = realJsonFormat.writes(adsAnalyticsResponseInner)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

