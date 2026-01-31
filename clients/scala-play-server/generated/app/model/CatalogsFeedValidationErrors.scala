package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsFeedValidationErrors.
  * @param ADULT_INVALID Some items have invalid adult values.
  * @param ADWORDS_FORMAT_INVALID Some adwords links contain too many characters.
  * @param AVAILABILITY_INVALID Some items are missing an availability value in their product metadata, those items will not be published.
  * @param BLOCKLISTED_IMAGE_SIGNATURE Some items were not published because they don't meet Pinterest's Merchant Guidelines.
  * @param DELIMITER_ERROR Your feed includes data with formatting errors.
  * @param DESCRIPTION_MISSING Some items are missing a description in their product metadata, those items will not be published.
  * @param DUPLICATE_PRODUCTS Some products are duplicated.
  * @param ENCODING_ERROR Your feed includes data with an unsupported encoding format.
  * @param FEED_LENGTH_TOO_LONG Your feed contains too many items, some items will not be published.
  * @param FEED_TOO_SMALL Your feed couldn't be validated because the file doesn't contain the minimum number of lines required.
  * @param FETCH_ERROR Pinterest couldn't download your feed.
  * @param FETCH_INACTIVE_FEED_ERROR Your feed wasn't ingested because it hasn’t changed in the previous 90 days.
  * @param IMAGE_LINK_INVALID Some image links are formatted incorrectly.
  * @param IMAGE_LINK_LENGTH_TOO_LONG Some items have image_link URLs that contain too many characters, so those items will not be published.
  * @param IMAGE_LINK_MISSING Some items are missing an image link URL in their product metadata, those items will not be published.
  * @param INTERNAL_SERVICE_ERROR We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours.
  * @param INVALID_DOMAIN Some of your product link values don't match the verified domain associated with this account.
  * @param ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE Some items' main images can't be found.
  * @param ITEMID_MISSING Some items are missing an item id in their product metadata, those items will not be published.
  * @param LINK_FORMAT_INVALID Some link values are formatted incorrectly.
  * @param LINK_LENGTH_TOO_LONG Some product links contain too many characters, those items will not be published.
  * @param LIST_PRICE_INVALID Some items have list price formatting errors in their product metadata, those items will not be published.
  * @param MALFORMED_XML Your feed couldn't be validated because the xml file is formatted incorrectly.
  * @param MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED Some items exceed the maximum number of items per item group, those items will not be published.
  * @param NO_VERIFIED_DOMAIN Your merchant domain needs to be claimed.
  * @param PARSE_LINE_ERROR Your feed contains formatting errors for some items.
  * @param PINJOIN_CONTENT_UNSAFE Some items were not published because they don't meet Pinterest's Merchant Guidelines.
  * @param PRICE_CANNOT_BE_DETERMINED Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published.
  * @param PRICE_MISSING Some products are missing a price, those items will not be published.
  * @param PRODUCT_LINK_MISSING Some items are missing a link URL in their product metadata, those items will not be published.
  * @param PRODUCT_PRICE_INVALID Some items have price formatting errors in their product metadata, those items will not be published.
  * @param REQUIRED_COLUMNS_MISSING Your feed is missing some required column headers.
  * @param TITLE_MISSING Some items are missing a title in their product metadata, those items will not be published.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsFeedValidationErrors(
  ADULT_INVALID: Option[Int],
  ADWORDS_FORMAT_INVALID: Option[Int],
  AVAILABILITY_INVALID: Option[Int],
  BLOCKLISTED_IMAGE_SIGNATURE: Option[Int],
  DELIMITER_ERROR: Option[Int],
  DESCRIPTION_MISSING: Option[Int],
  DUPLICATE_PRODUCTS: Option[Int],
  ENCODING_ERROR: Option[Int],
  FEED_LENGTH_TOO_LONG: Option[Int],
  FEED_TOO_SMALL: Option[Int],
  FETCH_ERROR: Option[Int],
  FETCH_INACTIVE_FEED_ERROR: Option[Int],
  IMAGE_LINK_INVALID: Option[Int],
  IMAGE_LINK_LENGTH_TOO_LONG: Option[Int],
  IMAGE_LINK_MISSING: Option[Int],
  INTERNAL_SERVICE_ERROR: Option[Int],
  INVALID_DOMAIN: Option[Int],
  ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE: Option[Int],
  ITEMID_MISSING: Option[Int],
  LINK_FORMAT_INVALID: Option[Int],
  LINK_LENGTH_TOO_LONG: Option[Int],
  LIST_PRICE_INVALID: Option[Int],
  MALFORMED_XML: Option[Int],
  MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED: Option[Int],
  NO_VERIFIED_DOMAIN: Option[Int],
  PARSE_LINE_ERROR: Option[Int],
  PINJOIN_CONTENT_UNSAFE: Option[Int],
  PRICE_CANNOT_BE_DETERMINED: Option[Int],
  PRICE_MISSING: Option[Int],
  PRODUCT_LINK_MISSING: Option[Int],
  PRODUCT_PRICE_INVALID: Option[Int],
  REQUIRED_COLUMNS_MISSING: Option[Int],
  TITLE_MISSING: Option[Int]
)

object CatalogsFeedValidationErrors {
  implicit lazy val catalogsFeedValidationErrorsJsonFormat: Format[CatalogsFeedValidationErrors] = Json.format[CatalogsFeedValidationErrors]
}

