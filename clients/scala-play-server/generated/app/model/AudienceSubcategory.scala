package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AudienceSubcategory.
  * @param key Interest unique key (same as ID).
  * @param name Subinterest name.
  * @param ratio Subinterest's percent of category's total audience.
  * @param index Subinterest affinity index.
  * @param id Subinterest ID.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class AudienceSubcategory(
  key: Option[String],
  name: Option[String],
  ratio: Option[BigDecimal],
  index: Option[BigDecimal],
  id: Option[String]
)

object AudienceSubcategory {
  implicit lazy val audienceSubcategoryJsonFormat: Format[AudienceSubcategory] = Json.format[AudienceSubcategory]
}

