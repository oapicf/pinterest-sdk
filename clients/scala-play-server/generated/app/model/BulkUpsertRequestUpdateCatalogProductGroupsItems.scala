package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BulkUpsertRequestUpdateCatalogProductGroupsItems.
  * @param isFeatured boolean indicator of whether the product group is being featured or not
  * @param name Name of catalog product group
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class BulkUpsertRequestUpdateCatalogProductGroupsItems(
  description: Option[String],
  filters: Option[CatalogsCreativeAssetsProductGroupFilters],
  isFeatured: Option[Boolean],
  name: Option[String],
  catalogType: Option[BulkUpsertRequestUpdateCatalogProductGroupsItems.CatalogType.Value],
  country: Option[Country],
  locale: Option[CatalogsLocale]
)

object BulkUpsertRequestUpdateCatalogProductGroupsItems {
  implicit lazy val bulkUpsertRequestUpdateCatalogProductGroupsItemsJsonFormat: Format[BulkUpsertRequestUpdateCatalogProductGroupsItems] = Json.format[BulkUpsertRequestUpdateCatalogProductGroupsItems]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val CREATIVEASSETS = Value("CREATIVE_ASSETS")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

