package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CustomerSegmentCreate._

case class CustomerSegmentCreate (
  /* Audience IDs included in the customer segment. */
  audienceIds: List[String],
/* Customer segment name. */
  name: String)

object CustomerSegmentCreate {
  import DateTimeCodecs._

  implicit val CustomerSegmentCreateCodecJson: CodecJson[CustomerSegmentCreate] = CodecJson.derive[CustomerSegmentCreate]
  implicit val CustomerSegmentCreateDecoder: EntityDecoder[CustomerSegmentCreate] = jsonOf[CustomerSegmentCreate]
  implicit val CustomerSegmentCreateEncoder: EntityEncoder[CustomerSegmentCreate] = jsonEncoderOf[CustomerSegmentCreate]
}
