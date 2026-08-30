const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}audience_id`,
                label: `[${labelPrefix}audience_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}multiplier`,
                label: `[${labelPrefix}multiplier]`,
                required: true,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'audience_id': bundle.inputData?.[`${keyPrefix}audience_id`],
            'multiplier': bundle.inputData?.[`${keyPrefix}multiplier`],
        }
    },
}
