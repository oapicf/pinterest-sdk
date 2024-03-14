const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}avg_cpc_in_micro_currency`,
                label: `Average cost per click - [${labelPrefix}avg_cpc_in_micro_currency]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}keyword_query_volume`,
                label: `Keyword's search frequency. This value is based on keyword frequency in pepsi client response - [${labelPrefix}keyword_query_volume]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'avg_cpc_in_micro_currency': bundle.inputData?.[`${keyPrefix}avg_cpc_in_micro_currency`],
            'keyword_query_volume': bundle.inputData?.[`${keyPrefix}keyword_query_volume`],
        }
    },
}
