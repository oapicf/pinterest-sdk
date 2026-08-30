package model

import play.api.libs.json._
import java.time.LocalDate

/**
  * Represents the Swagger definition for PredictedTimeSeries.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class PredictedTimeSeries(
  date: Option[LocalDate]
  additionalProperties: Map[String, Int]
)

object PredictedTimeSeries {
  implicit lazy val predictedTimeSeriesJsonFormat: Format[PredictedTimeSeries] = {
    val realJsonFormat = Json.format[PredictedTimeSeries]
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
      Writes { predictedTimeSeries =>
        val jsObj = realJsonFormat.writes(predictedTimeSeries)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

