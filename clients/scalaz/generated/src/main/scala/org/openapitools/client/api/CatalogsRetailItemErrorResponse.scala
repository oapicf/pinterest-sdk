package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsRetailItemErrorResponse._

case class CatalogsRetailItemErrorResponse (
  catalogType: CatalogsType,
/* The catalog item id in the merchant namespace */
  itemId: Option[String],
/* Array with the errors for the item id requested */
  errors: Option[List[ItemValidationEvent]])

object CatalogsRetailItemErrorResponse {
  import DateTimeCodecs._

  implicit val CatalogsRetailItemErrorResponseCodecJson: CodecJson[CatalogsRetailItemErrorResponse] = CodecJson.derive[CatalogsRetailItemErrorResponse]
  implicit val CatalogsRetailItemErrorResponseDecoder: EntityDecoder[CatalogsRetailItemErrorResponse] = jsonOf[CatalogsRetailItemErrorResponse]
  implicit val CatalogsRetailItemErrorResponseEncoder: EntityEncoder[CatalogsRetailItemErrorResponse] = jsonEncoderOf[CatalogsRetailItemErrorResponse]
}
