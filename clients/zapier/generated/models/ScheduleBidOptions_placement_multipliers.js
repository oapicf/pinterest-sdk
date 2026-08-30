const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}browse`,
                label: `Browse (home-feed and related surfaces) - [${labelPrefix}browse]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}related_pins`,
                label: `Related-Pins placement - [${labelPrefix}related_pins]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}search`,
                label: `Search placement - [${labelPrefix}search]`,
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
