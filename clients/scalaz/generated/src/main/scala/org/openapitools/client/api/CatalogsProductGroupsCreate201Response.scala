package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsProductGroupsCreate201Response._

case class CatalogsProductGroupsCreate201Response (
  /* ID of the catalog product group. */
  id: String,
/* Name of catalog product group */
  name: Option[String],
description: Option[String],
filters: CatalogsProductGroupFilters,
/* boolean indicator of whether the product group is being featured or not */
  isFeatured: Option[Boolean],
`type`: Option[CatalogsProductGroupType],
status: Option[CatalogsProductGroupStatus],
/* Unix timestamp in seconds of when catalog product group was created. */
  createdAt: Option[Integer],
/* Unix timestamp in seconds of last time catalog product group was updated. */
  updatedAt: Option[Integer],
feedId: FeedId,
catalogType: CatalogType,
catalogId: String)

object CatalogsProductGroupsCreate201Response {
  import DateTimeCodecs._
  sealed trait FeedId
  case object `Null` extends FeedId

  object FeedId {
    def toFeedId(s: String): Option[FeedId] = s match {
      case "`Null`" => Some(`Null`)
      case _ => None
    }

    def fromFeedId(x: FeedId): String = x match {
      case `Null` => "`Null`"
    }
  }

  implicit val FeedIdEnumEncoder: EncodeJson[FeedId] =
    EncodeJson[FeedId](is => StringEncodeJson(FeedId.fromFeedId(is)))

  implicit val FeedIdEnumDecoder: DecodeJson[FeedId] =
    DecodeJson.optionDecoder[FeedId](n => n.string.flatMap(jStr => FeedId.toFeedId(jStr)), "FeedId failed to de-serialize")
  sealed trait CatalogType
  case object RETAIL extends CatalogType

  object CatalogType {
    def toCatalogType(s: String): Option[CatalogType] = s match {
      case "RETAIL" => Some(RETAIL)
      case _ => None
    }

    def fromCatalogType(x: CatalogType): String = x match {
      case RETAIL => "RETAIL"
    }
  }

  implicit val CatalogTypeEnumEncoder: EncodeJson[CatalogType] =
    EncodeJson[CatalogType](is => StringEncodeJson(CatalogType.fromCatalogType(is)))

  implicit val CatalogTypeEnumDecoder: DecodeJson[CatalogType] =
    DecodeJson.optionDecoder[CatalogType](n => n.string.flatMap(jStr => CatalogType.toCatalogType(jStr)), "CatalogType failed to de-serialize")

  implicit val CatalogsProductGroupsCreate201ResponseCodecJson: CodecJson[CatalogsProductGroupsCreate201Response] = CodecJson.derive[CatalogsProductGroupsCreate201Response]
  implicit val CatalogsProductGroupsCreate201ResponseDecoder: EntityDecoder[CatalogsProductGroupsCreate201Response] = jsonOf[CatalogsProductGroupsCreate201Response]
  implicit val CatalogsProductGroupsCreate201ResponseEncoder: EntityEncoder[CatalogsProductGroupsCreate201Response] = jsonEncoderOf[CatalogsProductGroupsCreate201Response]
}
