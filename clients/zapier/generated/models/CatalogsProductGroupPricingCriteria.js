const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}inclusion`,
                label: `[${labelPrefix}inclusion]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}negated`,
                label: `[${labelPrefix}negated]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}values`,
                label: `[${labelPrefix}values]`,
                required: true,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'inclusion': bundle.inputData?.[`${keyPrefix}inclusion`],
            'negated': bundle.inputData?.[`${keyPrefix}negated`],
            'values': bundle.inputData?.[`${keyPrefix}values`],
        }
    },
}
