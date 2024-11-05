const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}active`,
                label: `True if the offer code is currently active. - [${labelPrefix}active]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}advertiser_id`,
                label: `Advertiser ID the offer was applied to. - [${labelPrefix}advertiser_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}discountType`,
                label: `The type of discount of this credit - [${labelPrefix}discountType]`,
                type: 'string',
                choices: [
                    'COUPON',
                    'CREDIT',
                    'COUPON_APPLIED',
                    'CREDIT_APPLIED',
                    'MARKETING_OFFER_CREDIT',
                    'MARKETING_OFFER_CREDIT_APPLIED',
                    'GOODWILL_CREDIT',
                    'GOODWILL_CREDIT_APPLIED',
                    'INTERNAL_CREDIT',
                    'INTERNAL_CREDIT_APPLIED',
                    'PREPAID_CREDIT',
                    'PREPAID_CREDIT_APPLIED',
                    'SALES_INCENTIVE_CREDIT',
                    'SALES_INCENTIVE_CREDIT_APPLIED',
                    'CREDIT_EXPIRED',
                    'FUTURE_CREDIT',
                    'REFERRAL_CREDIT',
                    'INVOICE_SALES_INCENTIVE_CREDIT',
                    'INVOICE_SALES_INCENTIVE_CREDIT_APPLIED',
                    'PREPAID_CREDIT_REFUND',
                ],
            },
            {
                key: `${keyPrefix}discountInMicroCurrency`,
                label: `The discount applied in the offer’s currency value. - [${labelPrefix}discountInMicroCurrency]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}discountCurrency`,
                label: `Currency value for the discount. - [${labelPrefix}discountCurrency]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}title`,
                label: `Human readable title of the offer code. - [${labelPrefix}title]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}remainingDiscountInMicroCurrency`,
                label: `The credits left to spend. - [${labelPrefix}remainingDiscountInMicroCurrency]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'active': bundle.inputData?.[`${keyPrefix}active`],
            'advertiser_id': bundle.inputData?.[`${keyPrefix}advertiser_id`],
            'discountType': bundle.inputData?.[`${keyPrefix}discountType`],
            'discountInMicroCurrency': bundle.inputData?.[`${keyPrefix}discountInMicroCurrency`],
            'discountCurrency': bundle.inputData?.[`${keyPrefix}discountCurrency`],
            'title': bundle.inputData?.[`${keyPrefix}title`],
            'remainingDiscountInMicroCurrency': bundle.inputData?.[`${keyPrefix}remainingDiscountInMicroCurrency`],
        }
    },
}
