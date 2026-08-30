package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import QueryLabelTypesItems._

case class QueryLabelTypesItems (
  
object QueryLabelTypesItems {
  import DateTimeCodecs._

  implicit val QueryLabelTypesItemsCodecJson: CodecJson[QueryLabelTypesItems] = CodecJson.derive[QueryLabelTypesItems]
  implicit val QueryLabelTypesItemsDecoder: EntityDecoder[QueryLabelTypesItems] = jsonOf[QueryLabelTypesItems]
  implicit val QueryLabelTypesItemsEncoder: EntityEncoder[QueryLabelTypesItems] = jsonEncoderOf[QueryLabelTypesItems]
}
