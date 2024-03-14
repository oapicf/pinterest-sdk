const utils = require('../utils/utils');
const OauthAccessTokenRequest = require('../models/OauthAccessTokenRequest');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}grant_type`,
                label: `[${labelPrefix}grant_type]`,
                required: true,
                type: 'string',
                choices: [
                    'authorization_code',
                    'refresh_token',
                ],
            },
            {
                key: `${keyPrefix}refresh_token`,
                label: `[${labelPrefix}refresh_token]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}scope`,
                label: `[${labelPrefix}scope]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'grant_type': bundle.inputData?.[`${keyPrefix}grant_type`],
            'refresh_token': bundle.inputData?.[`${keyPrefix}refresh_token`],
            'scope': bundle.inputData?.[`${keyPrefix}scope`],
        }
    },
}
