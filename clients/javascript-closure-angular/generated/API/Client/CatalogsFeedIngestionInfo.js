goog.provide('API.Client.CatalogsFeedIngestionInfo');

/**
 * @record
 */
API.Client.CatalogsFeedIngestionInfo = function() {}

/**
 * The number of ingested products that are in stock.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedIngestionInfo.prototype.IN_STOCK;

/**
 * The number of ingested products that are in out of stock.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedIngestionInfo.prototype.OUT_OF_STOCK;

/**
 * The number of ingested products that are in preorder.
 * @type {!number}
 * @export
 */
API.Client.CatalogsFeedIngestionInfo.prototype.PREORDER;

