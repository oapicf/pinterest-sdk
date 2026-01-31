const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}female`,
                label: `Percentage of female users - [${labelPrefix}female]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}male`,
                label: `Percentage of male users - [${labelPrefix}male]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}unspecified`,
                label: `Percentage of users with unspecified gender - [${labelPrefix}unspecified]`,
                required: true,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'female': bundle.inputData?.[`${keyPrefix}female`],
            'male': bundle.inputData?.[`${keyPrefix}male`],
            'unspecified': bundle.inputData?.[`${keyPrefix}unspecified`],
        }
    },
}
