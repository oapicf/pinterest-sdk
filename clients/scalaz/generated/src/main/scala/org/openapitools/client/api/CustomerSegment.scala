package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CustomerSegment._

case class CustomerSegment (
  /* The ID of the ad account that this customer segment belongs to. */
  adAccountId: Option[String],
/* Audience IDs included in the customer segment. */
  audienceIds: List[String],
/* Customer segment created time. Unix timestamp in seconds. */
  createdTime: Option[Integer],
/* Customer segment ID. */
  id: Option[String],
/* Customer segment name. */
  name: String,
/* Indicates whether the customer segment is active or deleted. */
  status: Option[TargetingTemplateStatus],
/* Customer segment updated time. Unix timestamp in seconds. */
  updatedTime: Option[Integer])

object CustomerSegment {
  import DateTimeCodecs._

  implicit val CustomerSegmentCodecJson: CodecJson[CustomerSegment] = CodecJson.derive[CustomerSegment]
  implicit val CustomerSegmentDecoder: EntityDecoder[CustomerSegment] = jsonOf[CustomerSegment]
  implicit val CustomerSegmentEncoder: EntityEncoder[CustomerSegment] = jsonEncoderOf[CustomerSegment]
}
