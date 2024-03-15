const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                label: `The date range type - [${labelPrefix}type]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}start_days_in_past`,
                label: `The start date of the date range - [${labelPrefix}start_days_in_past]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}end_days_in_past`,
                label: `The end date of the date range - [${labelPrefix}end_days_in_past]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'start_days_in_past': bundle.inputData?.[`${keyPrefix}start_days_in_past`],
            'end_days_in_past': bundle.inputData?.[`${keyPrefix}end_days_in_past`],
        }
    },
}
