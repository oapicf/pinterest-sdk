const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}female`,
                label: `[${labelPrefix}female]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}male`,
                label: `[${labelPrefix}male]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'female': bundle.inputData?.[`${keyPrefix}female`],
            'male': bundle.inputData?.[`${keyPrefix}male`],
        }
    },
}
