const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}150x150`,
                label: `[${labelPrefix}150x150]`,
                dict: true,
            },
            {
                key: `${keyPrefix}400x300`,
                label: `[${labelPrefix}400x300]`,
                dict: true,
            },
            {
                key: `${keyPrefix}600x`,
                label: `[${labelPrefix}600x]`,
                dict: true,
            },
            {
                key: `${keyPrefix}1200x`,
                label: `[${labelPrefix}1200x]`,
                dict: true,
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            '150x150': bundle.inputData?.[`${keyPrefix}150x150`],
            '400x300': bundle.inputData?.[`${keyPrefix}400x300`],
            '600x': bundle.inputData?.[`${keyPrefix}600x`],
            '1200x': bundle.inputData?.[`${keyPrefix}1200x`],
        }
    },
}
