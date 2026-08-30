package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PinterestProductCategoriesFilter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class PinterestProductCategoriesFilter(
  PINTEREST_PRODUCT_CATEGORIES: CatalogsProductGroupMultiplePinterestProductCategoryCriteria
)

object PinterestProductCategoriesFilter {
  implicit lazy val pinterestProductCategoriesFilterJsonFormat: Format[PinterestProductCategoriesFilter] = Json.format[PinterestProductCategoriesFilter]
}

