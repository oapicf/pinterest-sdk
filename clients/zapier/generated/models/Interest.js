const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}canonical_url`,
                label: `[${labelPrefix}canonical_url]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}id`,
                label: `[${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}key`,
                label: `[${labelPrefix}key]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `[${labelPrefix}name]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'canonical_url': bundle.inputData?.[`${keyPrefix}canonical_url`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'key': bundle.inputData?.[`${keyPrefix}key`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
        }
    },
}
