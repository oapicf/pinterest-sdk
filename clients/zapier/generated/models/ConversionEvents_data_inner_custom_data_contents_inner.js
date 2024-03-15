const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `The id of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section). - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}item_price`,
                label: `The price of a product. Accepted as a string in the request; it will be parsed into a double. This is the original item value before any discount. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section). - [${labelPrefix}item_price]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}quantity`,
                label: `The amount of a product. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section). - [${labelPrefix}quantity]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}item_name`,
                label: `The name of a product. - [${labelPrefix}item_name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}item_category`,
                label: `The category of a product. - [${labelPrefix}item_category]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}item_brand`,
                label: `The brand of a product. - [${labelPrefix}item_brand]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'item_price': bundle.inputData?.[`${keyPrefix}item_price`],
            'quantity': bundle.inputData?.[`${keyPrefix}quantity`],
            'item_name': bundle.inputData?.[`${keyPrefix}item_name`],
            'item_category': bundle.inputData?.[`${keyPrefix}item_category`],
            'item_brand': bundle.inputData?.[`${keyPrefix}item_brand`],
        }
    },
}
