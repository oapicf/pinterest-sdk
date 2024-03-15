package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsItemValidationIssue._

case class CatalogsItemValidationIssue (
  
object CatalogsItemValidationIssue {
  import DateTimeCodecs._

  implicit val CatalogsItemValidationIssueCodecJson: CodecJson[CatalogsItemValidationIssue] = CodecJson.derive[CatalogsItemValidationIssue]
  implicit val CatalogsItemValidationIssueDecoder: EntityDecoder[CatalogsItemValidationIssue] = jsonOf[CatalogsItemValidationIssue]
  implicit val CatalogsItemValidationIssueEncoder: EntityEncoder[CatalogsItemValidationIssue] = jsonEncoderOf[CatalogsItemValidationIssue]
}
