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

import org.openapitools.client.model.AudienceUpdateOperationType._

case class AudienceUpdateRequest(
  /* Ad account ID. */
  adAccountId: Option[String] = None,
  /* Audience name. */
  name: Option[String] = None,
  rule: Option[AudienceRule] = None,
  /* Audience description. */
  description: Option[String] = None,
  operationType: Option[AudienceUpdateOperationType] = None
)

object AudienceUpdateRequestEnums {

}
