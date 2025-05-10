package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ProductType2Filter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class ProductType2Filter(
  PRODUCT_TYPE_2: CatalogsProductGroupMultipleStringListCriteria
)

object ProductType2Filter {
  implicit lazy val productType2FilterJsonFormat: Format[ProductType2Filter] = Json.format[ProductType2Filter]
}

