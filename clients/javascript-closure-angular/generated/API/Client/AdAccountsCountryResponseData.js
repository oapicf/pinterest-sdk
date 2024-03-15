goog.provide('API.Client.AdAccountsCountryResponseData');

/**
 * @record
 */
API.Client.AdAccountsCountryResponseData = function() {}

/**
 * @type {!API.Client.AdCountry}
 * @export
 */
API.Client.AdAccountsCountryResponseData.prototype.code;

/**
 * Country currency.
 * @type {!string}
 * @export
 */
API.Client.AdAccountsCountryResponseData.prototype.currency;

/**
 * Country index
 * @type {!number}
 * @export
 */
API.Client.AdAccountsCountryResponseData.prototype.index;

/**
 * Country name
 * @type {!string}
 * @export
 */
API.Client.AdAccountsCountryResponseData.prototype.name;

