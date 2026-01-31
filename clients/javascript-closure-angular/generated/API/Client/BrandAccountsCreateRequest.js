goog.provide('API.Client.brand_accounts_create_request');

/**
 * @record
 */
API.Client.BrandAccountsCreateRequest = function() {}

/**
 * Brand Account name
 * @type {!string}
 * @export
 */
API.Client.BrandAccountsCreateRequest.prototype.name;

/**
 * Brand Account username
 * @type {!string}
 * @export
 */
API.Client.BrandAccountsCreateRequest.prototype.username;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.BrandAccountsCreateRequest.prototype.country;

/**
 * Brand Account about information
 * @type {!string}
 * @export
 */
API.Client.BrandAccountsCreateRequest.prototype.about;

/**
 * Brand Account website
 * @type {!string}
 * @export
 */
API.Client.BrandAccountsCreateRequest.prototype.website;

/**
 * @type {!API.Client.Image_Base64}
 * @export
 */
API.Client.BrandAccountsCreateRequest.prototype.profileImage;

