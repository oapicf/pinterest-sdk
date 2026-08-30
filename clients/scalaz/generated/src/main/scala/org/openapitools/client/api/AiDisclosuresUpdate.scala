package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AiDisclosuresUpdate._

case class AiDisclosuresUpdate (
  /* List of AI disclosure declarations the creator has made about this Pin. */
  values: Option[List[AiDisclosureItem]])

object AiDisclosuresUpdate {
  import DateTimeCodecs._

  implicit val AiDisclosuresUpdateCodecJson: CodecJson[AiDisclosuresUpdate] = CodecJson.derive[AiDisclosuresUpdate]
  implicit val AiDisclosuresUpdateDecoder: EntityDecoder[AiDisclosuresUpdate] = jsonOf[AiDisclosuresUpdate]
  implicit val AiDisclosuresUpdateEncoder: EntityEncoder[AiDisclosuresUpdate] = jsonEncoderOf[AiDisclosuresUpdate]
}
