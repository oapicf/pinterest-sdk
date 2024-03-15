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
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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

