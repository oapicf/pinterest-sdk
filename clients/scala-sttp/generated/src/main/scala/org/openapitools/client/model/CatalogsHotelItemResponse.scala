/**
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.12.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.client.model

import org.openapitools.client.model.CatalogsType._

  /**
   * Object describing a hotel record
   */
case class CatalogsHotelItemResponse(
  catalogType: CatalogsType,
  /* The catalog hotel id in the merchant namespace */
  hotelId: Option[String] = None,
  /* The pins mapped to the item */
  pins: Option[Seq[Pin]] = None,
  attributes: Option[CatalogsHotelAttributes] = None
)

object CatalogsHotelItemResponseEnums {

}