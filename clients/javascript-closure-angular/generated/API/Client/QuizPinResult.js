goog.provide('API.Client.QuizPinResult');

/**
 * The result, and link out, based on the user’s choice.
 * @record
 */
API.Client.QuizPinResult = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.QuizPinResult.prototype.androidDeepLink;

/**
 * @type {!string}
 * @export
 */
API.Client.QuizPinResult.prototype.destinationUrl;

/**
 * @type {!string}
 * @export
 */
API.Client.QuizPinResult.prototype.iosDeepLink;

/**
 * @type {!string}
 * @export
 */
API.Client.QuizPinResult.prototype.organicPinId;

/**
 * @type {!number}
 * @export
 */
API.Client.QuizPinResult.prototype.resultId;

