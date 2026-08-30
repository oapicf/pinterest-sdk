package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogUpdate._

case class CatalogUpdate (
  catalogType: Option[CatalogsType],
/* A human-friendly name associated to a catalog entity. */
  name: Option[String])

object CatalogUpdate {
  import DateTimeCodecs._

  implicit val CatalogUpdateCodecJson: CodecJson[CatalogUpdate] = CodecJson.derive[CatalogUpdate]
  implicit val CatalogUpdateDecoder: EntityDecoder[CatalogUpdate] = jsonOf[CatalogUpdate]
  implicit val CatalogUpdateEncoder: EntityEncoder[CatalogUpdate] = jsonEncoderOf[CatalogUpdate]
}
