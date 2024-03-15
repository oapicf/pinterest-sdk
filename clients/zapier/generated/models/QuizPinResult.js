const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}organic_pin_id`,
                label: `[${labelPrefix}organic_pin_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}android_deep_link`,
                label: `[${labelPrefix}android_deep_link]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}ios_deep_link`,
                label: `[${labelPrefix}ios_deep_link]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}destination_url`,
                label: `[${labelPrefix}destination_url]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}result_id`,
                label: `[${labelPrefix}result_id]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'organic_pin_id': bundle.inputData?.[`${keyPrefix}organic_pin_id`],
            'android_deep_link': bundle.inputData?.[`${keyPrefix}android_deep_link`],
            'ios_deep_link': bundle.inputData?.[`${keyPrefix}ios_deep_link`],
            'destination_url': bundle.inputData?.[`${keyPrefix}destination_url`],
            'result_id': bundle.inputData?.[`${keyPrefix}result_id`],
        }
    },
}
