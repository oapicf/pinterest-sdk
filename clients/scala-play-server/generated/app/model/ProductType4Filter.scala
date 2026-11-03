package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ProductType4Filter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ProductType4Filter(
  PRODUCT_TYPE_4: CatalogsProductGroupMultipleStringListCriteria
)

object ProductType4Filter {
  implicit lazy val productType4FilterJsonFormat: Format[ProductType4Filter] = Json.format[ProductType4Filter]
}

