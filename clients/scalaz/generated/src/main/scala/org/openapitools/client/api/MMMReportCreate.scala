package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MMMReportCreate._

case class MMMReportCreate (
  /* Advertiser IDs for multi-advertiser report */
  advertiserIds: Option[List[String]],
/* Metric and entity columns */
  columns: List[MMMReportingColumn],
/* A List of countries for filtering */
  countries: Option[List[TargetingAdvertiserCountry]],
/* List of custom column IDs */
  customColumnIds: Option[List[String]],
/* Metric report end date (UTC). Format: YYYY-MM-DD */
  endDate: String,
/*   DAY - metrics are broken down daily.    WEEK - metrics are broken down weekly. */
  granularity: MMMReportGranularity,
/* Level of the report */
  level: MMMReportLevel,
/* Name of the Marketing Mix Modeling (MMM) report */
  reportName: String,
/* Metric report start date (UTC). Format: YYYY-MM-DD */
  startDate: String,
/* List of targeting types */
  targetingTypes: List[MMMReportingTargetingType])

object MMMReportCreate {
  import DateTimeCodecs._

  implicit val MMMReportCreateCodecJson: CodecJson[MMMReportCreate] = CodecJson.derive[MMMReportCreate]
  implicit val MMMReportCreateDecoder: EntityDecoder[MMMReportCreate] = jsonOf[MMMReportCreate]
  implicit val MMMReportCreateEncoder: EntityEncoder[MMMReportCreate] = jsonEncoderOf[MMMReportCreate]
}
