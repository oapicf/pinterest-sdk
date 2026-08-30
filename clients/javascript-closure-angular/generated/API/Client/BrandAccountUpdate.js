goog.provide('API.Client.BrandAccountUpdate');

/**
 * Resource create or update operation model.
 * @record
 */
API.Client.BrandAccountUpdate = function() {}

/**
 * Brand Account about information
 * @type {!string}
 * @export
 */
API.Client.BrandAccountUpdate.prototype.about;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.BrandAccountUpdate.prototype.country;

/**
 * Brand Account name
 * @type {!string}
 * @export
 */
API.Client.BrandAccountUpdate.prototype.name;

/**
 * @type {!API.Client.BrandAccountProfileImageUpdate}
 * @export
 */
API.Client.BrandAccountUpdate.prototype.profileImage;

/**
 * Brand Account username
 * @type {!string}
 * @export
 */
API.Client.BrandAccountUpdate.prototype.username;

/**
 * Brand Account website
 * @type {!string}
 * @export
 */
API.Client.BrandAccountUpdate.prototype.website;

