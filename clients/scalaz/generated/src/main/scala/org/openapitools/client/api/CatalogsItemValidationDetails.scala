package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsItemValidationDetails._

case class CatalogsItemValidationDetails (
  attributeName: NullableCatalogsItemFieldType,
/* Provided value that caused the validation issue. */
  providedValue: String)

object CatalogsItemValidationDetails {
  import DateTimeCodecs._

  implicit val CatalogsItemValidationDetailsCodecJson: CodecJson[CatalogsItemValidationDetails] = CodecJson.derive[CatalogsItemValidationDetails]
  implicit val CatalogsItemValidationDetailsDecoder: EntityDecoder[CatalogsItemValidationDetails] = jsonOf[CatalogsItemValidationDetails]
  implicit val CatalogsItemValidationDetailsEncoder: EntityEncoder[CatalogsItemValidationDetails] = jsonEncoderOf[CatalogsItemValidationDetails]
}
