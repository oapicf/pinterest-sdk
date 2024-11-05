package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LeadsExportCreateRequest._

case class LeadsExportCreateRequest (
  /* Export leads collected on and after start date (UTC). Format: YYYY-MM-DD */
  startDate: String,
/* Export leads collected on and before end date (UTC). Format: YYYY-MM-DD */
  endDate: String,
/* ID for the ad collecting leads */
  adId: String)

object LeadsExportCreateRequest {
  import DateTimeCodecs._

  implicit val LeadsExportCreateRequestCodecJson: CodecJson[LeadsExportCreateRequest] = CodecJson.derive[LeadsExportCreateRequest]
  implicit val LeadsExportCreateRequestDecoder: EntityDecoder[LeadsExportCreateRequest] = jsonOf[LeadsExportCreateRequest]
  implicit val LeadsExportCreateRequestEncoder: EntityEncoder[LeadsExportCreateRequest] = jsonEncoderOf[LeadsExportCreateRequest]
}
