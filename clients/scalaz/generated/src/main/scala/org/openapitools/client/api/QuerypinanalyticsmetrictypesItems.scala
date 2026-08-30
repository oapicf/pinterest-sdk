package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import QuerypinanalyticsmetrictypesItems._

case class QuerypinanalyticsmetrictypesItems (
  
object QuerypinanalyticsmetrictypesItems {
  import DateTimeCodecs._

  implicit val QuerypinanalyticsmetrictypesItemsCodecJson: CodecJson[QuerypinanalyticsmetrictypesItems] = CodecJson.derive[QuerypinanalyticsmetrictypesItems]
  implicit val QuerypinanalyticsmetrictypesItemsDecoder: EntityDecoder[QuerypinanalyticsmetrictypesItems] = jsonOf[QuerypinanalyticsmetrictypesItems]
  implicit val QuerypinanalyticsmetrictypesItemsEncoder: EntityEncoder[QuerypinanalyticsmetrictypesItems] = jsonEncoderOf[QuerypinanalyticsmetrictypesItems]
}
