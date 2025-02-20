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

case class FeedsUpdateRequest(
  defaultCurrency: Option[NullableCurrency],

  /* A human-friendly name associated to a given feed. */
  name: Option[String],

  format: Option[CatalogsFormat],

  credentials: Option[CatalogsFeedCredentials],

  /* The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. */
  location: Option[String],

  preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule],

  status: Option[CatalogsStatus],

  catalogType: CatalogsType,

  defaultAvailability: Option[ProductAvailabilityType]

 )
