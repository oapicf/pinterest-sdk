package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import QuerymetrictypesItems._

case class QuerymetrictypesItems (
  
object QuerymetrictypesItems {
  import DateTimeCodecs._

  implicit val QuerymetrictypesItemsCodecJson: CodecJson[QuerymetrictypesItems] = CodecJson.derive[QuerymetrictypesItems]
  implicit val QuerymetrictypesItemsDecoder: EntityDecoder[QuerymetrictypesItems] = jsonOf[QuerymetrictypesItems]
  implicit val QuerymetrictypesItemsEncoder: EntityEncoder[QuerymetrictypesItems] = jsonEncoderOf[QuerymetrictypesItems]
}
