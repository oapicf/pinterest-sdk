package model

import play.api.libs.json._
import java.time.LocalDate

/**
  * Represents the Swagger definition for AdPinAnalytics.
  * @param DATE Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
  * @param PIN_ID The ID of the pin that the metric belongs to.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AdPinAnalytics(
  DATE: Option[LocalDate],
  PIN_ID: String
  additionalProperties: Map[String, OasAnyTypeNotMapped]
)

object AdPinAnalytics {
  implicit lazy val adPinAnalyticsJsonFormat: Format[AdPinAnalytics] = {
    val realJsonFormat = Json.format[AdPinAnalytics]
    val declaredPropNames = Set("DATE", "PIN_ID")
    
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
      Writes { adPinAnalytics =>
        val jsObj = realJsonFormat.writes(adPinAnalytics)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

