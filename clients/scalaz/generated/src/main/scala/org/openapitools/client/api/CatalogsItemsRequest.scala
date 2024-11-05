package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsItemsRequest._

case class CatalogsItemsRequest (
  country: Country,
language: CatalogsItemsRequestLanguage,
filters: CatalogsItemsPostFilters)

object CatalogsItemsRequest {
  import DateTimeCodecs._

  implicit val CatalogsItemsRequestCodecJson: CodecJson[CatalogsItemsRequest] = CodecJson.derive[CatalogsItemsRequest]
  implicit val CatalogsItemsRequestDecoder: EntityDecoder[CatalogsItemsRequest] = jsonOf[CatalogsItemsRequest]
  implicit val CatalogsItemsRequestEncoder: EntityEncoder[CatalogsItemsRequest] = jsonEncoderOf[CatalogsItemsRequest]
}
