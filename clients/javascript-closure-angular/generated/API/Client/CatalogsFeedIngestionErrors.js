goog.provide('API.Client.CatalogsFeedIngestionErrors');

/**
 * @record
 */
API.Client.CatalogsFeedIngestionErrors = function() {}

/**
 * We experienced a technical difficulty and were unable to ingest this some items. The next ingestion will happen in 24 hours.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedIngestionErrors.prototype.LINE_LEVEL_INTERNAL_ERROR;

/**
 * The product count has decreased by more than 99% compared to the last successful ingestion.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedIngestionErrors.prototype.LARGE_PRODUCT_COUNT_DECREASE;

/**
 * We detected an issue with your account and are not currently ingesting your items. Please review our policies at policy.pinterest.com/community-guidelines#section-spam or contact us at help.pinterest.com/contact for more information.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedIngestionErrors.prototype.ACCOUNT_FLAGGED;

/**
 * We experienced a technical difficulty and were unable to download some images. The next download attempt will happen in 24 hours.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedIngestionErrors.prototype.IMAGE_LEVEL_INTERNAL_ERROR;

/**
 * Image files are unreadable. Please upload new files to continue.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedIngestionErrors.prototype.IMAGE_FILE_NOT_ACCESSIBLE;

/**
 * Image files are unreadable. Please check your link and upload new files to continue.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedIngestionErrors.prototype.IMAGE_MALFORMED_URL;

/**
 * Image files are unreadable. Please upload new files to continue.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedIngestionErrors.prototype.IMAGE_FILE_NOT_FOUND;

/**
 * Image files are unreadable. Please upload new files to continue.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedIngestionErrors.prototype.IMAGE_INVALID_FILE;

/** @enum {string} */
API.Client.CatalogsFeedIngestionErrors.LARGE_PRODUCT_COUNT_DECREASEEnum = { 
  1: '1',
}
