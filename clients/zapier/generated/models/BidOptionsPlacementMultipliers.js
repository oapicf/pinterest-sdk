const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}browse`,
                label: `[${labelPrefix}browse]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}related_pins`,
                label: `[${labelPrefix}related_pins]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}search`,
                label: `[${labelPrefix}search]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'browse': bundle.inputData?.[`${keyPrefix}browse`],
            'related_pins': bundle.inputData?.[`${keyPrefix}related_pins`],
            'search': bundle.inputData?.[`${keyPrefix}search`],
        }
    },
}
