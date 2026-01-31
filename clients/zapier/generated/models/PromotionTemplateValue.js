const utils = require('../utils/utils');
const Currency = require('../models/Currency');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}amount`,
                label: `Numeric value. - [${labelPrefix}amount]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}currency_code`,
                ...Currency.fields(`${keyPrefix}currency_code`, isInput),
            },
            {
                key: `${keyPrefix}custom_text`,
                label: `Custom text. - [${labelPrefix}custom_text]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}percent`,
                label: `Percent value. - [${labelPrefix}percent]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'amount': bundle.inputData?.[`${keyPrefix}amount`],
            'currency_code': bundle.inputData?.[`${keyPrefix}currency_code`],
            'custom_text': bundle.inputData?.[`${keyPrefix}custom_text`],
            'percent': bundle.inputData?.[`${keyPrefix}percent`],
        }
    },
}
