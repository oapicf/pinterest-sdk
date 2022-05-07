package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AnalyticsMetricsResponse_daily_metrics.
  * @param dataStatus Metrics availablity, e.g., \"READY\".
  * @param date Metrics date (UTC): YYYY-MM-DD.
  * @param metrics The metric name and daily value for each requested metric
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-07T10:47:31.836531Z[Etc/UTC]")
case class AnalyticsMetricsResponseDailyMetrics(
  dataStatus: Option[AnalyticsMetricsResponseDailyMetrics.DataStatus.Value],
  date: Option[String],
  metrics: Option[Map[String, BigDecimal]],
  additionalProperties: 
)

object AnalyticsMetricsResponseDailyMetrics {
  implicit lazy val analyticsMetricsResponseDailyMetricsJsonFormat: Format[AnalyticsMetricsResponseDailyMetrics] = {
    val realJsonFormat = Json.format[AnalyticsMetricsResponseDailyMetrics]
    val declaredPropNames = Set("dataStatus", "date", "metrics")
    
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
      Writes { analyticsMetricsResponseDailyMetrics =>
        val jsObj = realJsonFormat.writes(analyticsMetricsResponseDailyMetrics)
        val additionalProps = jsObj.value("additionalProperties").as[JsObject]
        val declaredProps = jsObj - "additionalProperties"
        val newObj = declaredProps ++ additionalProps
        newObj
      }
    )
  }

  // noinspection TypeAnnotation
  object DataStatus extends Enumeration {
    val PROCESSING = Value("PROCESSING")
    val READY = Value("READY")
    val ESTIMATE = Value("ESTIMATE")
    val BEFOREBUSINESSCREATED = Value("BEFORE_BUSINESS_CREATED")
    val BEFOREDATARETENTIONPERIOD = Value("BEFORE_DATA_RETENTION_PERIOD")
    val BEFOREPINDATARETENTIONPERIOD = Value("BEFORE_PIN_DATA_RETENTION_PERIOD")
    val BEFOREMETRICSTARTDATE = Value("BEFORE_METRIC_START_DATE")
    val BEFORECOREMETRICSTARTDATE = Value("BEFORE_CORE_METRIC_START_DATE")
    val BEFOREPINFORMATMETRICSTARTDATE = Value("BEFORE_PIN_FORMAT_METRIC_START_DATE")
    val BEFOREAUDIENCEMETRICSTARTDATE = Value("BEFORE_AUDIENCE_METRIC_START_DATE")
    val BEFOREAUDIENCEMONTHLYMETRICSTARTDATE = Value("BEFORE_AUDIENCE_MONTHLY_METRIC_START_DATE")
    val BEFOREVIDEOMETRICSTARTDATE = Value("BEFORE_VIDEO_METRIC_START_DATE")
    val BEFORECONVERSIONMETRICSTARTDATE = Value("BEFORE_CONVERSION_METRIC_START_DATE")
    val PURCHASERSMETRICSMALLERTHANTHRESHOLD = Value("PURCHASERS_METRIC_SMALLER_THAN_THRESHOLD")
    val INBADTAGDATE = Value("IN_BAD_TAG_DATE")
    val BEFOREPUBLISHEDMETRICSTARTDATE = Value("BEFORE_PUBLISHED_METRIC_START_DATE")
    val BEFOREASSISTMETRICSTARTDATE = Value("BEFORE_ASSIST_METRIC_START_DATE")
    val BEFOREPINCREATED = Value("BEFORE_PIN_CREATED")
    val BEFOREACCOUNTCLAIMED = Value("BEFORE_ACCOUNT_CLAIMED")
    val BEFOREDEMOGRAPHICFILTERSSTARTDATE = Value("BEFORE_DEMOGRAPHIC_FILTERS_START_DATE")
    val AUDIENCESEGMENTSMALLERTHANTHRESHOLD = Value("AUDIENCE_SEGMENT_SMALLER_THAN_THRESHOLD")
    val AUDIENCETOTALSMALLERTHANTHRESHOLD = Value("AUDIENCE_TOTAL_SMALLER_THAN_THRESHOLD")
    val BEFOREPRODUCTGROUPFILTERSTARTDATE = Value("BEFORE_PRODUCT_GROUP_FILTER_START_DATE")

    type DataStatus = Value
    implicit lazy val DataStatusJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

