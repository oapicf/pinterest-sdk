goog.provide('API.Client.StoreMetadata');

/**
 * Store metadata for a specific store location
 * @record
 */
API.Client.StoreMetadata = function() {}

/**
 * Geohash of the store location
 * @type {!string}
 * @export
 */
API.Client.StoreMetadata.prototype.geohash;

/**
 * Geographic latitude coordinate of the store
 * @type {!number}
 * @export
 */
API.Client.StoreMetadata.prototype.latitude;

/**
 * Geographic longitude coordinate of the store
 * @type {!number}
 * @export
 */
API.Client.StoreMetadata.prototype.longitude;

/**
 * Merchant provided store code
 * @type {!string}
 * @export
 */
API.Client.StoreMetadata.prototype.storeCode;

/**
 * Internal store code
 * @type {!string}
 * @export
 */
API.Client.StoreMetadata.prototype.storeId;

/**
 * Store name
 * @type {!string}
 * @export
 */
API.Client.StoreMetadata.prototype.storeName;

