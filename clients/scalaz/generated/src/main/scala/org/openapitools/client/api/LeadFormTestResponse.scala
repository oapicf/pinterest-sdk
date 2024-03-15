package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LeadFormTestResponse._

case class LeadFormTestResponse (
  /* Subscription ID. */
  subscriptionId: Option[String])

object LeadFormTestResponse {
  import DateTimeCodecs._

  implicit val LeadFormTestResponseCodecJson: CodecJson[LeadFormTestResponse] = CodecJson.derive[LeadFormTestResponse]
  implicit val LeadFormTestResponseDecoder: EntityDecoder[LeadFormTestResponse] = jsonOf[LeadFormTestResponse]
  implicit val LeadFormTestResponseEncoder: EntityEncoder[LeadFormTestResponse] = jsonEncoderOf[LeadFormTestResponse]
}
