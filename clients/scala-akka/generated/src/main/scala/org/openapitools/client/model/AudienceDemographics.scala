/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.model

import org.openapitools.client.core.ApiModel

case class AudienceDemographics (
  /* Ages distribution. */
  ages: Option[Seq[AudienceDemographicValue]] = None,
  /* Gender distribution. */
  genders: Option[Seq[AudienceDemographicValue]] = None,
  /* Device usage distribution. */
  devices: Option[Seq[AudienceDemographicValue]] = None,
  /* Geographic metro area distribution. */
  metros: Option[Seq[AudienceDemographicValue]] = None,
  /* Country area distribution. */
  countries: Option[Seq[AudienceDemographicValue]] = None
) extends ApiModel

