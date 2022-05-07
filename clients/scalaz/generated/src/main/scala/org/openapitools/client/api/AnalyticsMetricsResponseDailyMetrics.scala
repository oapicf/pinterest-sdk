package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AnalyticsMetricsResponseDailyMetrics._

case class AnalyticsMetricsResponseDailyMetrics (
  /* Metrics availablity, e.g., \"READY\". */
  dataStatus: Option[DataStatus],
/* Metrics date (UTC): YYYY-MM-DD. */
  date: Option[String],
/* The metric name and daily value for each requested metric */
  metrics: Option[Map[String, BigDecimal]])

object AnalyticsMetricsResponseDailyMetrics {
  import DateTimeCodecs._
  sealed trait DataStatus
  case object PROCESSING extends DataStatus
  case object READY extends DataStatus
  case object ESTIMATE extends DataStatus
  case object BEFOREBUSINESSCREATED extends DataStatus
  case object BEFOREDATARETENTIONPERIOD extends DataStatus
  case object BEFOREPINDATARETENTIONPERIOD extends DataStatus
  case object BEFOREMETRICSTARTDATE extends DataStatus
  case object BEFORECOREMETRICSTARTDATE extends DataStatus
  case object BEFOREPINFORMATMETRICSTARTDATE extends DataStatus
  case object BEFOREAUDIENCEMETRICSTARTDATE extends DataStatus
  case object BEFOREAUDIENCEMONTHLYMETRICSTARTDATE extends DataStatus
  case object BEFOREVIDEOMETRICSTARTDATE extends DataStatus
  case object BEFORECONVERSIONMETRICSTARTDATE extends DataStatus
  case object PURCHASERSMETRICSMALLERTHANTHRESHOLD extends DataStatus
  case object INBADTAGDATE extends DataStatus
  case object BEFOREPUBLISHEDMETRICSTARTDATE extends DataStatus
  case object BEFOREASSISTMETRICSTARTDATE extends DataStatus
  case object BEFOREPINCREATED extends DataStatus
  case object BEFOREACCOUNTCLAIMED extends DataStatus
  case object BEFOREDEMOGRAPHICFILTERSSTARTDATE extends DataStatus
  case object AUDIENCESEGMENTSMALLERTHANTHRESHOLD extends DataStatus
  case object AUDIENCETOTALSMALLERTHANTHRESHOLD extends DataStatus
  case object BEFOREPRODUCTGROUPFILTERSTARTDATE extends DataStatus

  object DataStatus {
    def toDataStatus(s: String): Option[DataStatus] = s match {
      case "PROCESSING" => Some(PROCESSING)
      case "READY" => Some(READY)
      case "ESTIMATE" => Some(ESTIMATE)
      case "BEFOREBUSINESSCREATED" => Some(BEFOREBUSINESSCREATED)
      case "BEFOREDATARETENTIONPERIOD" => Some(BEFOREDATARETENTIONPERIOD)
      case "BEFOREPINDATARETENTIONPERIOD" => Some(BEFOREPINDATARETENTIONPERIOD)
      case "BEFOREMETRICSTARTDATE" => Some(BEFOREMETRICSTARTDATE)
      case "BEFORECOREMETRICSTARTDATE" => Some(BEFORECOREMETRICSTARTDATE)
      case "BEFOREPINFORMATMETRICSTARTDATE" => Some(BEFOREPINFORMATMETRICSTARTDATE)
      case "BEFOREAUDIENCEMETRICSTARTDATE" => Some(BEFOREAUDIENCEMETRICSTARTDATE)
      case "BEFOREAUDIENCEMONTHLYMETRICSTARTDATE" => Some(BEFOREAUDIENCEMONTHLYMETRICSTARTDATE)
      case "BEFOREVIDEOMETRICSTARTDATE" => Some(BEFOREVIDEOMETRICSTARTDATE)
      case "BEFORECONVERSIONMETRICSTARTDATE" => Some(BEFORECONVERSIONMETRICSTARTDATE)
      case "PURCHASERSMETRICSMALLERTHANTHRESHOLD" => Some(PURCHASERSMETRICSMALLERTHANTHRESHOLD)
      case "INBADTAGDATE" => Some(INBADTAGDATE)
      case "BEFOREPUBLISHEDMETRICSTARTDATE" => Some(BEFOREPUBLISHEDMETRICSTARTDATE)
      case "BEFOREASSISTMETRICSTARTDATE" => Some(BEFOREASSISTMETRICSTARTDATE)
      case "BEFOREPINCREATED" => Some(BEFOREPINCREATED)
      case "BEFOREACCOUNTCLAIMED" => Some(BEFOREACCOUNTCLAIMED)
      case "BEFOREDEMOGRAPHICFILTERSSTARTDATE" => Some(BEFOREDEMOGRAPHICFILTERSSTARTDATE)
      case "AUDIENCESEGMENTSMALLERTHANTHRESHOLD" => Some(AUDIENCESEGMENTSMALLERTHANTHRESHOLD)
      case "AUDIENCETOTALSMALLERTHANTHRESHOLD" => Some(AUDIENCETOTALSMALLERTHANTHRESHOLD)
      case "BEFOREPRODUCTGROUPFILTERSTARTDATE" => Some(BEFOREPRODUCTGROUPFILTERSTARTDATE)
      case _ => None
    }

