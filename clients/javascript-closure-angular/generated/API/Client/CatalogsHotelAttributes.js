goog.provide('API.Client.CatalogsHotelAttributes');

/**
 * @record
 */
API.Client.CatalogsHotelAttributes = function() {}

/**
 * @type {!API.Client.CatalogsHotelAddress}
 * @export
 */
API.Client.CatalogsHotelAttributes.prototype.address;

/**
 * Base price of the hotel room per night followed by the ISO currency code
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelAttributes.prototype.basePrice;

/**
 * The brand to which this hotel belongs to.
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelAttributes.prototype.brand;

/**
 * The type of property. The category can be any type of internal description desired.
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelAttributes.prototype.category;

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
 * Brief description of the hotel.
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelAttributes.prototype.description;

/**
 * @type {!API.Client.CatalogsHotelGuestRatings}
 * @export
 */
API.Client.CatalogsHotelAttributes.prototype.guestRatings;

/**
 * Latitude of the hotel.
 * @type {!number}
 * @export
 */
API.Client.CatalogsHotelAttributes.prototype.latitude;

/**
 * Link to the product page
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelAttributes.prototype.link;

/**
 * Longitude of the hotel.
 * @type {!number}
 * @export
 */
API.Client.CatalogsHotelAttributes.prototype.longitude;

/**
 * The hotel's name.
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelAttributes.prototype.name;

/**
 * A list of neighborhoods where the hotel is located
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsHotelAttributes.prototype.neighborhood;

/**
 * Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
 * @type {!string}
 * @export
 */
API.Client.CatalogsHotelAttributes.prototype.salePrice;

/**
 * <p><= 2000 characters</p> <p>The links to additional images for your hotel. Up to ten additional images can be used to show a hotel from different angles. Must begin with http:// or https://.</p>
 * @type {!Array<!string>}
 * @export
 */
API.Client.CatalogsHotelAttributes.prototype.additionalImageLink;

/**
 * @type {!API.Client.CatalogsHotelAttributes_allOf_main_image}
 * @export
 */
API.Client.CatalogsHotelAttributes.prototype.mainImage;

