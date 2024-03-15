package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsProductGroupUpdateRequest._

case class CatalogsProductGroupUpdateRequest (
  name: Option[String],
description: Option[String],
/* boolean indicator of whether the product group is being featured or not */
  isFeatured: Option[Boolean],
filters: Option[CatalogsProductGroupFiltersRequest])

object CatalogsProductGroupUpdateRequest {
  import DateTimeCodecs._

  implicit val CatalogsProductGroupUpdateRequestCodecJson: CodecJson[CatalogsProductGroupUpdateRequest] = CodecJson.derive[CatalogsProductGroupUpdateRequest]
  implicit val CatalogsProductGroupUpdateRequestDecoder: EntityDecoder[CatalogsProductGroupUpdateRequest] = jsonOf[CatalogsProductGroupUpdateRequest]
  implicit val CatalogsProductGroupUpdateRequestEncoder: EntityEncoder[CatalogsProductGroupUpdateRequest] = jsonEncoderOf[CatalogsProductGroupUpdateRequest]
}
