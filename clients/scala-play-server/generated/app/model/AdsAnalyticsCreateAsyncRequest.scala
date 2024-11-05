package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdsAnalyticsCreateAsyncRequest.
  * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD
  * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD
  * @param granularity TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
  * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
  * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
  * @param attributionTypes List of types of attribution for the conversion report
  * @param campaignIds List of campaign ids
  * @param campaignStatuses List of status values for filtering
  * @param campaignObjectiveTypes List of values for filtering. [\"WEB_SESSIONS\"] in BETA.
  * @param adGroupIds List of ad group ids
  * @param adGroupStatuses List of values for filtering
  * @param adIds List of ad ids [This parameter is no supported for Product Item Level Reports]
  * @param adStatuses List of values for filtering [This parameter is not supported for Product Item Level Reports]
  * @param productGroupIds List of product group ids
  * @param productGroupStatuses List of values for filtering
  * @param productItemIds List of product item ids
  * @param targetingTypes List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
  * @param metricsFilters List of metrics filters
  * @param columns Metric and entity columns. Pin promotion and ad related columns are not supported for the Product Item level reports.
  * @param level Level of the report
  * @param reportFormat Specification for formatting the report data. Reports in JSON will not zero-fill metrics, whereas reports in CSV will. Both report formats will omit rows where all the columns are equal to 0.
  * @param primarySort Whether to first sort the report by date or by entity ID of the reporting entity level. Date will be used as the first level key for JSON reports that use BY_DATE. BY_DATE is recommended for large requests.
  * @param startHour Which hour of the start date to begin the report. The entire day will be included if no start hour is provided. Only allowed for hourly reports.
  * @param endHour Which hour of the end date to stop the report (inclusive). For example, with an end_date of '2020-01-01' and end_hour of '15', the report will contain metrics up to '2020-01-01 14:59:59'. The entire day will be included if no end hour is provided. Only allowed for hourly reports.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class AdsAnalyticsCreateAsyncRequest(
  startDate: String,
  endDate: String,
  granularity: Granularity,
  clickWindowDays: Option[ConversionAttributionWindowDays],
  engagementWindowDays: Option[ConversionAttributionWindowDays],
  viewWindowDays: Option[ConversionAttributionWindowDays],
  conversionReportTime: Option[ConversionReportTimeType],
  attributionTypes: Option[List[ConversionReportAttributionType]],
  campaignIds: Option[List[String]],
  campaignStatuses: Option[List[CampaignSummaryStatus]],
  campaignObjectiveTypes: Option[List[ObjectiveType]],
  adGroupIds: Option[List[String]],
  adGroupStatuses: Option[List[AdGroupSummaryStatus]],
  adIds: Option[List[String]],
  adStatuses: Option[List[PinPromotionSummaryStatus]],
  productGroupIds: Option[List[String]],
  productGroupStatuses: Option[List[ProductGroupSummaryStatus]],
  productItemIds: Option[List[String]],
  targetingTypes: Option[List[AdsAnalyticsTargetingType]],
  metricsFilters: Option[List[AdsAnalyticsMetricsFilter]],
  columns: List[ReportingColumnAsync],
  level: MetricsReportingLevel,
  reportFormat: Option[DataOutputFormat],
  primarySort: Option[AdsAnalyticsCreateAsyncRequest.PrimarySort.Value],
  startHour: Option[Int],
  endHour: Option[Int]
  additionalProperties: 
)

object AdsAnalyticsCreateAsyncRequest {
  implicit lazy val adsAnalyticsCreateAsyncRequestJsonFormat: Format[AdsAnalyticsCreateAsyncRequest] = {
    val realJsonFormat = Json.format[AdsAnalyticsCreateAsyncRequest]
    val declaredPropNames = Set("startDate", "endDate", "granularity", "clickWindowDays", "engagementWindowDays", "viewWindowDays", "conversionReportTime", "attributionTypes", "campaignIds", "campaignStatuses", "campaignObjectiveTypes", "adGroupIds", "adGroupStatuses", "adIds", "adStatuses", "productGroupIds", "productGroupStatuses", "productItemIds", "targetingTypes", "metricsFilters", "columns", "level", "reportFormat", "primarySort", "startHour", "endHour")
    
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
      Writes { adsAnalyticsCreateAsyncRequest =>
        val jsObj = realJsonFormat.writes(adsAnalyticsCreateAsyncRequest)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }

  // noinspection TypeAnnotation
  object PrimarySort extends Enumeration {
    val ID = Value("BY_ID")
    val DATE = Value("BY_DATE")

    type PrimarySort = Value
    implicit lazy val PrimarySortJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

