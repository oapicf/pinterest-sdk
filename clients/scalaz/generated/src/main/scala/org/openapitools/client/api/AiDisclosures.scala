package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AiDisclosures._

case class AiDisclosures (
  /* List of AI disclosure declarations the creator has made about this Pin. */
  values: List[AiDisclosureItem])

object AiDisclosures {
  import DateTimeCodecs._

  implicit val AiDisclosuresCodecJson: CodecJson[AiDisclosures] = CodecJson.derive[AiDisclosures]
  implicit val AiDisclosuresDecoder: EntityDecoder[AiDisclosures] = jsonOf[AiDisclosures]
  implicit val AiDisclosuresEncoder: EntityEncoder[AiDisclosures] = jsonEncoderOf[AiDisclosures]
}
