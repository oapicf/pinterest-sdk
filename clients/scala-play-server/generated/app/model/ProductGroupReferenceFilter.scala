package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ProductGroupReferenceFilter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class ProductGroupReferenceFilter(
  PRODUCT_GROUP: CatalogsProductGroupMultipleStringCriteria
)

object ProductGroupReferenceFilter {
  implicit lazy val productGroupReferenceFilterJsonFormat: Format[ProductGroupReferenceFilter] = Json.format[ProductGroupReferenceFilter]
}

