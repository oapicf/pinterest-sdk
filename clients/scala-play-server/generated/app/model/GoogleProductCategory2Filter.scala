package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GoogleProductCategory2Filter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class GoogleProductCategory2Filter(
  GOOGLE_PRODUCT_CATEGORY_2: CatalogsProductGroupMultipleStringListCriteria
)

object GoogleProductCategory2Filter {
  implicit lazy val googleProductCategory2FilterJsonFormat: Format[GoogleProductCategory2Filter] = Json.format[GoogleProductCategory2Filter]
}

