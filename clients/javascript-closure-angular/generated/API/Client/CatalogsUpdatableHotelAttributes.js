goog.provide('API.Client.CatalogsUpdatableHotelAttributes');

/**
 * @record
 */
API.Client.CatalogsUpdatableHotelAttributes = function() {}

/**
 * The hotel's name.
 * @type {!string}
 * @export
 */
API.Client.CatalogsUpdatableHotelAttributes.prototype.name;

/**
 * Link to the product page
 * @type {!string}
 * @export
 */
API.Client.CatalogsUpdatableHotelAttributes.prototype.link;

/**
 * Brief description of the hotel.
 * @type {!string}
 * @export
 */
API.Client.CatalogsUpdatableHotelAttributes.prototype.description;

/**
 * The brand to which this hotel belongs to.
 * @type {!string}
 * @export
 */
API.Client.CatalogsUpdatableHotelAttributes.prototype.brand;

/**
 * Latitude of the hotel.
 * @type {!number}
 * @export
 */
API.Client.CatalogsUpdatableHotelAttributes.prototype.latitude;

/**
 * Longitude of the hotel.
 * @type {!number}
 * @export
 */
API.Client.CatalogsUpdatableHotelAttributes.prototype.longitude;

/**
 * A list of neighborhoods where the hotel is located
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsUpdatableHotelAttributes.prototype.neighborhood;

/**
 * @type {!API.Client.CatalogsHotelAddress}
 * @export
 */
API.Client.CatalogsUpdatableHotelAttributes.prototype.address;

/**
 * Custom grouping of hotels
 * @type {!string}
 * @export
 */
API.Client.CatalogsUpdatableHotelAttributes.prototype.customLabel0;

/**
 * Custom grouping of hotels
 * @type {!string}
 * @export
 */
API.Client.CatalogsUpdatableHotelAttributes.prototype.customLabel1;

/**
 * Custom grouping of hotels
 * @type {!string}
 * @export
 */
API.Client.CatalogsUpdatableHotelAttributes.prototype.customLabel2;

/**
 * Custom grouping of hotels
 * @type {!string}
 * @export
 */
API.Client.CatalogsUpdatableHotelAttributes.prototype.customLabel3;

/**
 * Custom grouping of hotels
 * @type {!string}
 * @export
 */
API.Client.CatalogsUpdatableHotelAttributes.prototype.customLabel4;

/**
 * The type of property. The category can be any type of internal description desired.
 * @type {!string}
 * @export
 */
API.Client.CatalogsUpdatableHotelAttributes.prototype.category;

/**
 * Base price of the hotel room per night followed by the ISO currency code
 * @type {!string}
 * @export
 */
API.Client.CatalogsUpdatableHotelAttributes.prototype.basePrice;

/**
 * Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
 * @type {!string}
 * @export
 */
API.Client.CatalogsUpdatableHotelAttributes.prototype.salePrice;

/**
 * @type {!API.Client.CatalogsHotelGuestRatings}
 * @export
 */
API.Client.CatalogsUpdatableHotelAttributes.prototype.guestRatings;

