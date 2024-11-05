package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LeadFormArrayResponseItemsInner._

case class LeadFormArrayResponseItemsInner (
  data: Option[LeadFormResponse],
exceptions: Option[List[Exception]])

object LeadFormArrayResponseItemsInner {
  import DateTimeCodecs._

  implicit val LeadFormArrayResponseItemsInnerCodecJson: CodecJson[LeadFormArrayResponseItemsInner] = CodecJson.derive[LeadFormArrayResponseItemsInner]
  implicit val LeadFormArrayResponseItemsInnerDecoder: EntityDecoder[LeadFormArrayResponseItemsInner] = jsonOf[LeadFormArrayResponseItemsInner]
  implicit val LeadFormArrayResponseItemsInnerEncoder: EntityEncoder[LeadFormArrayResponseItemsInner] = jsonEncoderOf[LeadFormArrayResponseItemsInner]
}
