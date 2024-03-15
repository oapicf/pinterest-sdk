package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogProductGroup._

case class CatalogProductGroup (
  /* ID of the catalog product group. */
  id: Option[String],
/* Merchant ID pertaining to the owner of the catalog product group. */
  merchantId: Option[String],
/* Name of catalog product group */
  name: Option[String],
/* Object holding a list of filters */
  filters: Option[Any],
/* Object holding a list of filters */
  filterV2: Option[Any],
`type`: Option[Board],
status: Option[EntityStatus],
/* id of the feed profile belonging to this catalog product group */
  feedProfileId: Option[String],
/* Unix timestamp in seconds of when catalog product group was created. */
  createdAt: Option[Integer],
/* Unix timestamp in seconds of last time catalog product group was updated. */
  lastUpdate: Option[Integer],
/* Amount of products in the catalog product group */
  productCount: Option[Integer],
/* index of the featured position of the catalog product group */
  featuredPosition: Option[Integer])

object CatalogProductGroup {
  import DateTimeCodecs._

  implicit val CatalogProductGroupCodecJson: CodecJson[CatalogProductGroup] = CodecJson.derive[CatalogProductGroup]
  implicit val CatalogProductGroupDecoder: EntityDecoder[CatalogProductGroup] = jsonOf[CatalogProductGroup]
  implicit val CatalogProductGroupEncoder: EntityEncoder[CatalogProductGroup] = jsonEncoderOf[CatalogProductGroup]
}
