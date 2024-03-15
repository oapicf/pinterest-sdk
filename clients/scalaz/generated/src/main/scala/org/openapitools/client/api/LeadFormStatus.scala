package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LeadFormStatus._

case class LeadFormStatus (
  
object LeadFormStatus {
  import DateTimeCodecs._

  implicit val LeadFormStatusCodecJson: CodecJson[LeadFormStatus] = CodecJson.derive[LeadFormStatus]
  implicit val LeadFormStatusDecoder: EntityDecoder[LeadFormStatus] = jsonOf[LeadFormStatus]
  implicit val LeadFormStatusEncoder: EntityEncoder[LeadFormStatus] = jsonEncoderOf[LeadFormStatus]
}
