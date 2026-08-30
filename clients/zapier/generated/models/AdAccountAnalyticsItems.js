const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}AD_ACCOUNT_ID`,
                label: `[${labelPrefix}AD_ACCOUNT_ID]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}DATE`,
                label: `[${labelPrefix}DATE]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'AD_ACCOUNT_ID': bundle.inputData?.[`${keyPrefix}AD_ACCOUNT_ID`],
            'DATE': bundle.inputData?.[`${keyPrefix}DATE`],
        }
    },
}
