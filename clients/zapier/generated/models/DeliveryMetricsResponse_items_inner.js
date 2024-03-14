const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}name`,
                label: `Metric's name. - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}category`,
                label: `Category name - [${labelPrefix}category]`,
                type: 'string',
                choices: [
                    'ADS',
                    'ORGANIC',
                ],
            },
            {
                key: `${keyPrefix}definition`,
                label: `How the metric is defined. - [${labelPrefix}definition]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}display_name`,
                label: `Display name, when available. If unavaible it will not be returned. - [${labelPrefix}display_name]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'category': bundle.inputData?.[`${keyPrefix}category`],
            'definition': bundle.inputData?.[`${keyPrefix}definition`],
            'display_name': bundle.inputData?.[`${keyPrefix}display_name`],
        }
    },
}
