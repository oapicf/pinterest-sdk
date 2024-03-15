package model

import play.api.libs.json._

/**
  * catalog product group entity
  * @param id ID of the catalog product group.
  * @param name Name of catalog product group
  * @param isFeatured boolean indicator of whether the product group is being featured or not
  * @param createdAt Unix timestamp in seconds of when catalog product group was created.
  * @param updatedAt Unix timestamp in seconds of last time catalog product group was updated.
  * @param feedId id of the catalogs feed belonging to this catalog product group
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CatalogsProductGroup(
  id: String,
  name: Option[String],
  description: Option[String],
  filters: CatalogsProductGroupFilters,
  isFeatured: Option[Boolean],
  `type`: Option[CatalogsProductGroupType],
  status: Option[CatalogsProductGroupStatus],
  createdAt: Option[Int],
  updatedAt: Option[Int],
  feedId: String,
  catalogType: Option[CatalogsProductGroup.CatalogType.Value]
)

object CatalogsProductGroup {
  implicit lazy val catalogsProductGroupJsonFormat: Format[CatalogsProductGroup] = Json.format[CatalogsProductGroup]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val RETAIL = Value("RETAIL")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

