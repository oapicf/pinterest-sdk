package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsCreativeAssetsProductGroup.
  * @param catalogId Catalog id pertaining to the creative assets product group.
  * @param createdAt Unix timestamp in seconds of when catalog product group was created.
  * @param id ID of the creative assets product group.
  * @param name Name of creative assets product group
  * @param updatedAt Unix timestamp in seconds of last time catalog product group was updated.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsCreativeAssetsProductGroup(
  catalogId: String,
  catalogType: CatalogsCreativeAssetsProductGroup.CatalogType.Value,
  createdAt: Option[Int],
  description: Option[String],
  filters: CatalogsCreativeAssetsProductGroupFilters,
  id: String,
  name: Option[String],
  updatedAt: Option[Int]
)

object CatalogsCreativeAssetsProductGroup {
  implicit lazy val catalogsCreativeAssetsProductGroupJsonFormat: Format[CatalogsCreativeAssetsProductGroup] = Json.format[CatalogsCreativeAssetsProductGroup]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val CREATIVEASSETS = Value("CREATIVE_ASSETS")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

