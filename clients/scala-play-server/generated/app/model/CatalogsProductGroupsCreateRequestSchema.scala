package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsProductGroupsCreateRequestSchema.
  * @param feedId Catalog Feed id pertaining to the catalog product group.
  * @param isFeatured boolean indicator of whether the product group is being featured or not
  * @param catalogId Catalog ID pertaining to the product group.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsProductGroupsCreateRequestSchema(
  description: Option[String],
  feedId: String,
  filters: CatalogsCreativeAssetsProductGroupFilters,
  isFeatured: Option[Boolean],
  name: String,
  catalogId: String,
  catalogType: CatalogsProductGroupsCreateRequestSchema.CatalogType.Value,
  country: Option[Country],
  locale: Option[CatalogsLocale]
)

object CatalogsProductGroupsCreateRequestSchema {
  implicit lazy val catalogsProductGroupsCreateRequestSchemaJsonFormat: Format[CatalogsProductGroupsCreateRequestSchema] = Json.format[CatalogsProductGroupsCreateRequestSchema]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val CREATIVEASSETS = Value("CREATIVE_ASSETS")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

