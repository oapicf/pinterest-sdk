goog.provide('API.Client.brand_accounts_update_request');

/**
 * @record
 */
API.Client.BrandAccountsUpdateRequest = function() {}

/**
 * Brand Account name
 * @type {!string}
 * @export
 */
API.Client.BrandAccountsUpdateRequest.prototype.name;

/**
 * Brand Account username
 * @type {!string}
 * @export
 */
API.Client.BrandAccountsUpdateRequest.prototype.username;

/**
 * @type {!API.Client.Country}
 * @export
 */
API.Client.BrandAccountsUpdateRequest.prototype.country;

/**
 * Brand Account about information
 * @type {!string}
 * @export
 */
API.Client.BrandAccountsUpdateRequest.prototype.about;

/**
 * Brand Account website
 * @type {!string}
 * @export
 */
API.Client.BrandAccountsUpdateRequest.prototype.website;

/**
 * @type {!API.Client.Image_Base64}
 * @export
 */
API.Client.BrandAccountsUpdateRequest.prototype.profileImage;

