package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GoogleProductCategory4Filter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class GoogleProductCategory4Filter(
  GOOGLE_PRODUCT_CATEGORY_4: CatalogsProductGroupMultipleStringListCriteria
)

object GoogleProductCategory4Filter {
  implicit lazy val googleProductCategory4FilterJsonFormat: Format[GoogleProductCategory4Filter] = Json.format[GoogleProductCategory4Filter]
}

