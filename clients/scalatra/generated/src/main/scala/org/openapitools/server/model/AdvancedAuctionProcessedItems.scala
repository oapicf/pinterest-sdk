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

case class AdvancedAuctionProcessedItems(
  /* Catalog id pertaining to all items */
  catalogId: Option[String],

  /* Array of advanced auction processed items */
  items: Option[List[AdvancedAuctionProcessedItem]]

 )
