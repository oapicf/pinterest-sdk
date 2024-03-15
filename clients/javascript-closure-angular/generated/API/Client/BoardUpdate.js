goog.provide('API.Client.BoardUpdate');

/**
 * Board fields for updates
 * @record
 */
API.Client.BoardUpdate = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.BoardUpdate.prototype.name;

/**
 * @type {!string}
 * @export
 */
API.Client.BoardUpdate.prototype.description;

/**
 * @type {!string}
 * @export
 */
API.Client.BoardUpdate.prototype.privacy;

/** @enum {string} */
API.Client.BoardUpdate.PrivacyEnum = { 
  PUBLIC: 'PUBLIC',
  SECRET: 'SECRET',
}
