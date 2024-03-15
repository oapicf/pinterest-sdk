goog.provide('API.Client.CatalogsHotelAddress');

/**
 * @record
 */
API.Client.CatalogsHotelAddress = function() {}

/**
 * Primary street address of hotel.
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelAddress.prototype.addr1;

/**
 * City where the hotel is located.
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelAddress.prototype.city;

/**
 * State, county, province, where the hotel is located.
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelAddress.prototype.region;

/**
 * Country where the hotel is located.
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelAddress.prototype.country;

/**
 * Required for countries with a postal code system. Postal or zip code of the hotel.
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelAddress.prototype.postalCode;

