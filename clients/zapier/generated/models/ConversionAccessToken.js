const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}access_token`,
                label: `[${labelPrefix}access_token]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}token_type`,
                label: `[${labelPrefix}token_type]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'access_token': bundle.inputData?.[`${keyPrefix}access_token`],
            'token_type': bundle.inputData?.[`${keyPrefix}token_type`],
        }
    },
}
