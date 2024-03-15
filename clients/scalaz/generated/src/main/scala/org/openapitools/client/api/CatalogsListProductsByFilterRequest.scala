package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsListProductsByFilterRequest._

case class CatalogsListProductsByFilterRequest (
  /* Catalog Feed id pertaining to the catalog product group filter. */
  feedId: String,
filters: CatalogsProductGroupFilters)

object CatalogsListProductsByFilterRequest {
  import DateTimeCodecs._

  implicit val CatalogsListProductsByFilterRequestCodecJson: CodecJson[CatalogsListProductsByFilterRequest] = CodecJson.derive[CatalogsListProductsByFilterRequest]
  implicit val CatalogsListProductsByFilterRequestDecoder: EntityDecoder[CatalogsListProductsByFilterRequest] = jsonOf[CatalogsListProductsByFilterRequest]
  implicit val CatalogsListProductsByFilterRequestEncoder: EntityEncoder[CatalogsListProductsByFilterRequest] = jsonEncoderOf[CatalogsListProductsByFilterRequest]
}
