goog.provide('API.Client.AdCommon_quiz_pin_data');

/**
 * Before creating a quiz ad, you must create an organic Pin using POST/Create Pin for each result in the quiz. Quiz ads cannot be saved by a Pinner. Quiz ad results can be saved.
 * @record
 */
API.Client.AdCommonQuizPinData = function() {}

/**
 * @type {!Array<!API.Client.QuizPinQuestion>}
 * @export
 */
API.Client.AdCommonQuizPinData.prototype.questions;

/**
 * @type {!Array<!API.Client.QuizPinResult>}
 * @export
 */
API.Client.AdCommonQuizPinData.prototype.results;

