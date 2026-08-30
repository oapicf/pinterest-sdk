package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ProductType1Filter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ProductType1Filter(
  PRODUCT_TYPE_1: CatalogsProductGroupMultipleStringListCriteria
)

object ProductType1Filter {
  implicit lazy val productType1FilterJsonFormat: Format[ProductType1Filter] = Json.format[ProductType1Filter]
}

