package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsCreativeAssetsProductGroup.
  * @param id ID of the creative assets product group.
  * @param name Name of creative assets product group
  * @param createdAt Unix timestamp in seconds of when catalog product group was created.
  * @param updatedAt Unix timestamp in seconds of last time catalog product group was updated.
  * @param catalogId Catalog id pertaining to the creative assets product group.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsCreativeAssetsProductGroup(
  catalogType: CatalogsCreativeAssetsProductGroup.CatalogType.Value,
  id: String,
  name: Option[String],
  description: Option[String],
  filters: CatalogsCreativeAssetsProductGroupFilters,
  createdAt: Option[Int],
  updatedAt: Option[Int],
  catalogId: String
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

