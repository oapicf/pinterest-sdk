package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsItems._

case class CatalogsItems (
  /* Array with catalogs items */
  items: Option[List[ItemResponse]])

object CatalogsItems {
  import DateTimeCodecs._

  implicit val CatalogsItemsCodecJson: CodecJson[CatalogsItems] = CodecJson.derive[CatalogsItems]
  implicit val CatalogsItemsDecoder: EntityDecoder[CatalogsItems] = jsonOf[CatalogsItems]
  implicit val CatalogsItemsEncoder: EntityEncoder[CatalogsItems] = jsonEncoderOf[CatalogsItems]
}
