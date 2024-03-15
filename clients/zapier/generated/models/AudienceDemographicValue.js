const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}key`,
                label: `Unique key for demographic item - [${labelPrefix}key]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `Display name for demographic - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}ratio`,
                label: `Value of demographic item as a percent of total audience - [${labelPrefix}ratio]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'key': bundle.inputData?.[`${keyPrefix}key`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'ratio': bundle.inputData?.[`${keyPrefix}ratio`],
        }
    },
}
