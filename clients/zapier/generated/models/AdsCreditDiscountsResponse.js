const utils = require('../utils/utils');
const AdsCreditDiscountType = require('../models/AdsCreditDiscountType');

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
                key: `${keyPrefix}discountCurrency`,
                label: `Currency value for the discount. - [${labelPrefix}discountCurrency]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}discountInMicroCurrency`,
                label: `The discount applied in the offer's currency value. - [${labelPrefix}discountInMicroCurrency]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}discountType`,
                ...AdsCreditDiscountType.fields(`${keyPrefix}discountType`, isInput),
            },
            {
                key: `${keyPrefix}remainingDiscountInMicroCurrency`,
                label: `The credits left to spend. - [${labelPrefix}remainingDiscountInMicroCurrency]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}title`,
                label: `Human readable title of the offer code. - [${labelPrefix}title]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'active': bundle.inputData?.[`${keyPrefix}active`],
            'advertiser_id': bundle.inputData?.[`${keyPrefix}advertiser_id`],
            'discountCurrency': bundle.inputData?.[`${keyPrefix}discountCurrency`],
            'discountInMicroCurrency': bundle.inputData?.[`${keyPrefix}discountInMicroCurrency`],
            'discountType': bundle.inputData?.[`${keyPrefix}discountType`],
            'remainingDiscountInMicroCurrency': bundle.inputData?.[`${keyPrefix}remainingDiscountInMicroCurrency`],
            'title': bundle.inputData?.[`${keyPrefix}title`],
        }
    },
}
