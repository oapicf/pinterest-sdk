goog.provide('API.Client.CatalogsFeedIngestionWarnings');

/**
 * @record
 */
API.Client.CatalogsFeedIngestionWarnings = function() {}

/**
 * We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedIngestionWarnings.prototype.ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR;

/**
 * Additional image files are unreadable. Please upload new files to continue.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedIngestionWarnings.prototype.ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE;

/**
 * Additional image files are unreadable. Please check your link and upload new files to continue.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedIngestionWarnings.prototype.ADDITIONAL_IMAGE_MALFORMED_URL;

/**
 * Additional image files are unreadable. Please upload new files to continue.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedIngestionWarnings.prototype.ADDITIONAL_IMAGE_FILE_NOT_FOUND;

/**
 * Additional image files are unreadable. Please upload new files to continue.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedIngestionWarnings.prototype.ADDITIONAL_IMAGE_INVALID_FILE;

/**
 * price is not a supported column. Use base_price and sale_price instead.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedIngestionWarnings.prototype.HOTEL_PRICE_HEADER_IS_PRESENT;

