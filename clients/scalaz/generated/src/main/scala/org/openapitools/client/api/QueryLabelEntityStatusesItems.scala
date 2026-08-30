package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import QueryLabelEntityStatusesItems._

case class QueryLabelEntityStatusesItems (
  
object QueryLabelEntityStatusesItems {
  import DateTimeCodecs._

  implicit val QueryLabelEntityStatusesItemsCodecJson: CodecJson[QueryLabelEntityStatusesItems] = CodecJson.derive[QueryLabelEntityStatusesItems]
  implicit val QueryLabelEntityStatusesItemsDecoder: EntityDecoder[QueryLabelEntityStatusesItems] = jsonOf[QueryLabelEntityStatusesItems]
  implicit val QueryLabelEntityStatusesItemsEncoder: EntityEncoder[QueryLabelEntityStatusesItems] = jsonEncoderOf[QueryLabelEntityStatusesItems]
}
