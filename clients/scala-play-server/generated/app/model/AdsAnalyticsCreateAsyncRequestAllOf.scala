package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdsAnalyticsCreateAsyncRequest_allOf.
  * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD
  * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD
  * @param granularity TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
  * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
  * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
  * @param attributionTypes List of types of attribution for the conversion report
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-07T10:47:31.836531Z[Etc/UTC]")
case class AdsAnalyticsCreateAsyncRequestAllOf(
  startDate: String,
  endDate: String,
  granularity: Granularity,
  clickWindowDays: Option[ConversionAttributionWindowDays],
  engagementWindowDays: Option[ConversionAttributionWindowDays],
  viewWindowDays: Option[ConversionAttributionWindowDays],
  conversionReportTime: Option[ConversionReportTimeType],
  attributionTypes: Option[List[ConversionReportAttributionType]]
  additionalProperties: 
)

object AdsAnalyticsCreateAsyncRequestAllOf {
  implicit lazy val adsAnalyticsCreateAsyncRequestAllOfJsonFormat: Format[AdsAnalyticsCreateAsyncRequestAllOf] = {
    val realJsonFormat = Json.format[AdsAnalyticsCreateAsyncRequestAllOf]
    val declaredPropNames = Set("startDate", "endDate", "granularity", "clickWindowDays", "engagementWindowDays", "viewWindowDays", "conversionReportTime", "attributionTypes")
    
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
      Writes { adsAnalyticsCreateAsyncRequestAllOf =>
        val jsObj = realJsonFormat.writes(adsAnalyticsCreateAsyncRequestAllOf)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }
}

