const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}scope`,
                label: `[${labelPrefix}scope]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}grant_type`,
                label: `[${labelPrefix}grant_type]`,
                required: true,
                type: 'string',
                choices: [
                    'authorization_code',
                    'refresh_token',
                    'client_credentials',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'scope': bundle.inputData?.[`${keyPrefix}scope`],
            'grant_type': bundle.inputData?.[`${keyPrefix}grant_type`],
        }
    },
}
