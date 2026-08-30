goog.provide('API.Client.AppsflyerAudience');

/**
 * Request model for creating an AppsFlyer audience
 * @record
 */
API.Client.AppsflyerAudience = function() {}

/**
 * The ID of the audience container
 * @type {!string}
 * @export
 */
API.Client.AppsflyerAudience.prototype.containerId;

/**
 * The name of the audience
 * @type {!string}
 * @export
 */
API.Client.AppsflyerAudience.prototype.name;

/**
 * The platform of the audience
 * @type {!API.Client.AppsflyerPlatform}
 * @export
 */
API.Client.AppsflyerAudience.prototype.platform;

