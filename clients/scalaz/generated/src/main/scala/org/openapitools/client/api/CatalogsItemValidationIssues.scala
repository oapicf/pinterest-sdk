package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsItemValidationIssues._

case class CatalogsItemValidationIssues (
  /* Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation. */
  itemNumber: Integer,
/* The merchant-created unique ID that represents the product. */
  itemId: String,
errors: CatalogsItemValidationErrors,
warnings: CatalogsItemValidationWarnings)

object CatalogsItemValidationIssues {
  import DateTimeCodecs._

  implicit val CatalogsItemValidationIssuesCodecJson: CodecJson[CatalogsItemValidationIssues] = CodecJson.derive[CatalogsItemValidationIssues]
  implicit val CatalogsItemValidationIssuesDecoder: EntityDecoder[CatalogsItemValidationIssues] = jsonOf[CatalogsItemValidationIssues]
  implicit val CatalogsItemValidationIssuesEncoder: EntityEncoder[CatalogsItemValidationIssues] = jsonEncoderOf[CatalogsItemValidationIssues]
}
