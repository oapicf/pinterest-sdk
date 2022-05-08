/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.3.0
 * Contact: pinterest-api@pinterest.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.model

import org.openapitools.client.model.ItemProcessingStatus._

  /**
   * Object describing an item processing record
   */
case class ItemProcessingRecord(
  /* The catalog item id in the merchant namespace */
  itemId: Option[String] = None,
  /* Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. */
  errors: Option[Seq[ItemValidationEvent]] = None,
  /* Array with the validation warnings for the item processing record */
  warnings: Option[Seq[ItemValidationEvent]] = None,
  status: Option[ItemProcessingStatus] = None
)
