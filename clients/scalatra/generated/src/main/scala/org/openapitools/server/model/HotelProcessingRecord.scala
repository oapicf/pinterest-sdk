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

case class HotelProcessingRecord(
  /* The catalog hotel id in the merchant namespace */
  hotelId: Option[String],

  /* Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. */
  errors: Option[List[ItemValidationEvent]],

  /* Array with the validation warnings for the item processing record */
  warnings: Option[List[ItemValidationEvent]],

  status: Option[ItemProcessingStatus]

 )
