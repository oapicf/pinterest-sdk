goog.provide('API.Client.ConversionTagResponse');

/**
 * @record
 */
API.Client.ConversionTagResponse = function() {}

/**
 * Ad account ID.
 * @type {!string}
 * @export
 */
API.Client.ConversionTagResponse.prototype.adAccountId;

/**
 * Tag code snippet.
 * @type {!string}
 * @export
 */
API.Client.ConversionTagResponse.prototype.codeSnippet;

/**
 * @type {!API.Client.EnhancedMatchStatusType}
 * @export
 */
API.Client.ConversionTagResponse.prototype.enhancedMatchStatus;

/**
 * Tag ID.
 * @type {!string}
 * @export
 */
API.Client.ConversionTagResponse.prototype.id;

/**
 * Time for the last event fired.
 * @type {!number}
 * @export
 */
API.Client.ConversionTagResponse.prototype.lastFiredTimeMs;

/**
 * Conversion tag name.
 * @type {!string}
 * @export
 */
API.Client.ConversionTagResponse.prototype.name;

/**
 * @type {!API.Client.EntityStatus}
 * @export
 */
API.Client.ConversionTagResponse.prototype.status;

/**
 * Version number.
 * @type {!string}
 * @export
 */
API.Client.ConversionTagResponse.prototype.version;

/**
 * @type {!API.Client.ConversionTagConfigs}
 * @export
 */
API.Client.ConversionTagResponse.prototype.configs;

