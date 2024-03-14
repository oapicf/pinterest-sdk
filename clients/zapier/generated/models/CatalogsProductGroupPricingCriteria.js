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
                key: `${keyPrefix}values`,
                label: `[${labelPrefix}values]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}negated`,
                label: `[${labelPrefix}negated]`,
                type: 'boolean',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'inclusion': bundle.inputData?.[`${keyPrefix}inclusion`],
            'values': bundle.inputData?.[`${keyPrefix}values`],
            'negated': bundle.inputData?.[`${keyPrefix}negated`],
        }
    },
}
