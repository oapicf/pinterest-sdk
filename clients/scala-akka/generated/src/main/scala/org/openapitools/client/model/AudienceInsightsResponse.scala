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

case class AudienceInsightsResponse (
  /* Category interest distribution */
  categories: Option[Seq[AudienceCategory]] = None,
  demographics: Option[AudienceDemographics] = None,
  `type`: Option[AudienceInsightType] = None,
  /* Generation date */
  date: Option[String] = None,
  /* Population count. */
  size: Option[Int] = None,
  /* Indicates whether the audience size has been rounded up to the next highest upper boundary. */
  sizeIsUpperBound: Option[Boolean] = None
) extends ApiModel

object AudienceInsightsResponseEnums {

}
