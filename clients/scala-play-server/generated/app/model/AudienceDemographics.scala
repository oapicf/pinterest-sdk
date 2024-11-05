package model

import play.api.libs.json._

/**
  * Audience demographics
  * @param ages Ages distribution.
  * @param genders Gender distribution.
  * @param devices Device usage distribution.
  * @param metros Geographic metro area distribution.
  * @param countries Country area distribution.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class AudienceDemographics(
  ages: Option[List[AudienceDemographicValue]],
  genders: Option[List[AudienceDemographicValue]],
  devices: Option[List[AudienceDemographicValue]],
  metros: Option[List[AudienceDemographicValue]],
  countries: Option[List[AudienceDemographicValue]]
)

object AudienceDemographics {
  implicit lazy val audienceDemographicsJsonFormat: Format[AudienceDemographics] = Json.format[AudienceDemographics]
}

