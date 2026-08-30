const utils = require('../utils/utils');
const BillingProfileCardType = require('../models/BillingProfileCardType');
const BillingProfilePaymentMethodBrand = require('../models/BillingProfilePaymentMethodBrand');
const BillingProfileStatus = require('../models/BillingProfileStatus');
const BillingType = require('../models/BillingType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}advertiser_id`,
                label: `Advertiser ID of the billing. - [${labelPrefix}advertiser_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}billing_type`,
                ...BillingType.fields(`${keyPrefix}billing_type`, isInput),
            },
            {
                key: `${keyPrefix}card_type`,
                ...BillingProfileCardType.fields(`${keyPrefix}card_type`, isInput),
            },
            {
                key: `${keyPrefix}id`,
                label: `Billing ID. - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}payment_method_brand`,
                ...BillingProfilePaymentMethodBrand.fields(`${keyPrefix}payment_method_brand`, isInput),
            },
            {
                key: `${keyPrefix}status`,
                ...BillingProfileStatus.fields(`${keyPrefix}status`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'advertiser_id': bundle.inputData?.[`${keyPrefix}advertiser_id`],
            'billing_type': bundle.inputData?.[`${keyPrefix}billing_type`],
            'card_type': bundle.inputData?.[`${keyPrefix}card_type`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'payment_method_brand': bundle.inputData?.[`${keyPrefix}payment_method_brand`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
        }
    },
}
