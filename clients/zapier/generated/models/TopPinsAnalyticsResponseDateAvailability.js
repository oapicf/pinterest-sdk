const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}is_realtime`,
                label: `[${labelPrefix}is_realtime]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}latest_available_timestamp`,
                label: `[${labelPrefix}latest_available_timestamp]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'is_realtime': bundle.inputData?.[`${keyPrefix}is_realtime`],
            'latest_available_timestamp': bundle.inputData?.[`${keyPrefix}latest_available_timestamp`],
        }
    },
}
