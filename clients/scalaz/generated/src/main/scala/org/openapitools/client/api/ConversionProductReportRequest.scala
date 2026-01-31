package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionProductReportRequest._

case class ConversionProductReportRequest (
  /* List of ad group ids. <br>Only support ad_group_ids field when level of the report is AD_GROUP. */
  adGroupIds: Option[List[String]],
/* List of campaign ids. <br>Only support campaign_ids field when level of the report is CAMPAIGN. */
  campaignIds: Option[List[String]],
/* List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION']. */
  campaignObjectiveTypes: Option[List[ObjectiveType]],
/* Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days. */
  clickWindowDays: Option[ConversionAttributionWindowDays],
/* Metric and entity columns */
  columns: List[ConversionProductReportingColumn],
conversionProductAttributionType: Option[ConversionProductAttributionType],
conversionProductBreakdown: Option[ConversionProductBreakdown],
/* The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event. */
  conversionReportTime: Option[ConversionReportTimeType],
/* Metric report end date (UTC). Format: YYYY-MM-DD.<br> A max of 1 year is allowed between the start and end date for reports. */
  endDate: String,
/* TOTAL - metrics are aggregated over the specified date range.<br> WEEK - metrics are broken down weekly.<br> MONTH - metrics are broken down monthly. */
  granularity: Granularity,
/* Level of the report */
  level: Level,
/* List of SKU ids. <br>Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP. */
  productSkuIds: Option[List[String]],
/* Name of the conversion product report. */
  reportName: String,
/* Metric report start date (UTC). Format: YYYY-MM-DD.<br> Start date must be after 2024-03-16. 7 day minimum time window for report is required. */
  startDate: String,
/* Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` day. */
  viewWindowDays: Option[ConversionAttributionWindowDays])

object ConversionProductReportRequest {
  import DateTimeCodecs._
  sealed trait ConversionProductAttributionType
  case object DEFAULT extends ConversionProductAttributionType
  case object BRANDATTRIBUTION extends ConversionProductAttributionType

  object ConversionProductAttributionType {
    def toConversionProductAttributionType(s: String): Option[ConversionProductAttributionType] = s match {
      case "DEFAULT" => Some(DEFAULT)
      case "BRANDATTRIBUTION" => Some(BRANDATTRIBUTION)
      case _ => None
    }

    def fromConversionProductAttributionType(x: ConversionProductAttributionType): String = x match {
      case DEFAULT => "DEFAULT"
      case BRANDATTRIBUTION => "BRANDATTRIBUTION"
    }
  }

  implicit val ConversionProductAttributionTypeEnumEncoder: EncodeJson[ConversionProductAttributionType] =
    EncodeJson[ConversionProductAttributionType](is => StringEncodeJson(ConversionProductAttributionType.fromConversionProductAttributionType(is)))

  implicit val ConversionProductAttributionTypeEnumDecoder: DecodeJson[ConversionProductAttributionType] =
    DecodeJson.optionDecoder[ConversionProductAttributionType](n => n.string.flatMap(jStr => ConversionProductAttributionType.toConversionProductAttributionType(jStr)), "ConversionProductAttributionType failed to de-serialize")
  sealed trait ConversionProductBreakdown
  case object PRODUCTBRAND extends ConversionProductBreakdown
  case object PRODUCTCATEGORY extends ConversionProductBreakdown
  case object PRODUCTBRANDANDCATEGORY extends ConversionProductBreakdown
  case object PRODUCTSKU extends ConversionProductBreakdown
  case object PRODUCTSKUGROUP extends ConversionProductBreakdown

  object ConversionProductBreakdown {
    def toConversionProductBreakdown(s: String): Option[ConversionProductBreakdown] = s match {
      case "PRODUCTBRAND" => Some(PRODUCTBRAND)
      case "PRODUCTCATEGORY" => Some(PRODUCTCATEGORY)
      case "PRODUCTBRANDANDCATEGORY" => Some(PRODUCTBRANDANDCATEGORY)
      case "PRODUCTSKU" => Some(PRODUCTSKU)
      case "PRODUCTSKUGROUP" => Some(PRODUCTSKUGROUP)
      case _ => None
    }

