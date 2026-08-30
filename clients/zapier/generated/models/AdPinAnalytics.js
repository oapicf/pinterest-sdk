const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}DATE`,
                label: `Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`) - [${labelPrefix}DATE]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}PIN_ID`,
                label: `The ID of the pin that the metric belongs to. - [${labelPrefix}PIN_ID]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'DATE': bundle.inputData?.[`${keyPrefix}DATE`],
            'PIN_ID': bundle.inputData?.[`${keyPrefix}PIN_ID`],
        }
    },
}
