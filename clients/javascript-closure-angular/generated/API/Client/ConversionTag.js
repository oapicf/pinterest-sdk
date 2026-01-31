goog.provide('API.Client.ConversionTag');

/**
 * @record
 */
API.Client.ConversionTag = function() {}

/**
 * Tag code snippet.
 * @type {!string}
 * @export
 */
API.Client.ConversionTag.prototype.codeSnippet;

/**
 * @type {!API.Client.ConversionTagConfigs}
 * @export
 */
API.Client.ConversionTag.prototype.configs;

/**
 * The enhanced match status of the tag
 * @type {!API.Client.EnhancedMatchStatusType}
 * @export
 */
API.Client.ConversionTag.prototype.enhancedMatchStatus;

/**
 * Tag ID.
 * @type {!string}
 * @export
 */
API.Client.ConversionTag.prototype.id;

/**
 * Time for the last event fired.
 * @type {!number}
 * @export
 */
API.Client.ConversionTag.prototype.lastFiredTimeMs;

/**
 * Conversion tag name.
 * @type {!string}
 * @export
 */
API.Client.ConversionTag.prototype.name;

/**
 * Version number.
 * @type {!string}
 * @export
 */
API.Client.ConversionTag.prototype.version;

/**
 * Ad account ID.
 * @type {!string}
 * @export
 */
API.Client.ConversionTag.prototype.adAccountId;

/**
 * @type {!API.Client.EntityStatus}
 * @export
 */
API.Client.ConversionTag.prototype.status;

