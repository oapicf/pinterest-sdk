package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsHotelProductGroup.
  * @param catalogId Catalog id pertaining to the hotel product group.
  * @param createdAt Unix timestamp in seconds of when catalog product group was created.
  * @param id ID of the hotel product group.
  * @param name Name of hotel product group
  * @param updatedAt Unix timestamp in seconds of last time catalog product group was updated.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

