const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}term`,
                label: `[${labelPrefix}term]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}related_terms`,
                label: `[${labelPrefix}related_terms]`,
                list: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'term': bundle.inputData?.[`${keyPrefix}term`],
            'related_terms': bundle.inputData?.[`${keyPrefix}related_terms`],
        }
    },
}
