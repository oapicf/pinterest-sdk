goog.provide('API.Client.IntegrationLogClientError');

/**
 * System error details included in the log sent by the client.
 * @record
 */
API.Client.IntegrationLogClientError = function() {}

/**
 * Original cause of the error.
 * @type {!string}
 * @export
 */
API.Client.IntegrationLogClientError.prototype.cause;

/**
 * Column number in the line of the file that raised the error.
 * @type {!number}
 * @export
 */
API.Client.IntegrationLogClientError.prototype.columnNumber;

/**
 * Filename where the error happened.
 * @type {!string}
 * @export
 */
API.Client.IntegrationLogClientError.prototype.fileName;

/**
 * Line number where the error happened.
 * @type {!number}
 * @export
 */
API.Client.IntegrationLogClientError.prototype.lineNumber;

/**
 * Human-readable description of the error.
 * @type {!string}
 * @export
 */
API.Client.IntegrationLogClientError.prototype.message;

/**
 * More detail about the message.
 * @type {!string}
 * @export
 */
API.Client.IntegrationLogClientError.prototype.messageDetail;

/**
 * Filename where the error happened.
 * @type {!string}
 * @export
 */
API.Client.IntegrationLogClientError.prototype.name;

/**
 * Integer that specifies the error code.
 * @type {!number}
 * @export
 */
API.Client.IntegrationLogClientError.prototype.number;

/**
 * Stack trace of where the error happened.
 * @type {!string}
 * @export
 */
API.Client.IntegrationLogClientError.prototype.stackTrace;

