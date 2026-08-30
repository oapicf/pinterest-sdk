package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LeadsExportsCreate._

case class LeadsExportsCreate (
  /* ID for the ad collecting leads. */
  adId: String,
/* Export leads collected on and before end date (UTC). Format: YYYY-MM-DD. */
  endDate: String,
/* Export leads collected on and after start date (UTC). Format: YYYY-MM-DD. */
  startDate: String)

object LeadsExportsCreate {
  import DateTimeCodecs._

  implicit val LeadsExportsCreateCodecJson: CodecJson[LeadsExportsCreate] = CodecJson.derive[LeadsExportsCreate]
  implicit val LeadsExportsCreateDecoder: EntityDecoder[LeadsExportsCreate] = jsonOf[LeadsExportsCreate]
  implicit val LeadsExportsCreateEncoder: EntityEncoder[LeadsExportsCreate] = jsonEncoderOf[LeadsExportsCreate]
}
