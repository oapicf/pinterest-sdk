package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BrandFilter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class BrandFilter(
  BRAND: CatalogsProductGroupMultipleStringCriteria
)

object BrandFilter {
  implicit lazy val brandFilterJsonFormat: Format[BrandFilter] = Json.format[BrandFilter]
}

