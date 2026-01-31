package model

import play.api.libs.json._

/**
  * Gender demographic distribution
  * @param female Percentage of female users
  * @param male Percentage of male users
  * @param unspecified Percentage of users with unspecified gender
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class GenderDemographics(
  female: BigDecimal,
  male: BigDecimal,
  unspecified: BigDecimal
)

object GenderDemographics {
  implicit lazy val genderDemographicsJsonFormat: Format[GenderDemographics] = Json.format[GenderDemographics]
}

