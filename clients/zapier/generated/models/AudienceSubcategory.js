const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}key`,
                label: `Interest unique key (same as ID). - [${labelPrefix}key]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `Subinterest name. - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}ratio`,
                label: `Subinterest's percent of category's total audience. - [${labelPrefix}ratio]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}index`,
                label: `Subinterest affinity index. - [${labelPrefix}index]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}id`,
                label: `Subinterest ID. - [${labelPrefix}id]`,
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
