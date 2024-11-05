package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsRetailProductGroup.
  * @param id ID of the catalog product group.
  * @param name Name of catalog product group
  * @param isFeatured boolean indicator of whether the product group is being featured or not
  * @param createdAt Unix timestamp in seconds of when catalog product group was created.
  * @param updatedAt Unix timestamp in seconds of last time catalog product group was updated.
  * @param catalogId Catalog id pertaining to the retail product group.
  * @param feedId id of the catalogs feed belonging to this catalog product group
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsRetailProductGroup(
  catalogType: CatalogsRetailProductGroup.CatalogType.Value,
  id: String,
  name: Option[String],
  description: Option[String],
  filters: CatalogsProductGroupFilters,
  isFeatured: Option[Boolean],
  `type`: Option[CatalogsProductGroupType],
  status: Option[CatalogsProductGroupStatus],
  createdAt: Option[Int],
  updatedAt: Option[Int],
  catalogId: String,
  feedId: String,
  country: Option[String],
  locale: Option[String]
)

object CatalogsRetailProductGroup {
  implicit lazy val catalogsRetailProductGroupJsonFormat: Format[CatalogsRetailProductGroup] = Json.format[CatalogsRetailProductGroup]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val RETAIL = Value("RETAIL")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

