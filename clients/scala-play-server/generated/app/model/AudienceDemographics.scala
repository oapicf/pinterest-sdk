package model

import play.api.libs.json._

/**
  * Audience demographics
  * @param ages Ages distribution.
  * @param countries Country area distribution.
  * @param devices Device usage distribution.
  * @param genders Gender distribution.
  * @param metros Geographic metro area distribution.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AudienceDemographics(
  ages: Option[List[AudienceDemographicValue]],
  countries: Option[List[AudienceDemographicValue]],
  devices: Option[List[AudienceDemographicValue]],
  genders: Option[List[AudienceDemographicValue]],
  metros: Option[List[AudienceDemographicValue]]
)

object AudienceDemographics {
  implicit lazy val audienceDemographicsJsonFormat: Format[AudienceDemographics] = Json.format[AudienceDemographics]
}

