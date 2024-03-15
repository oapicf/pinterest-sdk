package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsItemsFilters.
  * @param catalogId Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CatalogsItemsFilters(
  catalogType: CatalogsType,
  itemIds: List[String],
  catalogId: Option[String],
  hotelIds: List[String]
)

object CatalogsItemsFilters {
  implicit lazy val catalogsItemsFiltersJsonFormat: Format[CatalogsItemsFilters] = Json.format[CatalogsItemsFilters]
}

