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

import org.openapitools.client.model.CatalogsFormat._
import org.openapitools.client.model.CatalogsStatus._
import org.openapitools.client.model.CatalogsType._
import org.openapitools.client.model.Country._
import org.openapitools.client.model.NullableCurrency._

  /**
   * feeds_creative_assets_create_request
   * Request object for creating a feed.
   */
case class CatalogsCreativeAssetsFeedsCreateRequest(
  defaultCurrency: Option[NullableCurrency] = None,
  /* A human-friendly name associated to a given feed. */
  name: String,
  format: CatalogsFormat,
  defaultLocale: CatalogsFeedsCreateRequestDefaultLocale,
  defaultCountry: Country,
  credentials: Option[CatalogsFeedCredentials] = None,
  /* The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. */
  location: String,
  preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule] = None,
  catalogType: CatalogsType,
  /* Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple creative assets feeds but this will change in the future. */
  catalogId: Option[String] = None,
  status: Option[CatalogsStatus] = None
)

object CatalogsCreativeAssetsFeedsCreateRequestEnums {

}
