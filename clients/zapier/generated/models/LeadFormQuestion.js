const utils = require('../utils/utils');
const LeadFormQuestionFieldType = require('../models/LeadFormQuestionFieldType');
const LeadFormQuestionType = require('../models/LeadFormQuestionType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}custom_question_field_type`,
                ...LeadFormQuestionFieldType.fields(`${keyPrefix}custom_question_field_type`, isInput),
            },
            {
                key: `${keyPrefix}custom_question_label`,
                label: `Question label for a custom question. - [${labelPrefix}custom_question_label]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}custom_question_options`,
                label: `Question options for a custom question. - [${labelPrefix}custom_question_options]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}question_type`,
                ...LeadFormQuestionType.fields(`${keyPrefix}question_type`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'custom_question_field_type': bundle.inputData?.[`${keyPrefix}custom_question_field_type`],
            'custom_question_label': bundle.inputData?.[`${keyPrefix}custom_question_label`],
            'custom_question_options': bundle.inputData?.[`${keyPrefix}custom_question_options`],
            'question_type': bundle.inputData?.[`${keyPrefix}question_type`],
        }
    },
}
