goog.provide('API.Client.ConversionTagCommon');

/**
 * @record
 */
API.Client.ConversionTagCommon = function() {}

/**
 * Tag code snippet.
 * @type {!string}
 * @export
 */
API.Client.ConversionTagCommon.prototype.codeSnippet;

/**
 * @type {!API.Client.ConversionTagConfigs}
 * @export
 */
API.Client.ConversionTagCommon.prototype.configs;

/**
 * The enhanced match status of the tag
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
 * Version number.
 * @type {!string}
 * @export
 */
API.Client.ConversionTagCommon.prototype.version;

