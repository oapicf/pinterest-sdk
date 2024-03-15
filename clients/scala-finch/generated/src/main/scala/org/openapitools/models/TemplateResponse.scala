package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal
import org.openapitools.models.DataOutputFormat
import org.openapitools.models.Granularity
import org.openapitools.models.MetricsReportingLevel
import org.openapitools.models.TemplateResponseDateRange
import scala.collection.immutable.Seq

/**
 * Template fields
 * @param id Template ID
 * @param adUnderscoreaccountUnderscoreid ID of the Ad Account that owns the template
 * @param adUnderscoreaccountUnderscoreids IDs of the Ad Accounts that have access to this template
 * @param userUnderscoreid ID of the user who created the template
 * @param name Template Name
 * @param reportUnderscorestartUnderscorerelativeUnderscoredaysUnderscoreinUnderscorepast The number of days prior to the day the report will be delivered at which the report will start
 * @param reportUnderscoreendUnderscorerelativeUnderscoredaysUnderscoreinUnderscorepast The number of days prior to the day the report will be delivered at which the report will end
 * @param dateUnderscorerange 
 * @param reportUnderscorelevel 
 * @param reportUnderscoreformat 
 * @param columns A list of columns to be included in the report
 * @param granularity 
 * @param viewUnderscorewindowUnderscoredays The length of the sliding window over which view conversions will be attributed
 * @param clickUnderscorewindowUnderscoredays The length of the sliding window over which click conversions will be attributed
 * @param engagementUnderscorewindowUnderscoredays The length of the sliding window over which engagement conversions will be attributed
 * @param conversionUnderscorereportUnderscoretimeUnderscoretype Conversion report time type
 * @param filtersUnderscorejson A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:<br> \"field\": The column name<br> \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]<br> \"value\": A single value or a list of values
 * @param isUnderscoreownedUnderscorebyUnderscoreuser A boolean value that indicates if the user owns the template
 * @param isUnderscorescheduled A boolean value that indicates if this template has been used to create a scheduled report
 * @param creationUnderscoresource The surface used to create this template
 * @param isUnderscoredeleted A boolean that indicates if the template has been deleted
 * @param updatedUnderscoretime Time of last update in seconds since Unix epoch
 * @param customUnderscorecolumnUnderscoreids A list of custom column IDs
 * @param _type Reporting template type
 * @param ingestionUnderscoresources The filter on the conversion ingestion source method for conversion metrics
 */
case class TemplateResponse(id: Option[String],
                adUnderscoreaccountUnderscoreid: Option[String],
                adUnderscoreaccountUnderscoreids: Option[Seq[String]],
                userUnderscoreid: Option[String],
                name: Option[String],
                reportUnderscorestartUnderscorerelativeUnderscoredaysUnderscoreinUnderscorepast: Option[BigDecimal],
                reportUnderscoreendUnderscorerelativeUnderscoredaysUnderscoreinUnderscorepast: Option[BigDecimal],
                dateUnderscorerange: Option[TemplateResponseDateRange],
                reportUnderscorelevel: Option[MetricsReportingLevel],
                reportUnderscoreformat: Option[DataOutputFormat],
                columns: Option[Seq[String]],
                granularity: Option[Granularity],
                viewUnderscorewindowUnderscoredays: Option[BigDecimal],
                clickUnderscorewindowUnderscoredays: Option[BigDecimal],
                engagementUnderscorewindowUnderscoredays: Option[BigDecimal],
                conversionUnderscorereportUnderscoretimeUnderscoretype: Option[String],
                filtersUnderscorejson: Option[String],
                isUnderscoreownedUnderscorebyUnderscoreuser: Option[Boolean],
                isUnderscorescheduled: Option[Boolean],
                creationUnderscoresource: Option[String],
                isUnderscoredeleted: Option[Boolean],
                updatedUnderscoretime: Option[BigDecimal],
                customUnderscorecolumnUnderscoreids: Option[Seq[String]],
                _type: Option[String],
                ingestionUnderscoresources: Option[Seq[String]]
                )

object TemplateResponse {
    /**
     * Creates the codec for converting TemplateResponse from and to JSON.
     */
    implicit val decoder: Decoder[TemplateResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[TemplateResponse] = deriveEncoder
}
