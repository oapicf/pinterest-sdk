const utils = require('../utils/utils');
const QuizPinOption = require('../models/QuizPinOption');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}question_id`,
                label: `[${labelPrefix}question_id]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}question_text`,
                label: `[${labelPrefix}question_text]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}options`,
                label: `[${labelPrefix}options]`,
                children: QuizPinOption.fields(`${keyPrefix}options${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'question_id': bundle.inputData?.[`${keyPrefix}question_id`],
            'question_text': bundle.inputData?.[`${keyPrefix}question_text`],
            'options': utils.childMapping(bundle.inputData?.[`${keyPrefix}options`], `${keyPrefix}options`, QuizPinOption),
        }
    },
}
