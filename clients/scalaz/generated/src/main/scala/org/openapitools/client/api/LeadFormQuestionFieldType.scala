package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LeadFormQuestionFieldType._

case class LeadFormQuestionFieldType (
  
object LeadFormQuestionFieldType {
  import DateTimeCodecs._

  implicit val LeadFormQuestionFieldTypeCodecJson: CodecJson[LeadFormQuestionFieldType] = CodecJson.derive[LeadFormQuestionFieldType]
  implicit val LeadFormQuestionFieldTypeDecoder: EntityDecoder[LeadFormQuestionFieldType] = jsonOf[LeadFormQuestionFieldType]
  implicit val LeadFormQuestionFieldTypeEncoder: EntityEncoder[LeadFormQuestionFieldType] = jsonEncoderOf[LeadFormQuestionFieldType]
}
