package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ProductType0Filter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ProductType0Filter(
  PRODUCT_TYPE_0: CatalogsProductGroupMultipleStringListCriteria
)

object ProductType0Filter {
  implicit lazy val productType0FilterJsonFormat: Format[ProductType0Filter] = Json.format[ProductType0Filter]
}

