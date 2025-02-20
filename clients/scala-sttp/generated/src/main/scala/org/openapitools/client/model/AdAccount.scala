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

import org.openapitools.client.model.BusinessAccessRole._
import org.openapitools.client.model.Country._
import org.openapitools.client.model.Currency._

case class AdAccount(
  id: Option[String] = None,
  name: Option[String] = None,
  owner: Option[AdAccountOwner] = None,
  country: Option[Country] = None,
  currency: Option[Currency] = None,
  permissions: Option[Seq[BusinessAccessRole]] = None,
  /* Creation time. Unix timestamp in seconds. */
  createdTime: Option[Int] = None,
  /* Last update time. Unix timestamp in seconds. */
  updatedTime: Option[Int] = None
)

object AdAccountEnums {

}
