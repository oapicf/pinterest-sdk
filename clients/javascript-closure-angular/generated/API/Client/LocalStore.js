goog.provide('API.Client.LocalStore');

/**
 * Local store entity
 * @record
 */
API.Client.LocalStore = function() {}

/**
 * Primary address line of the store.
 * @type {!string}
 * @export
 */
API.Client.LocalStore.prototype.addressPrimary;

/**
 * Secondary address line of the store.
 * @type {!string}
 * @export
 */
API.Client.LocalStore.prototype.addressSecondary;

/**
 * City where the store is located.
 * @type {!string}
 * @export
 */
API.Client.LocalStore.prototype.city;

/**
 * Country code where the store is located.
 * @type {!API.Client.Country}
 * @export
 */
API.Client.LocalStore.prototype.country;

/**
 * Creation timestamp
 * @type {!Date}
 * @export
 */
API.Client.LocalStore.prototype.createdAt;

/**
 * The ID of the local store.
 * @type {!string}
 * @export
 */
API.Client.LocalStore.prototype.id;

/**
 * Geographic latitude coordinate of the store.
 * @type {!number}
 * @export
 */
API.Client.LocalStore.prototype.latitude;

/**
 * Geographic longitude coordinate of the store.
 * @type {!number}
 * @export
 */
API.Client.LocalStore.prototype.longitude;

/**
 * The name of the local store.
 * @type {!string}
 * @export
 */
API.Client.LocalStore.prototype.name;

/**
 * Postal or ZIP code of the store.
 * @type {!string}
 * @export
 */
API.Client.LocalStore.prototype.postalCode;

/**
 * State or region code where the store is located.
 * @type {!string}
 * @export
 */
API.Client.LocalStore.prototype.region;

/**
 * Merchant provided code for the local store. Unique within the merchant's catalog.
 * @type {!string}
 * @export
 */
API.Client.LocalStore.prototype.storeCode;

/**
 * Last update timestamp
 * @type {!Date}
 * @export
 */
API.Client.LocalStore.prototype.updatedAt;