    def fromConversionProductBreakdown(x: ConversionProductBreakdown): String = x match {
      case PRODUCTBRAND => "PRODUCTBRAND"
      case PRODUCTCATEGORY => "PRODUCTCATEGORY"
      case PRODUCTBRANDANDCATEGORY => "PRODUCTBRANDANDCATEGORY"
      case PRODUCTSKU => "PRODUCTSKU"
      case PRODUCTSKUGROUP => "PRODUCTSKUGROUP"
    }
  }

  implicit val ConversionProductBreakdownEnumEncoder: EncodeJson[ConversionProductBreakdown] =
    EncodeJson[ConversionProductBreakdown](is => StringEncodeJson(ConversionProductBreakdown.fromConversionProductBreakdown(is)))

  implicit val ConversionProductBreakdownEnumDecoder: DecodeJson[ConversionProductBreakdown] =
    DecodeJson.optionDecoder[ConversionProductBreakdown](n => n.string.flatMap(jStr => ConversionProductBreakdown.toConversionProductBreakdown(jStr)), "ConversionProductBreakdown failed to de-serialize")
  sealed trait Granularity
  case object WEEK extends Granularity
  case object MONTH extends Granularity
  case object TOTAL extends Granularity

  object Granularity {
    def toGranularity(s: String): Option[Granularity] = s match {
      case "WEEK" => Some(WEEK)
      case "MONTH" => Some(MONTH)
      case "TOTAL" => Some(TOTAL)
      case _ => None
    }

    def fromGranularity(x: Granularity): String = x match {
      case WEEK => "WEEK"
      case MONTH => "MONTH"
      case TOTAL => "TOTAL"
    }
  }

  implicit val GranularityEnumEncoder: EncodeJson[Granularity] =
    EncodeJson[Granularity](is => StringEncodeJson(Granularity.fromGranularity(is)))

  implicit val GranularityEnumDecoder: DecodeJson[Granularity] =
    DecodeJson.optionDecoder[Granularity](n => n.string.flatMap(jStr => Granularity.toGranularity(jStr)), "Granularity failed to de-serialize")
  sealed trait Level
  case object ADVERTISER extends Level
  case object CAMPAIGN extends Level
  case object ADGROUP extends Level

  object Level {
    def toLevel(s: String): Option[Level] = s match {
      case "ADVERTISER" => Some(ADVERTISER)
      case "CAMPAIGN" => Some(CAMPAIGN)
      case "ADGROUP" => Some(ADGROUP)
      case _ => None
    }

    def fromLevel(x: Level): String = x match {
      case ADVERTISER => "ADVERTISER"
      case CAMPAIGN => "CAMPAIGN"
      case ADGROUP => "ADGROUP"
    }
  }

  implicit val LevelEnumEncoder: EncodeJson[Level] =
    EncodeJson[Level](is => StringEncodeJson(Level.fromLevel(is)))

  implicit val LevelEnumDecoder: DecodeJson[Level] =
    DecodeJson.optionDecoder[Level](n => n.string.flatMap(jStr => Level.toLevel(jStr)), "Level failed to de-serialize")

  implicit val ConversionProductReportRequestCodecJson: CodecJson[ConversionProductReportRequest] = CodecJson.derive[ConversionProductReportRequest]
  implicit val ConversionProductReportRequestDecoder: EntityDecoder[ConversionProductReportRequest] = jsonOf[ConversionProductReportRequest]
  implicit val ConversionProductReportRequestEncoder: EntityEncoder[ConversionProductReportRequest] = jsonEncoderOf[ConversionProductReportRequest]
}
