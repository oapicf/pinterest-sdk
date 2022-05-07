package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsProductGroupUpdateRequest._

case class CatalogsProductGroupUpdateRequest (
  /* Catalog Feed id pertaining to the catalog product group. */
  feedId: String,
name: String,
description: Option[String],
filters: CatalogsProductGroupFilters)

object CatalogsProductGroupUpdateRequest {
  import DateTimeCodecs._

  implicit val CatalogsProductGroupUpdateRequestCodecJson: CodecJson[CatalogsProductGroupUpdateRequest] = CodecJson.derive[CatalogsProductGroupUpdateRequest]
  implicit val CatalogsProductGroupUpdateRequestDecoder: EntityDecoder[CatalogsProductGroupUpdateRequest] = jsonOf[CatalogsProductGroupUpdateRequest]
  implicit val CatalogsProductGroupUpdateRequestEncoder: EntityEncoder[CatalogsProductGroupUpdateRequest] = jsonEncoderOf[CatalogsProductGroupUpdateRequest]
}
