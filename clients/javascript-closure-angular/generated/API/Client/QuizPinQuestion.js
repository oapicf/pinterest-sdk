goog.provide('API.Client.QuizPinQuestion');

/**
 * A specific quiz inquiry.
 * @record
 */
API.Client.QuizPinQuestion = function() {}

/**
 * @type {!number}
 * @export
 */
API.Client.QuizPinQuestion.prototype.questionId;

/**
 * @type {!string}
 * @export
 */
API.Client.QuizPinQuestion.prototype.questionText;

/**
 * @type {!Array<!API.Client.QuizPinOption>}
 * @export
 */
API.Client.QuizPinQuestion.prototype.options;

