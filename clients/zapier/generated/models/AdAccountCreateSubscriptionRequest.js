const utils = require('../utils/utils');
const AdAccountCreateSubscriptionRequest_partner_metadata = require('../models/AdAccountCreateSubscriptionRequest_partner_metadata');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}webhook_url`,
                label: `Standard HTTPS webhook URL. - [${labelPrefix}webhook_url]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}lead_form_id`,
                label: `Lead form ID. - [${labelPrefix}lead_form_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}partner_access_token`,
                label: `Partner access token. Only for clients that requires authentication. We recommend to avoid this param. - [${labelPrefix}partner_access_token]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}partner_refresh_token`,
                label: `Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. - [${labelPrefix}partner_refresh_token]`,
                type: 'string',
            },
            ...AdAccountCreateSubscriptionRequest_partner_metadata.fields(`${keyPrefix}partner_metadata`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'webhook_url': bundle.inputData?.[`${keyPrefix}webhook_url`],
            'lead_form_id': bundle.inputData?.[`${keyPrefix}lead_form_id`],
            'partner_access_token': bundle.inputData?.[`${keyPrefix}partner_access_token`],
            'partner_refresh_token': bundle.inputData?.[`${keyPrefix}partner_refresh_token`],
            'partner_metadata': utils.removeIfEmpty(AdAccountCreateSubscriptionRequest_partner_metadata.mapping(bundle, `${keyPrefix}partner_metadata`)),
        }
    },
}
