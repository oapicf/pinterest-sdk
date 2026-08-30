package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LeadFormTestCreate._

case class LeadFormTestCreate (
  /* Test lead answers. Should follow the creation order. */
  answers: List[String])

object LeadFormTestCreate {
  import DateTimeCodecs._

  implicit val LeadFormTestCreateCodecJson: CodecJson[LeadFormTestCreate] = CodecJson.derive[LeadFormTestCreate]
  implicit val LeadFormTestCreateDecoder: EntityDecoder[LeadFormTestCreate] = jsonOf[LeadFormTestCreate]
  implicit val LeadFormTestCreateEncoder: EntityEncoder[LeadFormTestCreate] = jsonEncoderOf[LeadFormTestCreate]
}
