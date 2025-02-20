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


case class AdsCreditRedeemResponse(
  /* Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true). */
  success: Option[Boolean] = None,
  /* Error code type if error occurs */
  errorCode: Option[Int] = None,
  /* Reason for failure */
  errorMessage: Option[String] = None
)

