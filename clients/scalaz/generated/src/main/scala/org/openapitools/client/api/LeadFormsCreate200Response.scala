package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LeadFormsCreate200Response._

case class LeadFormsCreate200Response (
  items: List[LeadFormsCreate200ResponseItemsInner])

object LeadFormsCreate200Response {
  import DateTimeCodecs._

  implicit val LeadFormsCreate200ResponseCodecJson: CodecJson[LeadFormsCreate200Response] = CodecJson.derive[LeadFormsCreate200Response]
  implicit val LeadFormsCreate200ResponseDecoder: EntityDecoder[LeadFormsCreate200Response] = jsonOf[LeadFormsCreate200Response]
  implicit val LeadFormsCreate200ResponseEncoder: EntityEncoder[LeadFormsCreate200Response] = jsonEncoderOf[LeadFormsCreate200Response]
}
