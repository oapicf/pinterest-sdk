package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsProductGroupMultiplePinterestProductCategoryCriteria.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsProductGroupMultiplePinterestProductCategoryCriteria(
  negated: Option[Boolean],
  values: List[ProductCategoryEnum]
)

object CatalogsProductGroupMultiplePinterestProductCategoryCriteria {
  implicit lazy val catalogsProductGroupMultiplePinterestProductCategoryCriteriaJsonFormat: Format[CatalogsProductGroupMultiplePinterestProductCategoryCriteria] = Json.format[CatalogsProductGroupMultiplePinterestProductCategoryCriteria]
}

