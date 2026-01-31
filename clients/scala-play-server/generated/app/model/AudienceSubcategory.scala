package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AudienceSubcategory.
  * @param id Subinterest ID.
  * @param index Subinterest affinity index.
  * @param key Interest unique key (same as ID).
  * @param name Subinterest name.
  * @param ratio Subinterest's percent of category's total audience.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AudienceSubcategory(
  id: Option[String],
  index: Option[BigDecimal],
  key: Option[String],
  name: Option[String],
  ratio: Option[BigDecimal]
)

object AudienceSubcategory {
  implicit lazy val audienceSubcategoryJsonFormat: Format[AudienceSubcategory] = Json.format[AudienceSubcategory]
}

