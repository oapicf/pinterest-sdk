package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogBinding._

case class CatalogBinding (
  /* Catalog type */
  catalogType: Option[String],
/* Catalog ID. */
  id: Option[String],
/* Catalog name */
  name: Option[String])

object CatalogBinding {
  import DateTimeCodecs._

  implicit val CatalogBindingCodecJson: CodecJson[CatalogBinding] = CodecJson.derive[CatalogBinding]
  implicit val CatalogBindingDecoder: EntityDecoder[CatalogBinding] = jsonOf[CatalogBinding]
  implicit val CatalogBindingEncoder: EntityEncoder[CatalogBinding] = jsonEncoderOf[CatalogBinding]
}
