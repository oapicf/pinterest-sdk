package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsFeedValidationErrors.
  * @param FETCH_ERROR Pinterest couldn't download your feed.
  * @param FETCH_INACTIVE_FEED_ERROR Your feed wasn't ingested because it hasn’t changed in the previous 90 days.
  * @param ENCODING_ERROR Your feed includes data with an unsupported encoding format.
  * @param DELIMITER_ERROR Your feed includes data with formatting errors.
  * @param REQUIRED_COLUMNS_MISSING Your feed is missing some required column headers.
  * @param DUPLICATE_PRODUCTS Some products are duplicated.
  * @param IMAGE_LINK_INVALID Some image links are formatted incorrectly.
  * @param ITEMID_MISSING Some items are missing an item id in their product metadata, those items will not be published.
  * @param TITLE_MISSING Some items are missing a title in their product metadata, those items will not be published.
  * @param DESCRIPTION_MISSING Some items are missing a description in their product metadata, those items will not be published.
  * @param PRODUCT_LINK_MISSING Some items are missing a link URL in their product metadata, those items will not be published.
  * @param IMAGE_LINK_MISSING Some items are missing an image link URL in their product metadata, those items will not be published.
  * @param AVAILABILITY_INVALID Some items are missing an availability value in their product metadata, those items will not be published.
  * @param PRODUCT_PRICE_INVALID Some items have price formatting errors in their product metadata, those items will not be published.
  * @param LINK_FORMAT_INVALID Some link values are formatted incorrectly.
  * @param PARSE_LINE_ERROR Your feed contains formatting errors for some items.
  * @param ADWORDS_FORMAT_INVALID Some adwords links contain too many characters.
  * @param INTERNAL_SERVICE_ERROR We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours.
  * @param NO_VERIFIED_DOMAIN Your merchant domain needs to be claimed.
  * @param ADULT_INVALID Some items have invalid adult values.
  * @param IMAGE_LINK_LENGTH_TOO_LONG Some items have image_link URLs that contain too many characters, so those items will not be published.
  * @param INVALID_DOMAIN Some of your product link values don't match the verified domain associated with this account.
  * @param FEED_LENGTH_TOO_LONG Your feed contains too many items, some items will not be published.
  * @param LINK_LENGTH_TOO_LONG Some product links contain too many characters, those items will not be published.
  * @param MALFORMED_XML Your feed couldn't be validated because the xml file is formatted incorrectly.
  * @param PRICE_MISSING Some products are missing a price, those items will not be published.
  * @param FEED_TOO_SMALL Your feed couldn't be validated because the file doesn't contain the minimum number of lines required.
  * @param MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED Some items exceed the maximum number of items per item group, those items will not be published.
  * @param ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE Some items' main images can't be found.
  * @param PINJOIN_CONTENT_UNSAFE Some items were not published because they don't meet Pinterest's Merchant Guidelines.
  * @param BLOCKLISTED_IMAGE_SIGNATURE Some items were not published because they don't meet Pinterest's Merchant Guidelines.
  * @param LIST_PRICE_INVALID Some items have list price formatting errors in their product metadata, those items will not be published.
  * @param PRICE_CANNOT_BE_DETERMINED Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsFeedValidationErrors(
  FETCH_ERROR: Option[Int],
  FETCH_INACTIVE_FEED_ERROR: Option[Int],
  ENCODING_ERROR: Option[Int],
  DELIMITER_ERROR: Option[Int],
  REQUIRED_COLUMNS_MISSING: Option[Int],
  DUPLICATE_PRODUCTS: Option[Int],
  IMAGE_LINK_INVALID: Option[Int],
  ITEMID_MISSING: Option[Int],
  TITLE_MISSING: Option[Int],
  DESCRIPTION_MISSING: Option[Int],
  PRODUCT_LINK_MISSING: Option[Int],
  IMAGE_LINK_MISSING: Option[Int],
  AVAILABILITY_INVALID: Option[Int],
  PRODUCT_PRICE_INVALID: Option[Int],
  LINK_FORMAT_INVALID: Option[Int],
  PARSE_LINE_ERROR: Option[Int],
  ADWORDS_FORMAT_INVALID: Option[Int],
  INTERNAL_SERVICE_ERROR: Option[Int],
  NO_VERIFIED_DOMAIN: Option[Int],
  ADULT_INVALID: Option[Int],
  IMAGE_LINK_LENGTH_TOO_LONG: Option[Int],
  INVALID_DOMAIN: Option[Int],
  FEED_LENGTH_TOO_LONG: Option[Int],
  LINK_LENGTH_TOO_LONG: Option[Int],
  MALFORMED_XML: Option[Int],
  PRICE_MISSING: Option[Int],
  FEED_TOO_SMALL: Option[Int],
  MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED: Option[Int],
  ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE: Option[Int],
  PINJOIN_CONTENT_UNSAFE: Option[Int],
  BLOCKLISTED_IMAGE_SIGNATURE: Option[Int],
  LIST_PRICE_INVALID: Option[Int],
  PRICE_CANNOT_BE_DETERMINED: Option[Int]
)

object CatalogsFeedValidationErrors {
  implicit lazy val catalogsFeedValidationErrorsJsonFormat: Format[CatalogsFeedValidationErrors] = Json.format[CatalogsFeedValidationErrors]
}

