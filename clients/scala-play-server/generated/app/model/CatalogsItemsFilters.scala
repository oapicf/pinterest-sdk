package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsItemsFilters.
  * @param catalogId Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsItemsFilters(
  catalogType: CatalogsType,
  catalogId: Option[String],
  itemIds: List[String],
  hotelIds: List[String],
  creativeAssetsIds: List[String]
)

object CatalogsItemsFilters {
  implicit lazy val catalogsItemsFiltersJsonFormat: Format[CatalogsItemsFilters] = Json.format[CatalogsItemsFilters]
}

