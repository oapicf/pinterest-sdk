goog.provide('API.Client.IntegrationLogClientRequest');

/**
 * HTTP request details included in the log sent by the client.
 * @record
 */
API.Client.IntegrationLogClientRequest = function() {}

/**
 * HTTP request host from host header.
 * @type {!string}
 * @export
 */
API.Client.IntegrationLogClientRequest.prototype.host;

/**
 * @type {!API.Client.HttpMethod}
 * @export
 */
API.Client.IntegrationLogClientRequest.prototype.method;

/**
 * HTTP request path.
 * @type {!string}
 * @export
 */
API.Client.IntegrationLogClientRequest.prototype.path;

/**
 * HTTP request headers as key-value pairs.
 * @type {!Object<!string, string>}
 * @export
 */
API.Client.IntegrationLogClientRequest.prototype.requestHeaders;

/**
 * HTTP response headers as key-value pairs.
 * @type {!Object<!string, string>}
 * @export
 */
API.Client.IntegrationLogClientRequest.prototype.responseHeaders;

/**
 * @type {!number}
 * @export
 */
API.Client.IntegrationLogClientRequest.prototype.responseStatusCode;

