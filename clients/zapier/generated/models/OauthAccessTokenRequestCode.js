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
                key: `${keyPrefix}code`,
                label: `[${labelPrefix}code]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}redirect_uri`,
                label: `[${labelPrefix}redirect_uri]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'grant_type': bundle.inputData?.[`${keyPrefix}grant_type`],
            'code': bundle.inputData?.[`${keyPrefix}code`],
            'redirect_uri': bundle.inputData?.[`${keyPrefix}redirect_uri`],
        }
    },
}
