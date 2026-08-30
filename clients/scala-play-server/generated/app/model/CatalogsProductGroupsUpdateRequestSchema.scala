package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsProductGroupsUpdateRequestSchema.
  * @param isFeatured boolean indicator of whether the product group is being featured or not
  * @param name Name of catalog product group
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsProductGroupsUpdateRequestSchema(
  description: Option[String],
  filters: Option[CatalogsCreativeAssetsProductGroupFilters],
  isFeatured: Option[Boolean],
  name: Option[String],
  catalogType: Option[CatalogsProductGroupsUpdateRequestSchema.CatalogType.Value],
  country: Option[Country],
  locale: Option[CatalogsLocale]
)

object CatalogsProductGroupsUpdateRequestSchema {
  implicit lazy val catalogsProductGroupsUpdateRequestSchemaJsonFormat: Format[CatalogsProductGroupsUpdateRequestSchema] = Json.format[CatalogsProductGroupsUpdateRequestSchema]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val CREATIVEASSETS = Value("CREATIVE_ASSETS")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

