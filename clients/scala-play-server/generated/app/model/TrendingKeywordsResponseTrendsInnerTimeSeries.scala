package model

import play.api.libs.json._
import java.time.LocalDate

/**
  * A sequence of weekly observations of the relative search volume for this keyword over the past year.<br /> These values are normalized to a [0-100] range, and can be used to visualize the history of user interest in this keyword. By default, normalization is applied independently to the time series of each keyword, but the `normalize_against_group` query parameter can be used in cases where you wish to compare relative volume between keywords.<br /> **Note**: The date of each observation is in ISO-8601 format and represents the *end* of the week.  For example, a value of `2023-10-31` would include searches that happened between `2023-10-25` and `2023-10-31`.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class TrendingKeywordsResponseTrendsInnerTimeSeries(
  date: Option[LocalDate]
  additionalProperties: Map[String, Int]
)

object TrendingKeywordsResponseTrendsInnerTimeSeries {
  implicit lazy val trendingKeywordsResponseTrendsInnerTimeSeriesJsonFormat: Format[TrendingKeywordsResponseTrendsInnerTimeSeries] = {
    val realJsonFormat = Json.format[TrendingKeywordsResponseTrendsInnerTimeSeries]
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
      Writes { trendingKeywordsResponseTrendsInnerTimeSeries =>
        val jsObj = realJsonFormat.writes(trendingKeywordsResponseTrendsInnerTimeSeries)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

