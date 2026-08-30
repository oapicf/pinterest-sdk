package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsRetailProductGroup.
  * @param catalogId Catalog ID pertaining to the product group.
  * @param createdAt Unix timestamp in seconds of when catalog product group was created.
  * @param feedId id of the catalogs feed belonging to this catalog product group
  * @param id ID of the catalog product group.
  * @param isFeatured boolean indicator of whether the product group is being featured or not
  * @param name Name of catalog product group
  * @param updatedAt Unix timestamp in seconds of last time catalog product group was updated.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsRetailProductGroup(
  catalogId: String,
  catalogType: CatalogsRetailProductGroup.CatalogType.Value,
  country: Option[String],
  createdAt: Option[Int],
  description: Option[String],
  feedId: String,
  filters: CatalogsProductGroupFilters,
  id: String,
  isFeatured: Option[Boolean],
  locale: Option[String],
  name: Option[String],
  status: Option[CatalogsProductGroupStatus],
  `type`: CatalogsProductGroupType,
  updatedAt: Option[Int]
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

