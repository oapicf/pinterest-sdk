goog.provide('API.Client.ConversionTagResponse');

/**
 * @record
 */
API.Client.ConversionTagResponse = function() {}

/**
 * Tag code snippet.
 * @type {!string}
 * @export
 */
API.Client.ConversionTagResponse.prototype.codeSnippet;

/**
 * @type {!API.Client.ConversionTagConfigs}
 * @export
 */
API.Client.ConversionTagResponse.prototype.configs;

/**
 * The enhanced match status of the tag
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
 * Version number.
 * @type {!string}
 * @export
 */
API.Client.ConversionTagResponse.prototype.version;

/**
 * Ad account ID.
 * @type {!string}
 * @export
 */
API.Client.ConversionTagResponse.prototype.adAccountId;

/**
 * @type {!API.Client.EntityStatus}
 * @export
 */
API.Client.ConversionTagResponse.prototype.status;

