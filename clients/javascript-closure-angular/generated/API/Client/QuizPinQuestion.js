goog.provide('API.Client.QuizPinQuestion');

/**
 * A specific quiz inquiry.
 * @record
 */
API.Client.QuizPinQuestion = function() {}

/**
 * @type {!Array<!API.Client.QuizPinOption>}
 * @export
 */
API.Client.QuizPinQuestion.prototype.options;

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

