package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AudienceCategory.
  * @param key Interest unique key (same as ID).
  * @param name Interest name.
  * @param ratio Interest's percent of category's total audience.
  * @param index Interest affinity index.
  * @param id Interest ID.
  * @param subcategories Subcategory interest distribution
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class AudienceCategory(
  key: Option[String],
  name: Option[String],
  ratio: Option[BigDecimal],
  index: Option[BigDecimal],
  id: Option[String],
  subcategories: Option[List[AudienceSubcategory]]
)

object AudienceCategory {
  implicit lazy val audienceCategoryJsonFormat: Format[AudienceCategory] = Json.format[AudienceCategory]
}

