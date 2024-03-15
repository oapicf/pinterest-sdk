package org.openapitools.server.model


/**
 * = AudienceDemographicValue =
 *
 * Demographic detail for a single audience demographic
 *
 * @param key Unique key for demographic item for example: ''us''
 * @param name Display name for demographic for example: ''United States''
 * @param ratio Value of demographic item as a percent of total audience for example: ''0.551''
*/
final case class AudienceDemographicValue (
  key: Option[String] = None,
  name: Option[String] = None,
  ratio: Option[Double] = None
)

