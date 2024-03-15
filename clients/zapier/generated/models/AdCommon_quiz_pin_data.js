const utils = require('../utils/utils');
const QuizPinQuestion = require('../models/QuizPinQuestion');
const QuizPinResult = require('../models/QuizPinResult');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}questions`,
                label: `[${labelPrefix}questions]`,
                children: QuizPinQuestion.fields(`${keyPrefix}questions${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}results`,
                label: `[${labelPrefix}results]`,
                children: QuizPinResult.fields(`${keyPrefix}results${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'questions': utils.childMapping(bundle.inputData?.[`${keyPrefix}questions`], `${keyPrefix}questions`, QuizPinQuestion),
            'results': utils.childMapping(bundle.inputData?.[`${keyPrefix}results`], `${keyPrefix}results`, QuizPinResult),
        }
    },
}
