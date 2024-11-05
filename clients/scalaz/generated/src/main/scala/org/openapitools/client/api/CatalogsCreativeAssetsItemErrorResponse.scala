package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsCreativeAssetsItemErrorResponse._

case class CatalogsCreativeAssetsItemErrorResponse (
  catalogType: CatalogsType,
/* The catalog creative assets id in the merchant namespace */
  creativeAssetsId: Option[String],
/* Array with the errors for the item id requested */
  errors: Option[List[ItemValidationEvent]])

object CatalogsCreativeAssetsItemErrorResponse {
  import DateTimeCodecs._

  implicit val CatalogsCreativeAssetsItemErrorResponseCodecJson: CodecJson[CatalogsCreativeAssetsItemErrorResponse] = CodecJson.derive[CatalogsCreativeAssetsItemErrorResponse]
  implicit val CatalogsCreativeAssetsItemErrorResponseDecoder: EntityDecoder[CatalogsCreativeAssetsItemErrorResponse] = jsonOf[CatalogsCreativeAssetsItemErrorResponse]
  implicit val CatalogsCreativeAssetsItemErrorResponseEncoder: EntityEncoder[CatalogsCreativeAssetsItemErrorResponse] = jsonEncoderOf[CatalogsCreativeAssetsItemErrorResponse]
}
