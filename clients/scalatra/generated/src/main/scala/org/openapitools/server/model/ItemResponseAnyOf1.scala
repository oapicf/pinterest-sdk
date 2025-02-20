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

case class ItemResponseAnyOf1(
  catalogType: CatalogsType,

  /* The catalog item id in the merchant namespace */
  itemId: Option[String],

  /* Array with the errors for the item id requested */
  errors: Option[List[ItemValidationEvent]],

  /* The catalog hotel id in the merchant namespace */
  hotelId: Option[String],

  /* The catalog creative assets id in the merchant namespace */
  creativeAssetsId: Option[String]

 )
