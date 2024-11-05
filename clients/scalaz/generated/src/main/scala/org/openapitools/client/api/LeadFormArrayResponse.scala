package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LeadFormArrayResponse._

case class LeadFormArrayResponse (
  items: Option[List[LeadFormArrayResponseItemsInner]])

object LeadFormArrayResponse {
  import DateTimeCodecs._

  implicit val LeadFormArrayResponseCodecJson: CodecJson[LeadFormArrayResponse] = CodecJson.derive[LeadFormArrayResponse]
  implicit val LeadFormArrayResponseDecoder: EntityDecoder[LeadFormArrayResponse] = jsonOf[LeadFormArrayResponse]
  implicit val LeadFormArrayResponseEncoder: EntityEncoder[LeadFormArrayResponse] = jsonEncoderOf[LeadFormArrayResponse]
}
