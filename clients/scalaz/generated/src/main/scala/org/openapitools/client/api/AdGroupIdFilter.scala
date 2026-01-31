package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdGroupIdFilter._

case class AdGroupIdFilter (
  /* List of ad group ids */
  adGroupIds: Option[List[String]])

object AdGroupIdFilter {
  import DateTimeCodecs._

  implicit val AdGroupIdFilterCodecJson: CodecJson[AdGroupIdFilter] = CodecJson.derive[AdGroupIdFilter]
  implicit val AdGroupIdFilterDecoder: EntityDecoder[AdGroupIdFilter] = jsonOf[AdGroupIdFilter]
  implicit val AdGroupIdFilterEncoder: EntityEncoder[AdGroupIdFilter] = jsonEncoderOf[AdGroupIdFilter]
}
