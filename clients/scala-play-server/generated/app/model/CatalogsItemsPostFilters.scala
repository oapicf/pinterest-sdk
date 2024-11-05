package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsItemsPostFilters.
  * @param catalogId Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
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

