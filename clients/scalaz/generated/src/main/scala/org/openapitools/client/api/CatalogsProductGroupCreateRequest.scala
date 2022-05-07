package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsProductGroupCreateRequest._

case class CatalogsProductGroupCreateRequest (
  /* Catalog Feed id pertaining to the catalog product group. */
  feedId: String,
name: String,
description: Option[String],
filters: CatalogsProductGroupFilters)

object CatalogsProductGroupCreateRequest {
  import DateTimeCodecs._

  implicit val CatalogsProductGroupCreateRequestCodecJson: CodecJson[CatalogsProductGroupCreateRequest] = CodecJson.derive[CatalogsProductGroupCreateRequest]
  implicit val CatalogsProductGroupCreateRequestDecoder: EntityDecoder[CatalogsProductGroupCreateRequest] = jsonOf[CatalogsProductGroupCreateRequest]
  implicit val CatalogsProductGroupCreateRequestEncoder: EntityEncoder[CatalogsProductGroupCreateRequest] = jsonEncoderOf[CatalogsProductGroupCreateRequest]
}
