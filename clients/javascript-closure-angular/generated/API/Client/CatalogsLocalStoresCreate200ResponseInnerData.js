goog.provide('API.Client.catalogs_local_stores_create_200_response_inner_data');

/**
 * Created/updated resource on success or error details on failure
 * @record
 */
API.Client.CatalogsLocalStoresCreate200ResponseInnerData = function() {}

/**
 * Primary address line of the store.
 * @type {!string}
 * @export
 */
API.Client.CatalogsLocalStoresCreate200ResponseInnerData.prototype.addressPrimary;

/**
 * Secondary address line of the store.
 * @type {!string}
 * @export
 */
API.Client.CatalogsLocalStoresCreate200ResponseInnerData.prototype.addressSecondary;

/**
 * City where the store is located.
 * @type {!string}
 * @export
 */
API.Client.CatalogsLocalStoresCreate200ResponseInnerData.prototype.city;

/**
 * Country code where the store is located.
 * @type {!API.Client.Country}
 * @export
 */
API.Client.CatalogsLocalStoresCreate200ResponseInnerData.prototype.country;

/**
 * Creation timestamp
 * @type {!Date}
 * @export
 */
API.Client.CatalogsLocalStoresCreate200ResponseInnerData.prototype.createdAt;

/**
 * The ID of the local store.
 * @type {!string}
 * @export
 */
API.Client.CatalogsLocalStoresCreate200ResponseInnerData.prototype.id;

/**
 * Geographic latitude coordinate of the store.
 * @type {!number}
 * @export
 */
API.Client.CatalogsLocalStoresCreate200ResponseInnerData.prototype.latitude;

/**
 * Geographic longitude coordinate of the store.
 * @type {!number}
 * @export
 */
API.Client.CatalogsLocalStoresCreate200ResponseInnerData.prototype.longitude;

/**
 * The name of the local store.
 * @type {!string}
 * @export
 */
API.Client.CatalogsLocalStoresCreate200ResponseInnerData.prototype.name;

/**
 * Postal or ZIP code of the store.
 * @type {!string}
 * @export
 */
API.Client.CatalogsLocalStoresCreate200ResponseInnerData.prototype.postalCode;

/**
 * State or region code where the store is located.
 * @type {!string}
 * @export
 */
API.Client.CatalogsLocalStoresCreate200ResponseInnerData.prototype.region;

/**
 * Merchant provided code for the local store. Unique within the merchant's catalog.
 * @type {!string}
 * @export
 */
API.Client.CatalogsLocalStoresCreate200ResponseInnerData.prototype.storeCode;

/**
 * Last update timestamp
 * @type {!Date}
 * @export
 */
API.Client.CatalogsLocalStoresCreate200ResponseInnerData.prototype.updatedAt;

/**
 * @type {!API.Client.Pinterest.Lib.Error}
 * @export
 */
API.Client.CatalogsLocalStoresCreate200ResponseInnerData.prototype.exceptions;

