package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LeadFormQuestion._

case class LeadFormQuestion (
  questionType: Option[LeadFormQuestionType],
customQuestionFieldType: Option[LeadFormQuestionFieldType],
/* Question label for a custom question. */
  customQuestionLabel: Option[String],
/* Question options for a custom question. */
  customQuestionOptions: Option[List[String]])

object LeadFormQuestion {
  import DateTimeCodecs._

  implicit val LeadFormQuestionCodecJson: CodecJson[LeadFormQuestion] = CodecJson.derive[LeadFormQuestion]
  implicit val LeadFormQuestionDecoder: EntityDecoder[LeadFormQuestion] = jsonOf[LeadFormQuestion]
  implicit val LeadFormQuestionEncoder: EntityEncoder[LeadFormQuestion] = jsonEncoderOf[LeadFormQuestion]
}
