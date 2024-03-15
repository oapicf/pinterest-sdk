package org.openapitools.server.model


/**
 * = AudienceDemographics =
 *
 * Audience demographics
 *
 * @param ages Ages distribution. for example: ''null''
 * @param genders Gender distribution. for example: ''null''
 * @param devices Device usage distribution. for example: ''null''
 * @param metros Geographic metro area distribution. for example: ''null''
 * @param countries Country area distribution. for example: ''null''
*/
final case class AudienceDemographics (
  ages: Option[Seq[AudienceDemographicValue]] = None,
  genders: Option[Seq[AudienceDemographicValue]] = None,
  devices: Option[Seq[AudienceDemographicValue]] = None,
  metros: Option[Seq[AudienceDemographicValue]] = None,
  countries: Option[Seq[AudienceDemographicValue]] = None
)

