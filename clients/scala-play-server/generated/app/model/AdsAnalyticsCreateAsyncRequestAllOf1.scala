package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdsAnalyticsCreateAsyncRequest_allOf_1.
  * @param columns Metric and entity columns
  * @param level Level of the report
  * @param reportFormat Specification for formatting report data
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-07T10:47:31.836531Z[Etc/UTC]")
case class AdsAnalyticsCreateAsyncRequestAllOf1(
  columns: List[ReportingColumnAsync],
  level: MetricsReportingLevel,
  reportFormat: Option[DataOutputFormat]
  additionalProperties: 
)

object AdsAnalyticsCreateAsyncRequestAllOf1 {
  implicit lazy val adsAnalyticsCreateAsyncRequestAllOf1JsonFormat: Format[AdsAnalyticsCreateAsyncRequestAllOf1] = {
    val realJsonFormat = Json.format[AdsAnalyticsCreateAsyncRequestAllOf1]
    val declaredPropNames = Set("columns", "level", "reportFormat")
    
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
      Writes { adsAnalyticsCreateAsyncRequestAllOf1 =>
        val jsObj = realJsonFormat.writes(adsAnalyticsCreateAsyncRequestAllOf1)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

