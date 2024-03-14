const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `[${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `[${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}child_interests`,
                label: `[${labelPrefix}child_interests]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}level`,
                label: `[${labelPrefix}level]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'child_interests': bundle.inputData?.[`${keyPrefix}child_interests`],
            'level': bundle.inputData?.[`${keyPrefix}level`],
        }
    },
}
