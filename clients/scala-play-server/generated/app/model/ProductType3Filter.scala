package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ProductType3Filter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ProductType3Filter(
  PRODUCT_TYPE_3: CatalogsProductGroupMultipleStringListCriteria
)

object ProductType3Filter {
  implicit lazy val productType3FilterJsonFormat: Format[ProductType3Filter] = Json.format[ProductType3Filter]
}

