const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}connected_merchant_id`,
                label: `[${labelPrefix}connected_merchant_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}connected_advertiser_id`,
                label: `[${labelPrefix}connected_advertiser_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}connected_lba_id`,
                label: `[${labelPrefix}connected_lba_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}connected_tag_id`,
                label: `[${labelPrefix}connected_tag_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}partner_access_token`,
                label: `[${labelPrefix}partner_access_token]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}partner_refresh_token`,
                label: `[${labelPrefix}partner_refresh_token]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}partner_primary_email`,
                label: `[${labelPrefix}partner_primary_email]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}partner_access_token_expiry`,
                label: `[${labelPrefix}partner_access_token_expiry]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}partner_refresh_token_expiry`,
                label: `[${labelPrefix}partner_refresh_token_expiry]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}scopes`,
                label: `[${labelPrefix}scopes]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}additional_id_1`,
                label: `[${labelPrefix}additional_id_1]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}partner_metadata`,
                label: `[${labelPrefix}partner_metadata]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'connected_merchant_id': bundle.inputData?.[`${keyPrefix}connected_merchant_id`],
            'connected_advertiser_id': bundle.inputData?.[`${keyPrefix}connected_advertiser_id`],
            'connected_lba_id': bundle.inputData?.[`${keyPrefix}connected_lba_id`],
            'connected_tag_id': bundle.inputData?.[`${keyPrefix}connected_tag_id`],
            'partner_access_token': bundle.inputData?.[`${keyPrefix}partner_access_token`],
            'partner_refresh_token': bundle.inputData?.[`${keyPrefix}partner_refresh_token`],
            'partner_primary_email': bundle.inputData?.[`${keyPrefix}partner_primary_email`],
            'partner_access_token_expiry': bundle.inputData?.[`${keyPrefix}partner_access_token_expiry`],
            'partner_refresh_token_expiry': bundle.inputData?.[`${keyPrefix}partner_refresh_token_expiry`],
            'scopes': bundle.inputData?.[`${keyPrefix}scopes`],
            'additional_id_1': bundle.inputData?.[`${keyPrefix}additional_id_1`],
            'partner_metadata': bundle.inputData?.[`${keyPrefix}partner_metadata`],
        }
    },
}
