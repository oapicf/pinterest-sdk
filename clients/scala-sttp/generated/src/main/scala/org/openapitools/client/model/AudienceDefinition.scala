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


  /**
   * AudienceDefinition
   * Queryable audience representation.
   */
case class AudienceDefinition(
  /* Generation date */
  date: Option[String] = None,
  /* Generated audience type to request. */
  `type`: Option[String] = None,
  /* Generated audience scope to request. */
  scope: Option[String] = None
)

