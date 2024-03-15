package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsListProductsByFilterRequestOneOf._

case class CatalogsListProductsByFilterRequestOneOf (
  /* Catalog Feed id pertaining to the catalog product group filter. */
  feedId: String,
filters: CatalogsProductGroupFilters)

object CatalogsListProductsByFilterRequestOneOf {
  import DateTimeCodecs._

  implicit val CatalogsListProductsByFilterRequestOneOfCodecJson: CodecJson[CatalogsListProductsByFilterRequestOneOf] = CodecJson.derive[CatalogsListProductsByFilterRequestOneOf]
  implicit val CatalogsListProductsByFilterRequestOneOfDecoder: EntityDecoder[CatalogsListProductsByFilterRequestOneOf] = jsonOf[CatalogsListProductsByFilterRequestOneOf]
  implicit val CatalogsListProductsByFilterRequestOneOfEncoder: EntityEncoder[CatalogsListProductsByFilterRequestOneOf] = jsonEncoderOf[CatalogsListProductsByFilterRequestOneOf]
}
