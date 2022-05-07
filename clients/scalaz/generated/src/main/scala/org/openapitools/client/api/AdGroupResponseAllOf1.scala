package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdGroupResponseAllOf1._

case class AdGroupResponseAllOf1 (
  /* Campaign ID of the ad group. */
  campaignId: Option[String],
billableEvent: Option[ActionType],
/* Ad group ID. */
  id: Option[String],
/* Always \"adgroup\". */
  `type`: Option[String],
/* Advertiser ID. */
  adAccountId: Option[String],
/* Ad group creation time. Unix timestamp in seconds. */
  createdTime: Option[Integer],
/* Ad group last update time. Unix timestamp in seconds. */
  updatedTime: Option[Integer])

object AdGroupResponseAllOf1 {
  import DateTimeCodecs._

  implicit val AdGroupResponseAllOf1CodecJson: CodecJson[AdGroupResponseAllOf1] = CodecJson.derive[AdGroupResponseAllOf1]
  implicit val AdGroupResponseAllOf1Decoder: EntityDecoder[AdGroupResponseAllOf1] = jsonOf[AdGroupResponseAllOf1]
  implicit val AdGroupResponseAllOf1Encoder: EntityEncoder[AdGroupResponseAllOf1] = jsonEncoderOf[AdGroupResponseAllOf1]
}
