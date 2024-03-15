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
            {
                key: `${keyPrefix}refresh_on`,
                label: `Setting this field to <code>true</code> will add a new refresh token to your 200 response, as well as the refresh_token_expires_in and refresh_token_expires_at fields. To see the structure of this payload, set the 200 response_type to \"everlasting_refresh\". - [${labelPrefix}refresh_on]`,
                type: 'boolean',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'grant_type': bundle.inputData?.[`${keyPrefix}grant_type`],
            'refresh_token': bundle.inputData?.[`${keyPrefix}refresh_token`],
            'scope': bundle.inputData?.[`${keyPrefix}scope`],
            'refresh_on': bundle.inputData?.[`${keyPrefix}refresh_on`],
        }
    },
}
