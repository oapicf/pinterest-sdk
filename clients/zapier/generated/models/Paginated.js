const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}items`,
                label: `[${labelPrefix}items]`,
                required: true,
                list: true,
                type: 'object',
            },
            {
                key: `${keyPrefix}bookmark`,
                label: `[${labelPrefix}bookmark]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'items': bundle.inputData?.[`${keyPrefix}items`],
            'bookmark': bundle.inputData?.[`${keyPrefix}bookmark`],
        }
    },
}
