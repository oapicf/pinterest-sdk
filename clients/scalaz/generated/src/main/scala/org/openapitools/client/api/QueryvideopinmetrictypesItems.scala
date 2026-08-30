package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import QueryvideopinmetrictypesItems._

case class QueryvideopinmetrictypesItems (
  
object QueryvideopinmetrictypesItems {
  import DateTimeCodecs._

  implicit val QueryvideopinmetrictypesItemsCodecJson: CodecJson[QueryvideopinmetrictypesItems] = CodecJson.derive[QueryvideopinmetrictypesItems]
  implicit val QueryvideopinmetrictypesItemsDecoder: EntityDecoder[QueryvideopinmetrictypesItems] = jsonOf[QueryvideopinmetrictypesItems]
  implicit val QueryvideopinmetrictypesItemsEncoder: EntityEncoder[QueryvideopinmetrictypesItems] = jsonEncoderOf[QueryvideopinmetrictypesItems]
}
