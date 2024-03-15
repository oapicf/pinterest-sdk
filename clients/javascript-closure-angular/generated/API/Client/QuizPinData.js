goog.provide('API.Client.QuizPinData');

/**
 * This field includes all quiz data including questions, options, and results.
 * @record
 */
API.Client.QuizPinData = function() {}

/**
 * @type {!Array<!API.Client.QuizPinQuestion>}
 * @export
 */
API.Client.QuizPinData.prototype.questions;

/**
 * @type {!Array<!API.Client.QuizPinResult>}
 * @export
 */
API.Client.QuizPinData.prototype.results;

