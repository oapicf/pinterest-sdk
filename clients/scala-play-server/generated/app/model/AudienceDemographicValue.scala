package model

import play.api.libs.json._

/**
  * Demographic detail for a single audience demographic
  * @param key Unique key for demographic item
  * @param name Display name for demographic
  * @param ratio Value of demographic item as a percent of total audience
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class AudienceDemographicValue(
  key: Option[String],
  name: Option[String],
  ratio: Option[BigDecimal]
)

object AudienceDemographicValue {
  implicit lazy val audienceDemographicValueJsonFormat: Format[AudienceDemographicValue] = Json.format[AudienceDemographicValue]
}

