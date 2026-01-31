goog.provide('API.Client.CatalogsUpdatableHotelAttributes');

/**
 * @record
 */
API.Client.CatalogsUpdatableHotelAttributes = function() {}

/**
 * @type {!API.Client.CatalogsHotelAddress}
 * @export
 */
API.Client.CatalogsUpdatableHotelAttributes.prototype.address;

/**
 * Base price of the hotel room per night followed by the ISO currency code
 * @type {!string}
 * @export
 */
API.Client.CatalogsUpdatableHotelAttributes.prototype.basePrice;

/**
 * The brand to which this hotel belongs to.
 * @type {!string}
 * @export
 */
API.Client.CatalogsUpdatableHotelAttributes.prototype.brand;

/**
 * The type of property. The category can be any type of internal description desired.
 * @type {!string}
 * @export
 */
API.Client.CatalogsUpdatableHotelAttributes.prototype.category;

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
 * Brief description of the hotel.
 * @type {!string}
 * @export
 */
API.Client.CatalogsUpdatableHotelAttributes.prototype.description;

/**
 * @type {!API.Client.CatalogsHotelGuestRatings}
 * @export
 */
API.Client.CatalogsUpdatableHotelAttributes.prototype.guestRatings;

/**
 * Latitude of the hotel.
 * @type {!number}
 * @export
 */
API.Client.CatalogsUpdatableHotelAttributes.prototype.latitude;

/**
 * Link to the product page
 * @type {!string}
 * @export
 */
API.Client.CatalogsUpdatableHotelAttributes.prototype.link;

/**
 * Longitude of the hotel.
 * @type {!number}
 * @export
 */
API.Client.CatalogsUpdatableHotelAttributes.prototype.longitude;

/**
 * The hotel's name.
 * @type {!string}
 * @export
 */
API.Client.CatalogsUpdatableHotelAttributes.prototype.name;

/**
 * A list of neighborhoods where the hotel is located
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsUpdatableHotelAttributes.prototype.neighborhood;

/**
 * Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
 * @type {!string}
 * @export
 */
API.Client.CatalogsUpdatableHotelAttributes.prototype.salePrice;

