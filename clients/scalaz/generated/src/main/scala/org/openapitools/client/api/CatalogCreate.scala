package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogCreate._

case class CatalogCreate (
  catalogType: CatalogsType,
/* A human-friendly name associated to a catalog entity. */
  name: String)

object CatalogCreate {
  import DateTimeCodecs._

  implicit val CatalogCreateCodecJson: CodecJson[CatalogCreate] = CodecJson.derive[CatalogCreate]
  implicit val CatalogCreateDecoder: EntityDecoder[CatalogCreate] = jsonOf[CatalogCreate]
  implicit val CatalogCreateEncoder: EntityEncoder[CatalogCreate] = jsonEncoderOf[CatalogCreate]
}
