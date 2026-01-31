package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AudienceCategory.
  * @param id Interest ID.
  * @param index Interest affinity index.
  * @param key Interest unique key (same as ID).
  * @param name Interest name.
  * @param ratio Interest's percent of category's total audience.
  * @param subcategories Subcategory interest distribution
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AudienceCategory(
  id: Option[String],
  index: Option[BigDecimal],
  key: Option[String],
  name: Option[String],
  ratio: Option[BigDecimal],
  subcategories: Option[List[AudienceSubcategory]]
)

object AudienceCategory {
  implicit lazy val audienceCategoryJsonFormat: Format[AudienceCategory] = Json.format[AudienceCategory]
}

