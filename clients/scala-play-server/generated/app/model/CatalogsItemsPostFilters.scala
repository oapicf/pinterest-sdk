package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsItemsPostFilters.
  * @param catalogId Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsItemsPostFilters(
  catalogType: CatalogsType,
  itemIds: List[String],
  catalogId: Option[String],
  hotelIds: List[String],
  creativeAssetsIds: List[String]
)

object CatalogsItemsPostFilters {
  implicit lazy val catalogsItemsPostFiltersJsonFormat: Format[CatalogsItemsPostFilters] = Json.format[CatalogsItemsPostFilters]
}

