const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}amazon_storefront_id`,
                label: `The Amazon storefront id - [${labelPrefix}amazon_storefront_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}amazon_storefront_name`,
                label: `The Amazon storefront name - [${labelPrefix}amazon_storefront_name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}amazon_storefront_url`,
                label: `The Amazon storefront url - [${labelPrefix}amazon_storefront_url]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}amazon_user_id`,
                label: `The Amazon user id - [${labelPrefix}amazon_user_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}is_amazon_account_linked`,
                label: `The Amazon account linking status - [${labelPrefix}is_amazon_account_linked]`,
                required: true,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}one_time_passcode`,
                label: `The one time passcode for Pinterest-initiated linking requests - [${labelPrefix}one_time_passcode]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}pinterest_user_id`,
                label: `The Pinterest user id for Amazon-initiated linking requests - [${labelPrefix}pinterest_user_id]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'amazon_storefront_id': bundle.inputData?.[`${keyPrefix}amazon_storefront_id`],
            'amazon_storefront_name': bundle.inputData?.[`${keyPrefix}amazon_storefront_name`],
            'amazon_storefront_url': bundle.inputData?.[`${keyPrefix}amazon_storefront_url`],
            'amazon_user_id': bundle.inputData?.[`${keyPrefix}amazon_user_id`],
            'is_amazon_account_linked': bundle.inputData?.[`${keyPrefix}is_amazon_account_linked`],
            'one_time_passcode': bundle.inputData?.[`${keyPrefix}one_time_passcode`],
            'pinterest_user_id': bundle.inputData?.[`${keyPrefix}pinterest_user_id`],
        }
    },
}
