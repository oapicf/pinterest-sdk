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

case class SSIOAccountAddress (
  /* Address display */
  display: Option[String] = None,
  /* Purpose for which the address is used, usually Billing or Businness */
  purpose: Option[String] = None,
  /* Salesforce id for address */
  addressId: Option[String] = None,
  /* Legal entity for this insertion order */
  orderLegalEntity: Option[String] = None
) extends ApiModel

