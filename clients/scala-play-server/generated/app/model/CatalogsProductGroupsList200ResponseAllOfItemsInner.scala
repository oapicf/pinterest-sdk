package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for catalogs_product_groups_list_200_response_allOf_items_inner.
  * @param id ID of the catalog product group.
  * @param name Name of catalog product group
  * @param isFeatured boolean indicator of whether the product group is being featured or not
  * @param createdAt Unix timestamp in seconds of when catalog product group was created.
  * @param updatedAt Unix timestamp in seconds of last time catalog product group was updated.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CatalogsProductGroupsList200ResponseAllOfItemsInner(
  id: String,
  name: Option[String],
  description: Option[String],
  filters: CatalogsProductGroupFilters,
  isFeatured: Option[Boolean],
  `type`: Option[CatalogsProductGroupType],
  status: Option[CatalogsProductGroupStatus],
  createdAt: Option[Int],
  updatedAt: Option[Int],
  feedId: CatalogsProductGroupsList200ResponseAllOfItemsInner.FeedId.Value,
  catalogType: CatalogsProductGroupsList200ResponseAllOfItemsInner.CatalogType.Value,
  catalogId: String
)

object CatalogsProductGroupsList200ResponseAllOfItemsInner {
  implicit lazy val catalogsProductGroupsList200ResponseAllOfItemsInnerJsonFormat: Format[CatalogsProductGroupsList200ResponseAllOfItemsInner] = Json.format[CatalogsProductGroupsList200ResponseAllOfItemsInner]

  // noinspection TypeAnnotation
  object FeedId extends Enumeration {
    val Null = Value("null")

    type FeedId = Value
    implicit lazy val FeedIdJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val RETAIL = Value("RETAIL")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

