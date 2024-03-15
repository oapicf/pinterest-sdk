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
                key: `${keyPrefix}range`,
                label: `The dynamic range type - [${labelPrefix}range]`,
                type: 'string',
                choices: [
                    'YEAR_TO_DATE',
                    'QUARTER_TO_DATE',
                    'MONTH_TO_DATE',
                    'LAST_MONTH',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'range': bundle.inputData?.[`${keyPrefix}range`],
        }
    },
}
