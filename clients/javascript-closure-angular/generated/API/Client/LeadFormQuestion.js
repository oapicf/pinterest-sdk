goog.provide('API.Client.LeadFormQuestion');

/**
 * @record
 */
API.Client.LeadFormQuestion = function() {}

/**
 * @type {!API.Client.LeadFormQuestionType}
 * @export
 */
API.Client.LeadFormQuestion.prototype.questionType;

/**
 * @type {!API.Client.LeadFormQuestionFieldType}
 * @export
 */
API.Client.LeadFormQuestion.prototype.customQuestionFieldType;

/**
 * Question label for a custom question.
 * @type {!string}
 * @export
 */
API.Client.LeadFormQuestion.prototype.customQuestionLabel;

/**
 * Question options for a custom question.
 * @type {!Array<!string>}
 * @export
 */
API.Client.LeadFormQuestion.prototype.customQuestionOptions;

