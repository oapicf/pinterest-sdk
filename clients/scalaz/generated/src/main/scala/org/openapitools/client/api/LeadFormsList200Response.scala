package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LeadFormsList200Response._

case class LeadFormsList200Response (
  items: List[LeadFormResponse],
bookmark: Option[String])

object LeadFormsList200Response {
  import DateTimeCodecs._

  implicit val LeadFormsList200ResponseCodecJson: CodecJson[LeadFormsList200Response] = CodecJson.derive[LeadFormsList200Response]
  implicit val LeadFormsList200ResponseDecoder: EntityDecoder[LeadFormsList200Response] = jsonOf[LeadFormsList200Response]
  implicit val LeadFormsList200ResponseEncoder: EntityEncoder[LeadFormsList200Response] = jsonEncoderOf[LeadFormsList200Response]
}
