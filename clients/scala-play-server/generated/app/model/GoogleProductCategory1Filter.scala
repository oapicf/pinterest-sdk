package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GoogleProductCategory1Filter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class GoogleProductCategory1Filter(
  GOOGLE_PRODUCT_CATEGORY_1: CatalogsProductGroupMultipleStringListCriteria
)

object GoogleProductCategory1Filter {
  implicit lazy val googleProductCategory1FilterJsonFormat: Format[GoogleProductCategory1Filter] = Json.format[GoogleProductCategory1Filter]
}

