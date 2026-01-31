goog.provide('API.Client.IntegrationLog');

/**
 * Schema for log sent from an integration application.
 * @record
 */
API.Client.IntegrationLog = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.IntegrationLog.prototype.advertiserId;

/**
 * Version number of the integration application.
 * @type {!string}
 * @export
 */
API.Client.IntegrationLog.prototype.appVersionNumber;

/**
 * Timestamp in milliseconds of when the log was executed at the client.
 * @type {!number}
 * @export
 */
API.Client.IntegrationLog.prototype.clientTimestamp;

/**
 * @type {!API.Client.IntegrationLogClientError}
 * @export
 */
API.Client.IntegrationLog.prototype.error;

/**
 * Log event type
 * @type {!string}
 * @export
 */
API.Client.IntegrationLog.prototype.eventType;

/**
 * @type {!string}
 * @export
 */
API.Client.IntegrationLog.prototype.externalBusinessId;

/**
 * @type {!string}
 * @export
 */
API.Client.IntegrationLog.prototype.feedProfileId;

/**
 * Log level type
 * @type {!string}
 * @export
 */
API.Client.IntegrationLog.prototype.logLevel;

/**
 * @type {!string}
 * @export
 */
API.Client.IntegrationLog.prototype.merchantId;

/**
 * Explanation of the event that occured.
 * @type {!string}
 * @export
 */
API.Client.IntegrationLog.prototype.message;

/**
 * Version number of the platform the integration application is running on.
 * @type {!string}
 * @export
 */
API.Client.IntegrationLog.prototype.platformVersionNumber;

/**
 * @type {!API.Client.IntegrationLogClientRequest}
 * @export
 */
API.Client.IntegrationLog.prototype.request;

/**
 * @type {!string}
 * @export
 */
API.Client.IntegrationLog.prototype.tagId;

/** @enum {string} */
API.Client.IntegrationLog.EventTypeEnum = { 
  APP: 'APP',
  API: 'API',
}
/** @enum {string} */
API.Client.IntegrationLog.LogLevelEnum = { 
  INFO: 'INFO',
  WARN: 'WARN',
  ERROR: 'ERROR',
}
