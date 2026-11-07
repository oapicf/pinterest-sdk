package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BulkUpsertRequestCreateCatalogProductGroupsItems.
  * @param feedId Catalog Feed id pertaining to the catalog product group.
  * @param isFeatured boolean indicator of whether the product group is being featured or not
  * @param catalogId Catalog ID pertaining to the product group.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class BulkUpsertRequestCreateCatalogProductGroupsItems(
  description: Option[String],
  feedId: String,
  filters: CatalogsCreativeAssetsProductGroupFilters,
  isFeatured: Option[Boolean],
  name: String,
  catalogId: String,
  catalogType: BulkUpsertRequestCreateCatalogProductGroupsItems.CatalogType.Value,
  country: Option[Country],
  locale: Option[CatalogsLocale]
)

object BulkUpsertRequestCreateCatalogProductGroupsItems {
  implicit lazy val bulkUpsertRequestCreateCatalogProductGroupsItemsJsonFormat: Format[BulkUpsertRequestCreateCatalogProductGroupsItems] = Json.format[BulkUpsertRequestCreateCatalogProductGroupsItems]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val CREATIVEASSETS = Value("CREATIVE_ASSETS")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

