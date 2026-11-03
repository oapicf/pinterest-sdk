package model

import play.api.libs.json._
import java.time.LocalDate

/**
  * Represents the Swagger definition for TimeSeries.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class TimeSeries(
  date: Option[LocalDate]
  additionalProperties: Map[String, Int]
)

object TimeSeries {
  implicit lazy val timeSeriesJsonFormat: Format[TimeSeries] = {
    val realJsonFormat = Json.format[TimeSeries]
    val declaredPropNames = Set("date")
    
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
      Writes { timeSeries =>
        val jsObj = realJsonFormat.writes(timeSeries)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

