package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CustomerSegmentList200Response._

case class CustomerSegmentList200Response (
  bookmark: Option[String],
items: List[CustomerSegment])

object CustomerSegmentList200Response {
  import DateTimeCodecs._

  implicit val CustomerSegmentList200ResponseCodecJson: CodecJson[CustomerSegmentList200Response] = CodecJson.derive[CustomerSegmentList200Response]
  implicit val CustomerSegmentList200ResponseDecoder: EntityDecoder[CustomerSegmentList200Response] = jsonOf[CustomerSegmentList200Response]
  implicit val CustomerSegmentList200ResponseEncoder: EntityEncoder[CustomerSegmentList200Response] = jsonEncoderOf[CustomerSegmentList200Response]
}
