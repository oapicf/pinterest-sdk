package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TemplateResponse._

case class TemplateResponse (
  /* ID of the Ad Account that owns the template */
  adAccountId: Option[String],
/* IDs of the Ad Accounts that have access to this template */
  adAccountIds: Option[List[String]],
/* The length of the sliding window over which click conversions will be attributed */
  clickWindowDays: Option[BigDecimal],
/* A list of columns to be included in the report */
  columns: Option[List[Columns]],
/* Conversion report time type */
  conversionReportTimeType: Option[ConversionReportTimeType],
/* The surface used to create this template */
  creationSource: Option[CreationSource],
/* A list of custom column IDs */
  customColumnIds: Option[List[String]],
dateRange: Option[TemplateResponseDateRange],
/* The length of the sliding window over which engagement conversions will be attributed */
  engagementWindowDays: Option[BigDecimal],
/* A JSON representation of any filters to be applied before returning report data. Each filter object should contain all of the following fields:<br> \"field\": The column name<br> \"operator\": The operator. Allowed operators: [\"=\", \"!=\", \"in\", \"not_in\", \"~\", \">\", \"<\", \"contains_substring\"]<br> \"value\": A single value or a list of values */
  filtersJson: Option[String],
granularity: Option[Granularity],
/* Template ID */
  id: Option[String],
/* The filter on the conversion ingestion source method for conversion metrics */
  ingestionSources: Option[List[IngestionSources]],
/* A boolean that indicates if the template has been deleted */
  isDeleted: Option[Boolean],
/* A boolean value that indicates if the user owns the template */
  isOwnedByUser: Option[Boolean],
/* A boolean value that indicates if this template has been used to create a scheduled report */
  isScheduled: Option[Boolean],
/* Template Name */
  name: Option[String],
/* The number of days prior to the day the report will be delivered at which the report will end */
  reportEndRelativeDaysInPast: Option[BigDecimal],
reportFormat: Option[DataOutputFormat],
reportLevel: Option[MetricsReportingLevel],
/* The number of days prior to the day the report will be delivered at which the report will start */
  reportStartRelativeDaysInPast: Option[BigDecimal],
/* Reporting template type */
  `type`: Option[`Type`],
/* Time of last update in seconds since Unix epoch */
  updatedTime: Option[BigDecimal],
/* ID of the user who created the template */
  userId: Option[String],
/* The length of the sliding window over which view conversions will be attributed */
  viewWindowDays: Option[BigDecimal])

object TemplateResponse {
  import DateTimeCodecs._
  sealed trait List[Columns]

  object List[Columns] {
    def toList[Columns](s: String): Option[List[Columns]] = s match {
      case _ => None
    }

    def fromList[Columns](x: List[Columns]): String = x match {
    }
  }

  implicit val List[Columns]EnumEncoder: EncodeJson[List[Columns]] =
    EncodeJson[List[Columns]](is => StringEncodeJson(List[Columns].fromList[Columns](is)))

  implicit val List[Columns]EnumDecoder: DecodeJson[List[Columns]] =
    DecodeJson.optionDecoder[List[Columns]](n => n.string.flatMap(jStr => List[Columns].toList[Columns](jStr)), "List[Columns] failed to de-serialize")
  sealed trait ConversionReportTimeType
  case object TIMEOFADACTION extends ConversionReportTimeType
  case object TIMEOFCONVERSION extends ConversionReportTimeType

  object ConversionReportTimeType {
    def toConversionReportTimeType(s: String): Option[ConversionReportTimeType] = s match {
      case "TIMEOFADACTION" => Some(TIMEOFADACTION)
      case "TIMEOFCONVERSION" => Some(TIMEOFCONVERSION)
      case _ => None
    }

    def fromConversionReportTimeType(x: ConversionReportTimeType): String = x match {
      case TIMEOFADACTION => "TIMEOFADACTION"
      case TIMEOFCONVERSION => "TIMEOFCONVERSION"
    }
  }

  implicit val ConversionReportTimeTypeEnumEncoder: EncodeJson[ConversionReportTimeType] =
    EncodeJson[ConversionReportTimeType](is => StringEncodeJson(ConversionReportTimeType.fromConversionReportTimeType(is)))

  implicit val ConversionReportTimeTypeEnumDecoder: DecodeJson[ConversionReportTimeType] =
    DecodeJson.optionDecoder[ConversionReportTimeType](n => n.string.flatMap(jStr => ConversionReportTimeType.toConversionReportTimeType(jStr)), "ConversionReportTimeType failed to de-serialize")
  sealed trait CreationSource
  case object ADSAPI extends CreationSource
  case object ADSMANAGERREPORTINGPAGE extends CreationSource
  case object ADSMANAGERREPORTBUILDER extends CreationSource

  object CreationSource {
    def toCreationSource(s: String): Option[CreationSource] = s match {
      case "ADSAPI" => Some(ADSAPI)
      case "ADSMANAGERREPORTINGPAGE" => Some(ADSMANAGERREPORTINGPAGE)
      case "ADSMANAGERREPORTBUILDER" => Some(ADSMANAGERREPORTBUILDER)
      case _ => None
    }

    def fromCreationSource(x: CreationSource): String = x match {
      case ADSAPI => "ADSAPI"
      case ADSMANAGERREPORTINGPAGE => "ADSMANAGERREPORTINGPAGE"
      case ADSMANAGERREPORTBUILDER => "ADSMANAGERREPORTBUILDER"
    }
  }

  implicit val CreationSourceEnumEncoder: EncodeJson[CreationSource] =
    EncodeJson[CreationSource](is => StringEncodeJson(CreationSource.fromCreationSource(is)))

  implicit val CreationSourceEnumDecoder: DecodeJson[CreationSource] =
    DecodeJson.optionDecoder[CreationSource](n => n.string.flatMap(jStr => CreationSource.toCreationSource(jStr)), "CreationSource failed to de-serialize")
  sealed trait List[IngestionSources]

  object List[IngestionSources] {
    def toList[IngestionSources](s: String): Option[List[IngestionSources]] = s match {
      case _ => None
    }

    def fromList[IngestionSources](x: List[IngestionSources]): String = x match {
    }
  }

  implicit val List[IngestionSources]EnumEncoder: EncodeJson[List[IngestionSources]] =
    EncodeJson[List[IngestionSources]](is => StringEncodeJson(List[IngestionSources].fromList[IngestionSources](is)))

  implicit val List[IngestionSources]EnumDecoder: DecodeJson[List[IngestionSources]] =
    DecodeJson.optionDecoder[List[IngestionSources]](n => n.string.flatMap(jStr => List[IngestionSources].toList[IngestionSources](jStr)), "List[IngestionSources] failed to de-serialize")
  sealed trait `Type`
  case object UNSPECIFIED extends `Type`
  case object BULK extends `Type`
  case object OVERVIEW extends `Type`
  case object TABLE extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "UNSPECIFIED" => Some(UNSPECIFIED)
      case "BULK" => Some(BULK)
      case "OVERVIEW" => Some(OVERVIEW)
      case "TABLE" => Some(TABLE)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case UNSPECIFIED => "UNSPECIFIED"
      case BULK => "BULK"
      case OVERVIEW => "OVERVIEW"
      case TABLE => "TABLE"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val TemplateResponseCodecJson: CodecJson[TemplateResponse] = CodecJson.derive[TemplateResponse]
  implicit val TemplateResponseDecoder: EntityDecoder[TemplateResponse] = jsonOf[TemplateResponse]
  implicit val TemplateResponseEncoder: EntityEncoder[TemplateResponse] = jsonEncoderOf[TemplateResponse]
}
