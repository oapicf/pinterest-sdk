const utils = require('../utils/utils');
const CampaignAdPreview = require('../models/CampaignAdPreview');
const Pinterest.Lib.Error = require('../models/Pinterest.Lib.Error');
const campaign_ad_preview_create_200_response_inner_data_oneOf = require('../models/campaign_ad_preview_create_200_response_inner_data_oneOf');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}ad_account_id`,
                label: `Advertiser ID for this preview. - [${labelPrefix}ad_account_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}ad_group_id`,
                label: `Ad group ID to create a preview record for. - [${labelPrefix}ad_group_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}client_id`,
                label: `Client ID that created preview. - [${labelPrefix}client_id]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}expires_at`,
                label: `Unix timestamp in milliseconds for preview expiration. - [${labelPrefix}expires_at]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}is_active`,
                label: `Whether preview link is active. - [${labelPrefix}is_active]`,
                required: true,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}pin_id`,
                label: `Pin ID for pin promotion preview. - [${labelPrefix}pin_id]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}pin_promotion_id`,
                label: `Pin promotion ID for this preview. - [${labelPrefix}pin_promotion_id]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}promoted_product_group_id`,
                label: `Promoted product group ID for catalog previews. - [${labelPrefix}promoted_product_group_id]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}url`,
                label: `Campaign ad preview URL. - [${labelPrefix}url]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}user_id`,
                label: `User ID that created preview. - [${labelPrefix}user_id]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}uuid`,
                label: `Pin promotion preview key. - [${labelPrefix}uuid]`,
                required: true,
                type: 'string',
            },
            ...Pinterest.Lib.Error.fields(`${keyPrefix}exceptions`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ad_account_id': bundle.inputData?.[`${keyPrefix}ad_account_id`],
            'ad_group_id': bundle.inputData?.[`${keyPrefix}ad_group_id`],
            'client_id': bundle.inputData?.[`${keyPrefix}client_id`],
            'expires_at': bundle.inputData?.[`${keyPrefix}expires_at`],
            'is_active': bundle.inputData?.[`${keyPrefix}is_active`],
            'pin_id': bundle.inputData?.[`${keyPrefix}pin_id`],
            'pin_promotion_id': bundle.inputData?.[`${keyPrefix}pin_promotion_id`],
            'promoted_product_group_id': bundle.inputData?.[`${keyPrefix}promoted_product_group_id`],
            'url': bundle.inputData?.[`${keyPrefix}url`],
            'user_id': bundle.inputData?.[`${keyPrefix}user_id`],
            'uuid': bundle.inputData?.[`${keyPrefix}uuid`],
            'exceptions': utils.removeIfEmpty(Pinterest.Lib.Error.mapping(bundle, `${keyPrefix}exceptions`)),
        }
    },
}
