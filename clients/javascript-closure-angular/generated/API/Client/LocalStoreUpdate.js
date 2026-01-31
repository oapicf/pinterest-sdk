goog.provide('API.Client.LocalStoreUpdate');

/**
 * @record
 */
API.Client.LocalStoreUpdate = function() {}

/**
 * Primary address line of the store.
 * @type {!string}
 * @export
 */
API.Client.LocalStoreUpdate.prototype.addressPrimary;

/**
 * Secondary address line of the store.
 * @type {!string}
 * @export
 */
API.Client.LocalStoreUpdate.prototype.addressSecondary;

/**
 * City where the store is located.
 * @type {!string}
 * @export
 */
API.Client.LocalStoreUpdate.prototype.city;

/**
 * Country code where the store is located.
 * @type {!API.Client.Country}
 * @export
 */
API.Client.LocalStoreUpdate.prototype.country;

/**
 * The ID of the local store.
 * @type {!string}
 * @export
 */
API.Client.LocalStoreUpdate.prototype.id;

/**
 * Geographic latitude coordinate of the store.
 * @type {!number}
 * @export
 */
API.Client.LocalStoreUpdate.prototype.latitude;

/**
 * Geographic longitude coordinate of the store.
 * @type {!number}
 * @export
 */
API.Client.LocalStoreUpdate.prototype.longitude;

/**
 * The name of the local store.
 * @type {!string}
 * @export
 */
API.Client.LocalStoreUpdate.prototype.name;

/**
 * Postal or ZIP code of the store.
 * @type {!string}
 * @export
 */
API.Client.LocalStoreUpdate.prototype.postalCode;

/**
 * State or region code where the store is located.
 * @type {!string}
 * @export
 */
API.Client.LocalStoreUpdate.prototype.region;

/**
 * Merchant provided code for the local store. Unique within the merchant's catalog.
 * @type {!string}
 * @export
 */
API.Client.LocalStoreUpdate.prototype.storeCode;

