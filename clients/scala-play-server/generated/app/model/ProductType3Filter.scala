package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ProductType3Filter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ProductType3Filter(
  PRODUCT_TYPE_3: CatalogsProductGroupMultipleStringListCriteria
)

object ProductType3Filter {
  implicit lazy val productType3FilterJsonFormat: Format[ProductType3Filter] = Json.format[ProductType3Filter]
}

