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

/**
 * @type {!API.Client.QuizPinResult}
 * @export
 */
API.Client.QuizPinData.prototype.tieBreakerCustomResult;

/**
 * Quiz ad tie breaker type, default is RANDOM
 * @type {!string}
 * @export
 */
API.Client.QuizPinData.prototype.tieBreakerType;

/** @enum {string} */
API.Client.QuizPinData.TieBreakerTypeEnum = { 
  RANDOM: 'RANDOM',
  CUSTOM: 'CUSTOM',
}
