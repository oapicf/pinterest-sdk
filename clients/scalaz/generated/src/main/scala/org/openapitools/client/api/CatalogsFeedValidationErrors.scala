package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsFeedValidationErrors._

case class CatalogsFeedValidationErrors (
  /* Pinterest couldn't download your feed. */
  FETCH_ERROR: Option[Integer],
/* Your feed wasn't ingested because it hasn’t changed in the previous 90 days. */
  FETCH_INACTIVE_FEED_ERROR: Option[Integer],
/* Your feed includes data with an unsupported encoding format. */
  ENCODING_ERROR: Option[Integer],
/* Your feed includes data with formatting errors. */
  DELIMITER_ERROR: Option[Integer],
/* Your feed is missing some required column headers. */
  REQUIRED_COLUMNS_MISSING: Option[Integer],
/* Some products are duplicated. */
  DUPLICATE_PRODUCTS: Option[Integer],
/* Some image links are formatted incorrectly. */
  IMAGE_LINK_INVALID: Option[Integer],
/* Some items are missing an item id in their product metadata, those items will not be published. */
  ITEMID_MISSING: Option[Integer],
/* Some items are missing a title in their product metadata, those items will not be published. */
  TITLE_MISSING: Option[Integer],
/* Some items are missing a description in their product metadata, those items will not be published. */
  DESCRIPTION_MISSING: Option[Integer],
/* Some items are missing a link URL in their product metadata, those items will not be published. */
  PRODUCT_LINK_MISSING: Option[Integer],
/* Some items are missing an image link URL in their product metadata, those items will not be published. */
  IMAGE_LINK_MISSING: Option[Integer],
/* Some items are missing an availability value in their product metadata, those items will not be published. */
  AVAILABILITY_INVALID: Option[Integer],
/* Some items have price formatting errors in their product metadata, those items will not be published. */
  PRODUCT_PRICE_INVALID: Option[Integer],
/* Some link values are formatted incorrectly. */
  LINK_FORMAT_INVALID: Option[Integer],
/* Your feed contains formatting errors for some items. */
  PARSE_LINE_ERROR: Option[Integer],
/* Some adwords links contain too many characters. */
  ADWORDS_FORMAT_INVALID: Option[Integer],
/* We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours. */
  INTERNAL_SERVICE_ERROR: Option[Integer],
/* Your merchant domain needs to be claimed. */
  NO_VERIFIED_DOMAIN: Option[Integer],
/* Some items have invalid adult values. */
  ADULT_INVALID: Option[Integer],
/* Some items have image_link URLs that contain too many characters, so those items will not be published. */
  IMAGE_LINK_LENGTH_TOO_LONG: Option[Integer],
/* Some of your product link values don't match the verified domain associated with this account. */
  INVALID_DOMAIN: Option[Integer],
/* Your feed contains too many items, some items will not be published. */
  FEED_LENGTH_TOO_LONG: Option[Integer],
/* Some product links contain too many characters, those items will not be published. */
  LINK_LENGTH_TOO_LONG: Option[Integer],
/* Your feed couldn't be validated because the xml file is formatted incorrectly. */
  MALFORMED_XML: Option[Integer],
/* Some products are missing a price, those items will not be published. */
  PRICE_MISSING: Option[Integer],
/* Your feed couldn't be validated because the file doesn't contain the minimum number of lines required. */
  FEED_TOO_SMALL: Option[Integer],
/* Some items exceed the maximum number of items per item group, those items will not be published. */
  MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED: Option[Integer],
/* Some items' main images can't be found. */
  ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE: Option[Integer],
/* Some items were not published because they don't meet Pinterest's Merchant Guidelines. */
  PINJOIN_CONTENT_UNSAFE: Option[Integer],
/* Some items were not published because they don't meet Pinterest's Merchant Guidelines. */
  BLOCKLISTED_IMAGE_SIGNATURE: Option[Integer],
/* Some items have list price formatting errors in their product metadata, those items will not be published. */
  LIST_PRICE_INVALID: Option[Integer],
/* Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published. */
  PRICE_CANNOT_BE_DETERMINED: Option[Integer])

object CatalogsFeedValidationErrors {
  import DateTimeCodecs._

  implicit val CatalogsFeedValidationErrorsCodecJson: CodecJson[CatalogsFeedValidationErrors] = CodecJson.derive[CatalogsFeedValidationErrors]
  implicit val CatalogsFeedValidationErrorsDecoder: EntityDecoder[CatalogsFeedValidationErrors] = jsonOf[CatalogsFeedValidationErrors]
  implicit val CatalogsFeedValidationErrorsEncoder: EntityEncoder[CatalogsFeedValidationErrors] = jsonEncoderOf[CatalogsFeedValidationErrors]
}
