const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
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
            {
                key: `${keyPrefix}ratio`,
                label: `[${labelPrefix}ratio]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}index`,
                label: `[${labelPrefix}index]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}id`,
                label: `[${labelPrefix}id]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'key': bundle.inputData?.[`${keyPrefix}key`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'ratio': bundle.inputData?.[`${keyPrefix}ratio`],
            'index': bundle.inputData?.[`${keyPrefix}index`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
        }
    },
}
