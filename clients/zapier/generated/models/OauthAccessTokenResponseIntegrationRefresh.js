const utils = require('../utils/utils');
const OauthAccessTokenResponse = require('../models/OauthAccessTokenResponse');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}response_type`,
                label: `[${labelPrefix}response_type]`,
                type: 'string',
                choices: [
                    'authorization_code',
                    'refresh_token',
                ],
            },
            {
                key: `${keyPrefix}access_token`,
                label: `[${labelPrefix}access_token]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}token_type`,
                label: `[${labelPrefix}token_type]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}expires_in`,
                label: `[${labelPrefix}expires_in]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}scope`,
                label: `[${labelPrefix}scope]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}refresh_token`,
                label: `[${labelPrefix}refresh_token]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}refresh_token_expires_in`,
                label: `[${labelPrefix}refresh_token_expires_in]`,
                required: true,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'response_type': bundle.inputData?.[`${keyPrefix}response_type`],
            'access_token': bundle.inputData?.[`${keyPrefix}access_token`],
            'token_type': bundle.inputData?.[`${keyPrefix}token_type`],
            'expires_in': bundle.inputData?.[`${keyPrefix}expires_in`],
            'scope': bundle.inputData?.[`${keyPrefix}scope`],
            'refresh_token': bundle.inputData?.[`${keyPrefix}refresh_token`],
            'refresh_token_expires_in': bundle.inputData?.[`${keyPrefix}refresh_token_expires_in`],
        }
    },
}
