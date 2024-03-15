goog.provide('API.Client.CatalogsHotelAttributes');

/**
 * @record
 */
API.Client.CatalogsHotelAttributes = function() {}

/**
 * The hotel's name.
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelAttributes.prototype.name;

/**
 * Link to the product page
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelAttributes.prototype.link;

/**
 * Brief description of the hotel.
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelAttributes.prototype.description;

/**
 * The brand to which this hotel belongs to.
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelAttributes.prototype.brand;

/**
 * Latitude of the hotel.
 * @type {!number}
 * @export
 */
API.Client.CatalogsHotelAttributes.prototype.latitude;

/**
 * Longitude of the hotel.
 * @type {!number}
 * @export
 */
API.Client.CatalogsHotelAttributes.prototype.longitude;

/**
 * A list of neighborhoods where the hotel is located
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsHotelAttributes.prototype.neighborhood;

/**
 * @type {!API.Client.CatalogsHotelAddress}
 * @export
 */
API.Client.CatalogsHotelAttributes.prototype.address;

/**
 * Custom grouping of hotels
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelAttributes.prototype.customLabel0;

/**
 * Custom grouping of hotels
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelAttributes.prototype.customLabel1;

/**
 * Custom grouping of hotels
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelAttributes.prototype.customLabel2;

/**
 * Custom grouping of hotels
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelAttributes.prototype.customLabel3;

/**
 * Custom grouping of hotels
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelAttributes.prototype.customLabel4;

/**
 * The type of property. The category can be any type of internal description desired.
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelAttributes.prototype.category;

/**
 * Base price of the hotel room per night followed by the ISO currency code
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelAttributes.prototype.basePrice;

/**
 * Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelAttributes.prototype.salePrice;

/**
 * @type {!API.Client.CatalogsHotelGuestRatings}
 * @export
 */
API.Client.CatalogsHotelAttributes.prototype.guestRatings;

/**
 * @type {!API.Client.CatalogsHotelAttributes_allOf_main_image}
 * @export
 */
API.Client.CatalogsHotelAttributes.prototype.mainImage;

/**
 * <p><= 2000 characters</p> <p>The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://.</p>
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsHotelAttributes.prototype.additionalImageLink;

