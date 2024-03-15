goog.provide('API.Client.CatalogsFeedValidationErrors');

/**
 * @record
 */
API.Client.CatalogsFeedValidationErrors = function() {}

/**
 * Pinterest couldn't download your feed.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationErrors.prototype.FETCH_ERROR;

/**
 * Your feed wasn't ingested because it hasn’t changed in the previous 90 days.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationErrors.prototype.FETCH_INACTIVE_FEED_ERROR;

/**
 * Your feed includes data with an unsupported encoding format.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationErrors.prototype.ENCODING_ERROR;

/**
 * Your feed includes data with formatting errors.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationErrors.prototype.DELIMITER_ERROR;

/**
 * Your feed is missing some required column headers.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationErrors.prototype.REQUIRED_COLUMNS_MISSING;

/**
 * Some products are duplicated.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationErrors.prototype.DUPLICATE_PRODUCTS;

/**
 * Some image links are formatted incorrectly.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationErrors.prototype.IMAGE_LINK_INVALID;

/**
 * Some items are missing an item id in their product metadata, those items will not be published.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationErrors.prototype.ITEMID_MISSING;

/**
 * Some items are missing a title in their product metadata, those items will not be published.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationErrors.prototype.TITLE_MISSING;

/**
 * Some items are missing a description in their product metadata, those items will not be published.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationErrors.prototype.DESCRIPTION_MISSING;

/**
 * Some items are missing a link URL in their product metadata, those items will not be published.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationErrors.prototype.PRODUCT_LINK_MISSING;

/**
 * Some items are missing an image link URL in their product metadata, those items will not be published.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationErrors.prototype.IMAGE_LINK_MISSING;

/**
 * Some items are missing an availability value in their product metadata, those items will not be published.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationErrors.prototype.AVAILABILITY_INVALID;

/**
 * Some items have price formatting errors in their product metadata, those items will not be published.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationErrors.prototype.PRODUCT_PRICE_INVALID;

/**
 * Some link values are formatted incorrectly.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationErrors.prototype.LINK_FORMAT_INVALID;

/**
 * Your feed contains formatting errors for some items.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationErrors.prototype.PARSE_LINE_ERROR;

/**
 * Some adwords links contain too many characters.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationErrors.prototype.ADWORDS_FORMAT_INVALID;

/**
 * We experienced a technical difficulty and were unable to ingest your feed. The next ingestion will happen in 24 hours.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationErrors.prototype.INTERNAL_SERVICE_ERROR;

/**
 * Your merchant domain needs to be claimed.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationErrors.prototype.NO_VERIFIED_DOMAIN;

/**
 * Some items have invalid adult values.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationErrors.prototype.ADULT_INVALID;

/**
 * Some items have image_link URLs that contain too many characters, so those items will not be published.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationErrors.prototype.IMAGE_LINK_LENGTH_TOO_LONG;

/**
 * Some of your product link values don't match the verified domain associated with this account.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationErrors.prototype.INVALID_DOMAIN;

/**
 * Your feed contains too many items, some items will not be published.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationErrors.prototype.FEED_LENGTH_TOO_LONG;

/**
 * Some product links contain too many characters, those items will not be published.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationErrors.prototype.LINK_LENGTH_TOO_LONG;

/**
 * Your feed couldn't be validated because the xml file is formatted incorrectly.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationErrors.prototype.MALFORMED_XML;

/**
 * Some products are missing a price, those items will not be published.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationErrors.prototype.PRICE_MISSING;

/**
 * Your feed couldn't be validated because the file doesn't contain the minimum number of lines required.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationErrors.prototype.FEED_TOO_SMALL;

/**
 * Some items exceed the maximum number of items per item group, those items will not be published.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationErrors.prototype.MAX_ITEMS_PER_ITEM_GROUP_EXCEEDED;

/**
 * Some items' main images can't be found.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationErrors.prototype.ITEM_MAIN_IMAGE_DOWNLOAD_FAILURE;

/**
 * Some items were not published because they don't meet Pinterest's Merchant Guidelines.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationErrors.prototype.PINJOIN_CONTENT_UNSAFE;

/**
 * Some items were not published because they don't meet Pinterest's Merchant Guidelines.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationErrors.prototype.BLOCKLISTED_IMAGE_SIGNATURE;

/**
 * Some items have list price formatting errors in their product metadata, those items will not be published.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationErrors.prototype.LIST_PRICE_INVALID;

/**
 * Some items were not published because price cannot be determined. The price, list price, and sale price are all different, so those items will not be published.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedValidationErrors.prototype.PRICE_CANNOT_BE_DETERMINED;

