const utils = require('../utils/utils');
const PartnerMetadata = require('../models/PartnerMetadata');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
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
                key: `${keyPrefix}created_time`,
                label: `Subscription creation time. Unix timestamp in milliseconds. - [${labelPrefix}created_time]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}cryptographic_algorithm`,
                label: `Lead data encryption algorithm. - [${labelPrefix}cryptographic_algorithm]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}cryptographic_key`,
                label: `Base64 encoded key for client to decrypt lead data. - [${labelPrefix}cryptographic_key]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}id`,
                label: `Subscription ID. - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}lead_form_id`,
                label: `Lead form ID. - [${labelPrefix}lead_form_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}user_account_id`,
                label: `User account used to subscribe lead data. - [${labelPrefix}user_account_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}webhook_url`,
                label: `Standard HTTPS webhook URL. - [${labelPrefix}webhook_url]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}partner_access_token`,
                label: `Partner access token. Only for clients that requires authentication. We recommend to avoid this param. - [${labelPrefix}partner_access_token]`,
                type: 'string',
            },
            ...PartnerMetadata.fields(`${keyPrefix}partner_metadata`, isInput),
            {
                key: `${keyPrefix}partner_refresh_token`,
                label: `Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. - [${labelPrefix}partner_refresh_token]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ad_account_id': bundle.inputData?.[`${keyPrefix}ad_account_id`],
            'api_version': bundle.inputData?.[`${keyPrefix}api_version`],
            'created_time': bundle.inputData?.[`${keyPrefix}created_time`],
            'cryptographic_algorithm': bundle.inputData?.[`${keyPrefix}cryptographic_algorithm`],
            'cryptographic_key': bundle.inputData?.[`${keyPrefix}cryptographic_key`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'lead_form_id': bundle.inputData?.[`${keyPrefix}lead_form_id`],
            'user_account_id': bundle.inputData?.[`${keyPrefix}user_account_id`],
            'webhook_url': bundle.inputData?.[`${keyPrefix}webhook_url`],
            'partner_access_token': bundle.inputData?.[`${keyPrefix}partner_access_token`],
            'partner_metadata': utils.removeIfEmpty(PartnerMetadata.mapping(bundle, `${keyPrefix}partner_metadata`)),
            'partner_refresh_token': bundle.inputData?.[`${keyPrefix}partner_refresh_token`],
        }
    },
}
