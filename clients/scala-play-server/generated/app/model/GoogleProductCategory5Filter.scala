package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for GoogleProductCategory5Filter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class GoogleProductCategory5Filter(
  GOOGLE_PRODUCT_CATEGORY_5: CatalogsProductGroupMultipleStringListCriteria
)

object GoogleProductCategory5Filter {
  implicit lazy val googleProductCategory5FilterJsonFormat: Format[GoogleProductCategory5Filter] = Json.format[GoogleProductCategory5Filter]
}

