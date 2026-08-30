const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}email`,
                label: `Email address (plain or hashed with SHA1, SHA256, or MD5). - [${labelPrefix}email]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}external_id`,
                label: `External ID identifier (not hashed). - [${labelPrefix}external_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}hashed_phone_number`,
                label: `Hashed phone number (hashed with SHA1, SHA256, or MD5). - [${labelPrefix}hashed_phone_number]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}hashed_pinner_id`,
                label: `Hashed pinner ID (hashed with SHA1, SHA256, or MD5). - [${labelPrefix}hashed_pinner_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}ip_address`,
                label: `IP address (not hashed). - [${labelPrefix}ip_address]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}liveramp_envelope`,
                label: `LiveRamp envelope identifier (Base64-encoded, not hashed). - [${labelPrefix}liveramp_envelope]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}maid`,
                label: `Mobile advertising ID (plain or hashed with SHA1, SHA256, or MD5). - [${labelPrefix}maid]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}user_agent`,
                label: `User agent string (not hashed). - [${labelPrefix}user_agent]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'email': bundle.inputData?.[`${keyPrefix}email`],
            'external_id': bundle.inputData?.[`${keyPrefix}external_id`],
            'hashed_phone_number': bundle.inputData?.[`${keyPrefix}hashed_phone_number`],
            'hashed_pinner_id': bundle.inputData?.[`${keyPrefix}hashed_pinner_id`],
            'ip_address': bundle.inputData?.[`${keyPrefix}ip_address`],
            'liveramp_envelope': bundle.inputData?.[`${keyPrefix}liveramp_envelope`],
            'maid': bundle.inputData?.[`${keyPrefix}maid`],
            'user_agent': bundle.inputData?.[`${keyPrefix}user_agent`],
        }
    },
}
