goog.provide('API.Client.ConversionTagCommon');

/**
 * @record
 */
API.Client.ConversionTagCommon = function() {}

/**
 * Ad account ID.
 * @type {!string}
 * @export
 */
API.Client.ConversionTagCommon.prototype.adAccountId;

/**
 * Tag code snippet.
 * @type {!string}
 * @export
 */
API.Client.ConversionTagCommon.prototype.codeSnippet;

/**
 * @type {!API.Client.EnhancedMatchStatusType}
 * @export
 */
API.Client.ConversionTagCommon.prototype.enhancedMatchStatus;

/**
 * Tag ID.
 * @type {!string}
 * @export
 */
API.Client.ConversionTagCommon.prototype.id;

/**
 * Time for the last event fired.
 * @type {!number}
 * @export
 */
API.Client.ConversionTagCommon.prototype.lastFiredTimeMs;

/**
 * Conversion tag name.
 * @type {!string}
 * @export
 */
API.Client.ConversionTagCommon.prototype.name;

/**
 * @type {!API.Client.EntityStatus}
 * @export
 */
API.Client.ConversionTagCommon.prototype.status;

/**
 * Version number.
 * @type {!string}
 * @export
 */
API.Client.ConversionTagCommon.prototype.version;

/**
 * @type {!API.Client.ConversionTagConfigs}
 * @export
 */
API.Client.ConversionTagCommon.prototype.configs;

