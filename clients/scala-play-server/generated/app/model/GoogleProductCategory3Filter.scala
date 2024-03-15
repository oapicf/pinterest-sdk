package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GoogleProductCategory3Filter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class GoogleProductCategory3Filter(
  GOOGLE_PRODUCT_CATEGORY_3: CatalogsProductGroupMultipleStringListCriteria
)

object GoogleProductCategory3Filter {
  implicit lazy val googleProductCategory3FilterJsonFormat: Format[GoogleProductCategory3Filter] = Json.format[GoogleProductCategory3Filter]
}

