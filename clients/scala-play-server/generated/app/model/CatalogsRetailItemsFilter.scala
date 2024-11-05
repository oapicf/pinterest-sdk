package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsRetailItemsFilter.
  * @param catalogId Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsRetailItemsFilter(
  catalogType: CatalogsRetailItemsFilter.CatalogType.Value,
  itemIds: List[String],
  catalogId: Option[String]
)

object CatalogsRetailItemsFilter {
  implicit lazy val catalogsRetailItemsFilterJsonFormat: Format[CatalogsRetailItemsFilter] = Json.format[CatalogsRetailItemsFilter]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val RETAIL = Value("RETAIL")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

