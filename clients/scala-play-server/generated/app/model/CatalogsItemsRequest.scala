package model

import play.api.libs.json._

/**
  * Request object of catalogs items
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class CatalogsItemsRequest(
  country: Country,
  language: CatalogsItemsRequestLanguage,
  filters: CatalogsItemsPostFilters
)

object CatalogsItemsRequest {
  implicit lazy val catalogsItemsRequestJsonFormat: Format[CatalogsItemsRequest] = Json.format[CatalogsItemsRequest]
}

