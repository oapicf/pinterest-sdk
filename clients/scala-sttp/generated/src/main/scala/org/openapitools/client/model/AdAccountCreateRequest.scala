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

import org.openapitools.client.model.Country._

case class AdAccountCreateRequest(
  country: Option[Country] = None,
  /* Ad Account name. */
  name: Option[String] = None,
  /* Advertiser's owning user ID. */
  ownerUserId: Option[String] = None
)

object AdAccountCreateRequestEnums {

}
