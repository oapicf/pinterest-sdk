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
                key: `${keyPrefix}PRODUCT_GROUP_ID`,
                label: `The ID of the product group that this metrics belongs to. - [${labelPrefix}PRODUCT_GROUP_ID]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'DATE': bundle.inputData?.[`${keyPrefix}DATE`],
            'PRODUCT_GROUP_ID': bundle.inputData?.[`${keyPrefix}PRODUCT_GROUP_ID`],
        }
    },
}
