package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsProductGroupsCreateManyRequestItems.
  * @param feedId Catalog Feed id pertaining to the catalog product group.
  * @param isFeatured boolean indicator of whether the product group is being featured or not
  * @param catalogId Catalog ID pertaining to the product group.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsProductGroupsCreateManyRequestItems(
  description: Option[String],
  feedId: String,
  filters: CatalogsCreativeAssetsProductGroupFilters,
  isFeatured: Option[Boolean],
  name: String,
  catalogId: String,
  catalogType: CatalogsProductGroupsCreateManyRequestItems.CatalogType.Value,
  country: Option[Country],
  locale: Option[CatalogsLocale]
)

object CatalogsProductGroupsCreateManyRequestItems {
  implicit lazy val catalogsProductGroupsCreateManyRequestItemsJsonFormat: Format[CatalogsProductGroupsCreateManyRequestItems] = Json.format[CatalogsProductGroupsCreateManyRequestItems]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val CREATIVEASSETS = Value("CREATIVE_ASSETS")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

