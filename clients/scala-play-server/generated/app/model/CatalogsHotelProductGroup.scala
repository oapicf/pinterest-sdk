package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsHotelProductGroup.
  * @param catalogId Catalog ID pertaining to the product group.
  * @param createdAt Unix timestamp in seconds of when catalog product group was created.
  * @param id ID of the catalog product group.
  * @param name Name of catalog product group
  * @param updatedAt Unix timestamp in seconds of last time catalog product group was updated.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsHotelProductGroup(
  catalogId: String,
  catalogType: CatalogsHotelProductGroup.CatalogType.Value,
  createdAt: Option[Int],
  description: Option[String],
  filters: CatalogsHotelProductGroupFilters,
  id: String,
  name: Option[String],
  `type`: CatalogsHotelProductGroupType,
  updatedAt: Option[Int]
)

object CatalogsHotelProductGroup {
  implicit lazy val catalogsHotelProductGroupJsonFormat: Format[CatalogsHotelProductGroup] = Json.format[CatalogsHotelProductGroup]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val HOTEL = Value("HOTEL")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

