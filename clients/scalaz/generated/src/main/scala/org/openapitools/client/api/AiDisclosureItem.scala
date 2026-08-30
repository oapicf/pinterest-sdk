package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AiDisclosureItem._

case class AiDisclosureItem (
  
object AiDisclosureItem {
  import DateTimeCodecs._

  implicit val AiDisclosureItemCodecJson: CodecJson[AiDisclosureItem] = CodecJson.derive[AiDisclosureItem]
  implicit val AiDisclosureItemDecoder: EntityDecoder[AiDisclosureItem] = jsonOf[AiDisclosureItem]
  implicit val AiDisclosureItemEncoder: EntityEncoder[AiDisclosureItem] = jsonEncoderOf[AiDisclosureItem]
}
