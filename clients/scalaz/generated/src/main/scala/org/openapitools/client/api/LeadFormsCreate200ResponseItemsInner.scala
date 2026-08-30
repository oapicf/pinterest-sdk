package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LeadFormsCreate200ResponseItemsInner._

case class LeadFormsCreate200ResponseItemsInner (
  data: Option[LeadForm],
exceptions: Option[List[BatchItemException]])

object LeadFormsCreate200ResponseItemsInner {
  import DateTimeCodecs._

  implicit val LeadFormsCreate200ResponseItemsInnerCodecJson: CodecJson[LeadFormsCreate200ResponseItemsInner] = CodecJson.derive[LeadFormsCreate200ResponseItemsInner]
  implicit val LeadFormsCreate200ResponseItemsInnerDecoder: EntityDecoder[LeadFormsCreate200ResponseItemsInner] = jsonOf[LeadFormsCreate200ResponseItemsInner]
  implicit val LeadFormsCreate200ResponseItemsInnerEncoder: EntityEncoder[LeadFormsCreate200ResponseItemsInner] = jsonEncoderOf[LeadFormsCreate200ResponseItemsInner]
}
