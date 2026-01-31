package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdsAnalyticsCreateAsyncRequest.
  * @param attributionTypes List of types of attribution for the conversion report
  * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
  * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD
  * @param engagementWindowDays Number of days to use as the conversion attribution window for an engagement action. Engagements include saves, closeups, link clicks, and carousel card swipes. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
  * @param granularity TOTAL - metrics are aggregated over the specified date range.<br> DAY - metrics are broken down daily.<br> HOUR - metrics are broken down hourly.<br>WEEKLY - metrics are broken down weekly.<br>MONTHLY - metrics are broken down monthly
  * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD
  * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
  * @param campaignIds List of campaign ids
  * @param campaignStatuses List of status values for filtering
  * @param campaignObjectiveTypes List of values for filtering. [\"WEB_SESSIONS\"] in BETA.
  * @param campaignBrandLabel Campaign brand label for filtering.
  * @param adGroupIds List of ad group ids
  * @param adGroupStatuses List of values for filtering
  * @param adIds List of ad ids [This parameter is no supported for Product Item Level Reports]
  * @param adStatuses List of values for filtering [This parameter is not supported for Product Item Level Reports]
  * @param productGroupIds List of product group ids
  * @param productGroupStatuses List of values for filtering
  * @param productItemIds List of product item ids
  * @param targetingTypes List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AUDIENCE_MULTIPLIER\"] is only available in CAMPAIGN_TARGETING level. [\"MEDIA_TYPE\"] is only available in PRODUCT_ITEM_TARGETING level. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users.
  * @param metricsFilters List of metrics filters
  * @param columns Metric and entity columns. Pin promotion and ad related columns are not supported for the Product Item level reports.
  * @param combineTargetingTypes Determines if the targeting types included in the request should be consolidated into a single breakdown. For example, when combine_targeting_types is set to true, if GENDER and COUNTRY are targeting types in the request, the response will have a targeting type of GENDER_AND_COUNTRY and targeting values such as female&US. This feature is currently in BETA and is not available to all users.
  * @param customConversionEventMetrics List of advertiser-defined custom conversion event metrics to include in the report
  * @param endHour Which hour of the end date to stop the report (inclusive). For example, with an end_date of '2020-01-01' and end_hour of '15', the report will contain metrics up to '2020-01-01 14:59:59'. The entire day will be included if no end hour is provided. Only allowed for hourly reports.
  * @param level Level of the report
  * @param primarySort Whether to first sort the report by date or by entity ID of the reporting entity level. Date will be used as the first level key for JSON reports that use BY_DATE. BY_DATE is recommended for large requests.
  * @param reportFormat Specification for formatting the report data. Reports in JSON will not zero-fill metrics, whereas reports in CSV will. Both report formats will omit rows where all the columns are equal to 0.
  * @param reportingTimezone Specify the timezone to be applied for the reporting. This feature is currently in BETA and is not available to all users.
  * @param startHour Which hour of the start date to begin the report. The entire day will be included if no start hour is provided. Only allowed for hourly reports.
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AdsAnalyticsCreateAsyncRequest(
  attributionTypes: Option[List[ConversionReportAttributionType]],
  clickWindowDays: Option[ConversionAttributionWindowDays],
  conversionReportTime: Option[ConversionReportTimeType],
  endDate: String,
  engagementWindowDays: Option[ConversionAttributionWindowDays],
  granularity: Granularity,
  startDate: String,
  viewWindowDays: Option[ConversionAttributionWindowDays],
  campaignIds: Option[List[String]],
  campaignStatuses: Option[List[CampaignSummaryStatus]],
  campaignObjectiveTypes: Option[List[ObjectiveType]],
  campaignBrandLabel: Option[String],
  adGroupIds: Option[List[String]],
  adGroupStatuses: Option[List[AdGroupSummaryStatus]],
  adIds: Option[List[String]],
  adStatuses: Option[List[PinPromotionSummaryStatus]],
  productGroupIds: Option[List[String]],
  productGroupStatuses: Option[List[ProductGroupSummaryStatus]],
  productItemIds: Option[List[String]],
  targetingTypes: Option[AdsAnalyticsCreateAsyncRequest.TargetingTypes.Value],
  metricsFilters: Option[List[AdsAnalyticsMetricsFilter]],
  columns: List[ReportingColumnAsync],
  combineTargetingTypes: Option[Boolean],
  customConversionEventMetrics: Option[List[AdsAnalyticsCreateAsyncRequestAllOfCustomConversionEventMetrics]],
  endHour: Option[Int],
  level: MetricsReportingLevel,
  primarySort: Option[AdsAnalyticsCreateAsyncRequest.PrimarySort.Value],
  reportFormat: Option[DataOutputFormat],
  reportingTimezone: Option[ReportingTimeZone],
  startHour: Option[Int]
  additionalProperties: 
)

object AdsAnalyticsCreateAsyncRequest {
  implicit lazy val adsAnalyticsCreateAsyncRequestJsonFormat: Format[AdsAnalyticsCreateAsyncRequest] = {
    val realJsonFormat = Json.format[AdsAnalyticsCreateAsyncRequest]
    val declaredPropNames = Set("attributionTypes", "clickWindowDays", "conversionReportTime", "endDate", "engagementWindowDays", "granularity", "startDate", "viewWindowDays", "campaignIds", "campaignStatuses", "campaignObjectiveTypes", "campaignBrandLabel", "adGroupIds", "adGroupStatuses", "adIds", "adStatuses", "productGroupIds", "productGroupStatuses", "productItemIds", "targetingTypes", "metricsFilters", "columns", "combineTargetingTypes", "customConversionEventMetrics", "endHour", "level", "primarySort", "reportFormat", "reportingTimezone", "startHour")
    
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
  object TargetingTypes extends Enumeration {
    val KEYWORD = Value("KEYWORD")
    val APPTYPE = Value("APPTYPE")
    val GENDER = Value("GENDER")
    val LOCATION = Value("LOCATION")
    val PLACEMENT = Value("PLACEMENT")
    val COUNTRY = Value("COUNTRY")
    val TARGETEDINTEREST = Value("TARGETED_INTEREST")
    val PINNERINTEREST = Value("PINNER_INTEREST")
    val AUDIENCEINCLUDE = Value("AUDIENCE_INCLUDE")
    val GEO = Value("GEO")
    val AGEBUCKET = Value("AGE_BUCKET")
    val REGION = Value("REGION")
    val MEDIATYPE = Value("MEDIA_TYPE")
    val AGEBUCKETANDGENDER = Value("AGE_BUCKET_AND_GENDER")
    val AUDIENCEMULTIPLIER = Value("AUDIENCE_MULTIPLIER")
    val CREATIVEENHANCEMENTS = Value("CREATIVE_ENHANCEMENTS")
    val LOCALADSSTORECODE = Value("LOCAL_ADS_STORE_CODE")

    type TargetingTypes = Value
    implicit lazy val TargetingTypesJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object PrimarySort extends Enumeration {
    val BYID = Value("BY_ID")
    val BYDATE = Value("BY_DATE")

    type PrimarySort = Value
    implicit lazy val PrimarySortJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

