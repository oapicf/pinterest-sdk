goog.provide('API.Client.BrandAccountCreate');

/**
 * Resource create operation model.
 * @record
 */
API.Client.BrandAccountCreate = function() {}

/**
 * Brand Account about information
 * @type {!string}
 * @export
 */
API.Client.BrandAccountCreate.prototype.about;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.BrandAccountCreate.prototype.country;

/**
 * Brand Account name
 * @type {!string}
 * @export
 */
API.Client.BrandAccountCreate.prototype.name;

/**
 * @type {!API.Client.BrandAccountProfileImage}
 * @export
 */
API.Client.BrandAccountCreate.prototype.profileImage;

/**
 * Brand Account username
 * @type {!string}
 * @export
 */
API.Client.BrandAccountCreate.prototype.username;

/**
 * Brand Account website
 * @type {!string}
 * @export
 */
API.Client.BrandAccountCreate.prototype.website;

