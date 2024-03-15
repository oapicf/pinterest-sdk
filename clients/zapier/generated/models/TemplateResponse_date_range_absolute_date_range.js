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
                key: `${keyPrefix}start_date`,
                label: `The start date of the date range - [${labelPrefix}start_date]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}end_date`,
                label: `The end date of the date range - [${labelPrefix}end_date]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'start_date': bundle.inputData?.[`${keyPrefix}start_date`],
            'end_date': bundle.inputData?.[`${keyPrefix}end_date`],
        }
    },
}
