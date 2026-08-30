package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ProductType4Filter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ProductType4Filter(
  PRODUCT_TYPE_4: CatalogsProductGroupMultipleStringListCriteria
)

object ProductType4Filter {
  implicit lazy val productType4FilterJsonFormat: Format[ProductType4Filter] = Json.format[ProductType4Filter]
}