    def fromDataStatus(x: DataStatus): String = x match {
      case PROCESSING => "PROCESSING"
      case READY => "READY"
      case ESTIMATE => "ESTIMATE"
      case BEFOREBUSINESSCREATED => "BEFOREBUSINESSCREATED"
      case BEFOREDATARETENTIONPERIOD => "BEFOREDATARETENTIONPERIOD"
      case BEFOREPINDATARETENTIONPERIOD => "BEFOREPINDATARETENTIONPERIOD"
      case BEFOREMETRICSTARTDATE => "BEFOREMETRICSTARTDATE"
      case BEFORECOREMETRICSTARTDATE => "BEFORECOREMETRICSTARTDATE"
      case BEFOREPINFORMATMETRICSTARTDATE => "BEFOREPINFORMATMETRICSTARTDATE"
      case BEFOREAUDIENCEMETRICSTARTDATE => "BEFOREAUDIENCEMETRICSTARTDATE"
      case BEFOREAUDIENCEMONTHLYMETRICSTARTDATE => "BEFOREAUDIENCEMONTHLYMETRICSTARTDATE"
      case BEFOREVIDEOMETRICSTARTDATE => "BEFOREVIDEOMETRICSTARTDATE"
      case BEFORECONVERSIONMETRICSTARTDATE => "BEFORECONVERSIONMETRICSTARTDATE"
      case PURCHASERSMETRICSMALLERTHANTHRESHOLD => "PURCHASERSMETRICSMALLERTHANTHRESHOLD"
      case INBADTAGDATE => "INBADTAGDATE"
      case BEFOREPUBLISHEDMETRICSTARTDATE => "BEFOREPUBLISHEDMETRICSTARTDATE"
      case BEFOREASSISTMETRICSTARTDATE => "BEFOREASSISTMETRICSTARTDATE"
      case BEFOREPINCREATED => "BEFOREPINCREATED"
      case BEFOREACCOUNTCLAIMED => "BEFOREACCOUNTCLAIMED"
      case BEFOREDEMOGRAPHICFILTERSSTARTDATE => "BEFOREDEMOGRAPHICFILTERSSTARTDATE"
      case AUDIENCESEGMENTSMALLERTHANTHRESHOLD => "AUDIENCESEGMENTSMALLERTHANTHRESHOLD"
      case AUDIENCETOTALSMALLERTHANTHRESHOLD => "AUDIENCETOTALSMALLERTHANTHRESHOLD"
      case BEFOREPRODUCTGROUPFILTERSTARTDATE => "BEFOREPRODUCTGROUPFILTERSTARTDATE"
    }
  }

  implicit val DataStatusEnumEncoder: EncodeJson[DataStatus] =
    EncodeJson[DataStatus](is => StringEncodeJson(DataStatus.fromDataStatus(is)))

  implicit val DataStatusEnumDecoder: DecodeJson[DataStatus] =
    DecodeJson.optionDecoder[DataStatus](n => n.string.flatMap(jStr => DataStatus.toDataStatus(jStr)), "DataStatus failed to de-serialize")

  implicit val AnalyticsMetricsResponseDailyMetricsCodecJson: CodecJson[AnalyticsMetricsResponseDailyMetrics] = CodecJson.derive[AnalyticsMetricsResponseDailyMetrics]
  implicit val AnalyticsMetricsResponseDailyMetricsDecoder: EntityDecoder[AnalyticsMetricsResponseDailyMetrics] = jsonOf[AnalyticsMetricsResponseDailyMetrics]
  implicit val AnalyticsMetricsResponseDailyMetricsEncoder: EntityEncoder[AnalyticsMetricsResponseDailyMetrics] = jsonEncoderOf[AnalyticsMetricsResponseDailyMetrics]
}
