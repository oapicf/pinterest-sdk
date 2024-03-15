package org.openapitools.server.model


/**
 * @param FETCH_ERROR Pinterest couldn't download your feed. for example: ''null''
 * @param FETCH_INACTIVE_FEED_ERROR Your feed wasn't ingested because it hasn’t changed in the previous 90 days. for example: ''null''
 * @param ENCODING_ERROR Your feed includes data with an unsupported encoding format. for example: ''null''
 * @param DELIMITER_ERROR Your feed includes data with formatting errors. for example: ''null''
 * @param REQUIRED_COLUMNS_MISSING Your feed is missing some required column headers. for example: ''null''
 * @param DUPLICATE_PRODUCTS Some products are duplicated. for example: ''null''
 * @param IMAGE_LINK_INVALID Some image links are formatted incorrectly. for example: ''null''
 * @param ITEMID_MISSING Some items are missing an item id in their product metadata, those items will not be published. for example: ''null''
 * @param TITLE_MISSING Some items are missing a title in their product metadata, those items will not be published. for example: ''null''
 * @param DESCRIPTION_MISSING Some items are missing a description in their product metadata, those items will not be published. for example: ''null''
 * @param PRODUCT_LINK_MISSING Some items are missing a link URL in their product metadata, those items will not be published. for example: ''null''
 * @param IMAGE_LINK_MISSING Some items are missing an image link URL in their product metadata, those items will not be published. for example: ''null''
 * @param AVAILABILITY_INVALID Some items are missing an availability value in their product metadata, those items will not be published. for example: ''null''
 * @param PRODUCT_PRICE_INVALID Some items have price formatting errors in their product metadata, those items will not be published. for example: ''null''
 * @param LINK_FORMAT_INVALID Some link values are formatted incorrectly. for example: ''null''
 * @param PARSE_LINE_ERROR Your feed contains formatting errors for some items. for example: ''null''
 * @param ADWORDS_FORMAT_INVALID Some adwords links contain too many characters. for example: ''null''
 * @param INTERNAL_SERVICE_ERROR We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours. for example: ''null''
 * @param NO_VERIFIED_DOMAIN Your merchant domain needs to be claimed. for example: ''null''
 * @param ADULT_INVALID Some items have invalid adult values. for example: ''null''
 * @param IMAGE_LINK_LENGTH_TOO_LONG Some items have image_link URLs that contain too many characters, so those items will not be published. for example: ''null''
 * @param INVALID_DOMAIN Some of your product link values don't match the verified domain associated with this account. for example: ''null''
 * @param FEED_LENGTH_TOO_LONG Your feed contains too many items, some items will not be published. for example: ''null''
 * @param LINK_LENGTH_TOO_LONG Some product links contain too many characters, those items will not be published. for example: ''null''
 * @param MALFORMED_XML Your feed couldn't be validated because the xml file is formatted incorrectly. for example: ''null''
 * @param PRICE_MISSING Some products are missing a price, those items will not be published. for example: ''null''
 * @param FEED_TOO_SMALL Your feed couldn't be validated because the file doesn't contain the minimum number of lines required. for example: ''null''
 * @param MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED Some items exceed the maximum number of items per item group, those items will not be published. for example: ''null''
 * @param ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE Some items' main images can't be found. for example: ''null''
 * @param PINJOIN_CONTENT_UNSAFE Some items were not published because they don't meet Pinterest's Merchant Guidelines. for example: ''null''
 * @param BLOCKLISTED_IMAGE_SIGNATURE Some items were not published because they don't meet Pinterest's Merchant Guidelines. for example: ''null''
 * @param LIST_PRICE_INVALID Some items have list price formatting errors in their product metadata, those items will not be published. for example: ''null''
 * @param PRICE_CANNOT_BE_DETERMINED Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published. for example: ''null''
*/
final case class CatalogsFeedValidationErrors (
  FETCH_ERROR: Option[Int] = None,
  FETCH_INACTIVE_FEED_ERROR: Option[Int] = None,
  ENCODING_ERROR: Option[Int] = None,
  DELIMITER_ERROR: Option[Int] = None,
  REQUIRED_COLUMNS_MISSING: Option[Int] = None,
  DUPLICATE_PRODUCTS: Option[Int] = None,
  IMAGE_LINK_INVALID: Option[Int] = None,
  ITEMID_MISSING: Option[Int] = None,
  TITLE_MISSING: Option[Int] = None,
  DESCRIPTION_MISSING: Option[Int] = None,
  PRODUCT_LINK_MISSING: Option[Int] = None,
  IMAGE_LINK_MISSING: Option[Int] = None,
  AVAILABILITY_INVALID: Option[Int] = None,
  PRODUCT_PRICE_INVALID: Option[Int] = None,
  LINK_FORMAT_INVALID: Option[Int] = None,
  PARSE_LINE_ERROR: Option[Int] = None,
  ADWORDS_FORMAT_INVALID: Option[Int] = None,
  INTERNAL_SERVICE_ERROR: Option[Int] = None,
  NO_VERIFIED_DOMAIN: Option[Int] = None,
  ADULT_INVALID: Option[Int] = None,
  IMAGE_LINK_LENGTH_TOO_LONG: Option[Int] = None,
  INVALID_DOMAIN: Option[Int] = None,
  FEED_LENGTH_TOO_LONG: Option[Int] = None,
  LINK_LENGTH_TOO_LONG: Option[Int] = None,
  MALFORMED_XML: Option[Int] = None,
  PRICE_MISSING: Option[Int] = None,
  FEED_TOO_SMALL: Option[Int] = None,
  MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED: Option[Int] = None,
  ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE: Option[Int] = None,
  PINJOIN_CONTENT_UNSAFE: Option[Int] = None,
  BLOCKLISTED_IMAGE_SIGNATURE: Option[Int] = None,
  LIST_PRICE_INVALID: Option[Int] = None,
  PRICE_CANNOT_BE_DETERMINED: Option[Int] = None
)

