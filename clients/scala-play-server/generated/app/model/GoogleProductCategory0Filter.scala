package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GoogleProductCategory0Filter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class GoogleProductCategory0Filter(
  GOOGLE_PRODUCT_CATEGORY_0: CatalogsProductGroupMultipleStringListCriteria
)

object GoogleProductCategory0Filter {
  implicit lazy val googleProductCategory0FilterJsonFormat: Format[GoogleProductCategory0Filter] = Json.format[GoogleProductCategory0Filter]
}

