const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}lead_form_id`,
                label: `Lead form ID. - [${labelPrefix}lead_form_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}webhook_url`,
                label: `Standard HTTPS webhook URL. - [${labelPrefix}webhook_url]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}id`,
                label: `Subscription ID. - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}user_account_id`,
                label: `User account used to subscribe lead data. - [${labelPrefix}user_account_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}ad_account_id`,
                label: `The Ad Account ID that this lead form belongs to. - [${labelPrefix}ad_account_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}api_version`,
                label: `API version. - [${labelPrefix}api_version]`,
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
                label: `Lead form creation time. Unix timestamp in milliseconds. - [${labelPrefix}created_time]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'lead_form_id': bundle.inputData?.[`${keyPrefix}lead_form_id`],
            'webhook_url': bundle.inputData?.[`${keyPrefix}webhook_url`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'user_account_id': bundle.inputData?.[`${keyPrefix}user_account_id`],
            'ad_account_id': bundle.inputData?.[`${keyPrefix}ad_account_id`],
            'api_version': bundle.inputData?.[`${keyPrefix}api_version`],
            'cryptographic_key': bundle.inputData?.[`${keyPrefix}cryptographic_key`],
            'cryptographic_algorithm': bundle.inputData?.[`${keyPrefix}cryptographic_algorithm`],
            'created_time': bundle.inputData?.[`${keyPrefix}created_time`],
        }
    },
}
