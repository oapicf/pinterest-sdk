package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsItemsFilters.
  * @param catalogId Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsItemsFilters(
  catalogType: CatalogsType,
  itemIds: List[String],
  catalogId: Option[String],
  hotelIds: List[String],
  creativeAssetsIds: List[String]
)

object CatalogsItemsFilters {
  implicit lazy val catalogsItemsFiltersJsonFormat: Format[CatalogsItemsFilters] = Json.format[CatalogsItemsFilters]
}

