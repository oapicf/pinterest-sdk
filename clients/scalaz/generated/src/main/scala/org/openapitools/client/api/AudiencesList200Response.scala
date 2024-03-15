package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AudiencesList200Response._

case class AudiencesList200Response (
  items: List[Audience],
bookmark: Option[String])

object AudiencesList200Response {
  import DateTimeCodecs._

  implicit val AudiencesList200ResponseCodecJson: CodecJson[AudiencesList200Response] = CodecJson.derive[AudiencesList200Response]
  implicit val AudiencesList200ResponseDecoder: EntityDecoder[AudiencesList200Response] = jsonOf[AudiencesList200Response]
  implicit val AudiencesList200ResponseEncoder: EntityEncoder[AudiencesList200Response] = jsonEncoderOf[AudiencesList200Response]
}
