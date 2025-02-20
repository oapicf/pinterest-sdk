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

case class TermsOfService(
  /* The ID of the terms of service */
  id: Option[String],

  /* The terms of service content */
  html: Option[String],

  /* Whether the ad account has accepted terms of service. */
  hasAccepted: Option[Boolean],

  /* The ID of the ad account. */
  adAccountId: Option[String]

 )
