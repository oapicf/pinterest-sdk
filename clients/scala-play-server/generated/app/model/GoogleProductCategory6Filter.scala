package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GoogleProductCategory6Filter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class GoogleProductCategory6Filter(
  GOOGLE_PRODUCT_CATEGORY_6: CatalogsProductGroupMultipleStringListCriteria
)

object GoogleProductCategory6Filter {
  implicit lazy val googleProductCategory6FilterJsonFormat: Format[GoogleProductCategory6Filter] = Json.format[GoogleProductCategory6Filter]
}

