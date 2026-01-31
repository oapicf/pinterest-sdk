const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}range`,
                label: `The dynamic range type - [${labelPrefix}range]`,
                type: 'string',
                choices: [
                    'YEAR_TO_DATE',
                    'QUARTER_TO_DATE',
                    'MONTH_TO_DATE',
                    'LAST_MONTH',
                    'LAST_QUARTER',
                ],
            },
            {
                key: `${keyPrefix}type`,
                label: `The date range type - [${labelPrefix}type]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'range': bundle.inputData?.[`${keyPrefix}range`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
        }
    },
}
