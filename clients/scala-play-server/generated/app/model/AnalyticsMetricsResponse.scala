package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AnalyticsMetricsResponse.
  * @param dailyMetrics Array with the requested daily metric records
  * @param summaryMetrics The metric name and value over the requested period for each requested metric
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-07T10:47:31.836531Z[Etc/UTC]")
case class AnalyticsMetricsResponse(
  dailyMetrics: Option[List[AnalyticsMetricsResponseDailyMetrics]],
  summaryMetrics: Option[Map[String, BigDecimal]],
  additionalProperties: 
)

object AnalyticsMetricsResponse {
  implicit lazy val analyticsMetricsResponseJsonFormat: Format[AnalyticsMetricsResponse] = {
    val realJsonFormat = Json.format[AnalyticsMetricsResponse]
    val declaredPropNames = Set("dailyMetrics", "summaryMetrics")
    
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
      Writes { analyticsMetricsResponse =>
        val jsObj = realJsonFormat.writes(analyticsMetricsResponse)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

