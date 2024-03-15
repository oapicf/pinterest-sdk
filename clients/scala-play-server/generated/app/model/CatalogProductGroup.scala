package model

import play.api.libs.json._

/**
  * non-promoted catalog product group entity
  * @param id ID of the catalog product group.
  * @param merchantId Merchant ID pertaining to the owner of the catalog product group.
  * @param name Name of catalog product group
  * @param filters Object holding a list of filters
  * @param filterV2 Object holding a list of filters
  * @param feedProfileId id of the feed profile belonging to this catalog product group
  * @param createdAt Unix timestamp in seconds of when catalog product group was created.
  * @param lastUpdate Unix timestamp in seconds of last time catalog product group was updated.
  * @param productCount Amount of products in the catalog product group
  * @param featuredPosition index of the featured position of the catalog product group
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CatalogProductGroup(
  id: Option[String],
  merchantId: Option[String],
  name: Option[String],
  filters: Option[JsObject],
  filterV2: Option[JsObject],
  `type`: Option[Board],
  status: Option[EntityStatus],
  feedProfileId: Option[String],
  createdAt: Option[Int],
  lastUpdate: Option[Int],
  productCount: Option[Int],
  featuredPosition: Option[Int]
)

object CatalogProductGroup {
  implicit lazy val catalogProductGroupJsonFormat: Format[CatalogProductGroup] = Json.format[CatalogProductGroup]
}

