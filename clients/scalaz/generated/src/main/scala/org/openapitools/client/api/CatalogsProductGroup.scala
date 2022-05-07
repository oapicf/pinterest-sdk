package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsProductGroup._

case class CatalogsProductGroup (
  /* ID of the catalog product group. */
  id: String,
/* Name of catalog product group */
  name: Option[String],
description: Option[String],
filters: CatalogsProductGroupFilters,
`type`: Option[CatalogsProductGroupType],
status: Option[CatalogsProductGroupStatus],
/* id of the catalogs feed belonging to this catalog product group */
  feedId: Option[String],
/* Unix timestamp in seconds of when catalog product group was created. */
  createdAt: Option[Integer],
/* Unix timestamp in seconds of last time catalog product group was updated. */
  updatedAt: Option[Integer])

object CatalogsProductGroup {
  import DateTimeCodecs._

  implicit val CatalogsProductGroupCodecJson: CodecJson[CatalogsProductGroup] = CodecJson.derive[CatalogsProductGroup]
  implicit val CatalogsProductGroupDecoder: EntityDecoder[CatalogsProductGroup] = jsonOf[CatalogsProductGroup]
  implicit val CatalogsProductGroupEncoder: EntityEncoder[CatalogsProductGroup] = jsonEncoderOf[CatalogsProductGroup]
}
