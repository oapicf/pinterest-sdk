package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LeadFormQuestionType._

case class LeadFormQuestionType (
  
object LeadFormQuestionType {
  import DateTimeCodecs._

  implicit val LeadFormQuestionTypeCodecJson: CodecJson[LeadFormQuestionType] = CodecJson.derive[LeadFormQuestionType]
  implicit val LeadFormQuestionTypeDecoder: EntityDecoder[LeadFormQuestionType] = jsonOf[LeadFormQuestionType]
  implicit val LeadFormQuestionTypeEncoder: EntityEncoder[LeadFormQuestionType] = jsonEncoderOf[LeadFormQuestionType]
}
