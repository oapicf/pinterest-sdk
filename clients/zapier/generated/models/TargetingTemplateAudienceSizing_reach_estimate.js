const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}estimate`,
                label: `[${labelPrefix}estimate]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}lower_bound`,
                label: `[${labelPrefix}lower_bound]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}upper_bound`,
                label: `[${labelPrefix}upper_bound]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'estimate': bundle.inputData?.[`${keyPrefix}estimate`],
            'lower_bound': bundle.inputData?.[`${keyPrefix}lower_bound`],
            'upper_bound': bundle.inputData?.[`${keyPrefix}upper_bound`],
        }
    },
}
