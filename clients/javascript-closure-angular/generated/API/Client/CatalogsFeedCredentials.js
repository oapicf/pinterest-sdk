goog.provide('API.Client.CatalogsFeedCredentials');

/**
 * This field is **OPTIONAL**. Use this if your feed file requires username and password.
 * @record
 */
API.Client.CatalogsFeedCredentials = function() {}

/**
 * The required password for downloading a feed.
 * @type {!string}
 * @export
 */
API.Client.CatalogsFeedCredentials.prototype.password;

/**
 * The required username for downloading a feed.
 * @type {!string}
 * @export
 */
API.Client.CatalogsFeedCredentials.prototype.username;

