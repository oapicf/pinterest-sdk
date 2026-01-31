package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ConversionAttributionWindowDays
import org.openapitools.models.ConversionProductReportingColumn
import org.openapitools.models.ConversionReportTimeType
import org.openapitools.models.ObjectiveType
import scala.collection.immutable.Seq

/**
 * Request for a brand, category, SKU report
 * @param adUnderscoregroupUnderscoreids List of ad group ids. <br>Only support ad_group_ids field when level of the report is AD_GROUP.
 * @param campaignUnderscoreids List of campaign ids. <br>Only support campaign_ids field when level of the report is CAMPAIGN.
 * @param campaignUnderscoreobjectiveUnderscoretypes List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION'].
 * @param clickUnderscorewindowUnderscoredays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
 * @param columns Metric and entity columns
 * @param conversionUnderscoreproductUnderscoreattributionUnderscoretype 
 * @param conversionUnderscoreproductUnderscorebreakdown 
 * @param conversionUnderscorereportUnderscoretime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
 * @param endUnderscoredate Metric report end date (UTC). Format: YYYY-MM-DD.<br> A max of 1 year is allowed between the start and end date for reports.
 * @param granularity TOTAL - metrics are aggregated over the specified date range.<br> WEEK - metrics are broken down weekly.<br> MONTH - metrics are broken down monthly.
 * @param level Level of the report
 * @param productUnderscoreskuUnderscoreids List of SKU ids. <br>Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.
 * @param reportUnderscorename Name of the conversion product report.
 * @param startUnderscoredate Metric report start date (UTC). Format: YYYY-MM-DD.<br> Start date must be after 2024-03-16. 7 day minimum time window for report is required.
 * @param viewUnderscorewindowUnderscoredays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` day.
 */
case class ConversionProductReportRequest(adUnderscoregroupUnderscoreids: Option[Seq[String]],
                campaignUnderscoreids: Option[Seq[String]],
                campaignUnderscoreobjectiveUnderscoretypes: Option[Seq[ObjectiveType]],
                clickUnderscorewindowUnderscoredays: Option[ConversionAttributionWindowDays],
                columns: Seq[ConversionProductReportingColumn],
                conversionUnderscoreproductUnderscoreattributionUnderscoretype: Option[String],
                conversionUnderscoreproductUnderscorebreakdown: Option[String],
                conversionUnderscorereportUnderscoretime: Option[ConversionReportTimeType],
                endUnderscoredate: String,
                granularity: String,
                level: String,
                productUnderscoreskuUnderscoreids: Option[Seq[String]],
                reportUnderscorename: String,
                startUnderscoredate: String,
                viewUnderscorewindowUnderscoredays: Option[ConversionAttributionWindowDays]
                )

object ConversionProductReportRequest {
    /**
     * Creates the codec for converting ConversionProductReportRequest from and to JSON.
     */
    implicit val decoder: Decoder[ConversionProductReportRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[ConversionProductReportRequest] = deriveEncoder
}
