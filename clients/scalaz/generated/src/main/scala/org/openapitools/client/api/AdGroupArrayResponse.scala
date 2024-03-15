package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdGroupArrayResponse._

case class AdGroupArrayResponse (
  items: Option[List[AdGroupArrayResponseElement]])

object AdGroupArrayResponse {
  import DateTimeCodecs._

  implicit val AdGroupArrayResponseCodecJson: CodecJson[AdGroupArrayResponse] = CodecJson.derive[AdGroupArrayResponse]
  implicit val AdGroupArrayResponseDecoder: EntityDecoder[AdGroupArrayResponse] = jsonOf[AdGroupArrayResponse]
  implicit val AdGroupArrayResponseEncoder: EntityEncoder[AdGroupArrayResponse] = jsonEncoderOf[AdGroupArrayResponse]
}
