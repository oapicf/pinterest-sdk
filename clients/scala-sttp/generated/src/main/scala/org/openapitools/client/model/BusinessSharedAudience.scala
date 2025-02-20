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

import org.openapitools.client.model.OperationType._

case class BusinessSharedAudience(
  /* Unique identifier of an audience */
  audienceId: String,
  operationType: OperationType,
  /* List of business IDs to share with or revoke from. */
  recipientBusinessIds: Seq[String]
)

object BusinessSharedAudienceEnums {

}
