package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GoogleProductCategory2Filter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class GoogleProductCategory2Filter(
  GOOGLE_PRODUCT_CATEGORY_2: CatalogsProductGroupMultipleStringListCriteria
)

object GoogleProductCategory2Filter {
  implicit lazy val googleProductCategory2FilterJsonFormat: Format[GoogleProductCategory2Filter] = Json.format[GoogleProductCategory2Filter]
}

