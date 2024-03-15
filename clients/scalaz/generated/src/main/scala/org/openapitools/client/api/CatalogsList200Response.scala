package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsList200Response._

case class CatalogsList200Response (
  items: List[Catalog],
bookmark: Option[String])

object CatalogsList200Response {
  import DateTimeCodecs._

  implicit val CatalogsList200ResponseCodecJson: CodecJson[CatalogsList200Response] = CodecJson.derive[CatalogsList200Response]
  implicit val CatalogsList200ResponseDecoder: EntityDecoder[CatalogsList200Response] = jsonOf[CatalogsList200Response]
  implicit val CatalogsList200ResponseEncoder: EntityEncoder[CatalogsList200Response] = jsonEncoderOf[CatalogsList200Response]
}
