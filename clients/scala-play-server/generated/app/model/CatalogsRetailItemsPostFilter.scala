package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsRetailItemsPostFilter.
  * @param catalogId Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsRetailItemsPostFilter(
  catalogId: Option[String],
  catalogType: CatalogsRetailItemsPostFilter.CatalogType.Value,
  itemIds: List[String]
)

object CatalogsRetailItemsPostFilter {
  implicit lazy val catalogsRetailItemsPostFilterJsonFormat: Format[CatalogsRetailItemsPostFilter] = Json.format[CatalogsRetailItemsPostFilter]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val RETAIL = Value("RETAIL")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

