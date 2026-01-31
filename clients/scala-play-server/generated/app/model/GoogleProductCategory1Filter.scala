package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GoogleProductCategory1Filter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class GoogleProductCategory1Filter(
  GOOGLE_PRODUCT_CATEGORY_1: CatalogsProductGroupMultipleStringListCriteria
)

object GoogleProductCategory1Filter {
  implicit lazy val googleProductCategory1FilterJsonFormat: Format[GoogleProductCategory1Filter] = Json.format[GoogleProductCategory1Filter]
}

