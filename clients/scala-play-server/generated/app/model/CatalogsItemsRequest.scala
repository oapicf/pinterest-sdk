package model

import play.api.libs.json._

/**
  * Request object of catalogs items
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsItemsRequest(
  country: Country,
  language: CatalogsItemsRequestLanguage,
  filters: CatalogsItemsPostFilters
)

object CatalogsItemsRequest {
  implicit lazy val catalogsItemsRequestJsonFormat: Format[CatalogsItemsRequest] = Json.format[CatalogsItemsRequest]
}

