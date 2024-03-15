package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LeadFormTestRequest._

case class LeadFormTestRequest (
  /* Test lead answers. Should follow the creation order. */
  answers: List[String])

object LeadFormTestRequest {
  import DateTimeCodecs._

  implicit val LeadFormTestRequestCodecJson: CodecJson[LeadFormTestRequest] = CodecJson.derive[LeadFormTestRequest]
  implicit val LeadFormTestRequestDecoder: EntityDecoder[LeadFormTestRequest] = jsonOf[LeadFormTestRequest]
  implicit val LeadFormTestRequestEncoder: EntityEncoder[LeadFormTestRequest] = jsonEncoderOf[LeadFormTestRequest]
}
