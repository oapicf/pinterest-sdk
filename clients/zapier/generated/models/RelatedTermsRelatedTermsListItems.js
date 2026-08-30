const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}related_terms`,
                label: `[${labelPrefix}related_terms]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}term`,
                label: `[${labelPrefix}term]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'related_terms': bundle.inputData?.[`${keyPrefix}related_terms`],
            'term': bundle.inputData?.[`${keyPrefix}term`],
        }
    },
}
