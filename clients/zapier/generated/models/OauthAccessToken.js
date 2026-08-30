const utils = require('../utils/utils');
const TokenGrantType = require('../models/TokenGrantType');

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
                key: `${keyPrefix}expires_in`,
                label: `[${labelPrefix}expires_in]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}refresh_token`,
                label: `[${labelPrefix}refresh_token]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}refresh_token_expires_at`,
                label: `[${labelPrefix}refresh_token_expires_at]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}refresh_token_expires_in`,
                label: `[${labelPrefix}refresh_token_expires_in]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}response_type`,
                ...TokenGrantType.fields(`${keyPrefix}response_type`, isInput),
            },
            {
                key: `${keyPrefix}scope`,
                label: `[${labelPrefix}scope]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}token_type`,
                label: `[${labelPrefix}token_type]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'access_token': bundle.inputData?.[`${keyPrefix}access_token`],
            'expires_in': bundle.inputData?.[`${keyPrefix}expires_in`],
            'refresh_token': bundle.inputData?.[`${keyPrefix}refresh_token`],
            'refresh_token_expires_at': bundle.inputData?.[`${keyPrefix}refresh_token_expires_at`],
            'refresh_token_expires_in': bundle.inputData?.[`${keyPrefix}refresh_token_expires_in`],
            'response_type': bundle.inputData?.[`${keyPrefix}response_type`],
            'scope': bundle.inputData?.[`${keyPrefix}scope`],
            'token_type': bundle.inputData?.[`${keyPrefix}token_type`],
        }
    },
}
