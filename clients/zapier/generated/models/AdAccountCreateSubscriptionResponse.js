const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Subscription ID. - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}cryptographic_key`,
                label: `Base64 encoded key for client to decrypt lead data. - [${labelPrefix}cryptographic_key]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}cryptographic_algorithm`,
                label: `Lead data encryption algorithm. - [${labelPrefix}cryptographic_algorithm]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}created_time`,
                label: `Subscription creation time. Unix timestamp in milliseconds. - [${labelPrefix}created_time]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'cryptographic_key': bundle.inputData?.[`${keyPrefix}cryptographic_key`],
            'cryptographic_algorithm': bundle.inputData?.[`${keyPrefix}cryptographic_algorithm`],
            'created_time': bundle.inputData?.[`${keyPrefix}created_time`],
        }
    },
}
