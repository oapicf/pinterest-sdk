/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 */

package org.openapitools.server.model

case class AdAccountCreateSubscriptionResponse(
  /* Subscription ID. */
  id: Option[String],

  /* Base64 encoded key for client to decrypt lead data. */
  cryptographicKey: Option[String],

  /* Lead data encryption algorithm. */
  cryptographicAlgorithm: Option[String],

  /* Subscription creation time. Unix timestamp in milliseconds. */
  createdTime: Option[Int]

 )
