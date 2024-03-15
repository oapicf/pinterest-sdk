package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import Catalog._

case class Catalog (
  createdAt: Option[OffsetDateTime],
/* ID of the catalog entity. */
  id: String,
updatedAt: Option[OffsetDateTime],
/* A human-friendly name associated to a catalog entity. */
  name: String,
catalogType: CatalogsType)

object Catalog {
  import DateTimeCodecs._

  implicit val CatalogCodecJson: CodecJson[Catalog] = CodecJson.derive[Catalog]
  implicit val CatalogDecoder: EntityDecoder[Catalog] = jsonOf[Catalog]
  implicit val CatalogEncoder: EntityEncoder[Catalog] = jsonEncoderOf[Catalog]
}
