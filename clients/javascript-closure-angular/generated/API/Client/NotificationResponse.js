goog.provide('API.Client.NotificationResponse');

/**
 * @record
 */
API.Client.NotificationResponse = function() {}

/**
 * Returns true if the notification accepted.
 * @type {!boolean}
 * @export
 */
API.Client.NotificationResponse.prototype.success;

/**
 * Received time. Unix timestamp in seconds.
 * @type {!number}
 * @export
 */
API.Client.NotificationResponse.prototype.receivedAt;

/**
 * error message when success is false
 * @type {!string}
 * @export
 */
API.Client.NotificationResponse.prototype.errorMsg;

