const utils = require('../utils/utils');
const ItemAvailability = require('../models/ItemAvailability');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}ad_link`,
                label: `Ad link for the item - [${labelPrefix}ad_link]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}availability`,
                ...ItemAvailability.fields(`${keyPrefix}availability`, isInput),
            },
            {
                key: `${keyPrefix}price`,
                label: `The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars. - [${labelPrefix}price]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}sale_price`,
                label: `The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars. - [${labelPrefix}sale_price]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ad_link': bundle.inputData?.[`${keyPrefix}ad_link`],
            'availability': bundle.inputData?.[`${keyPrefix}availability`],
            'price': bundle.inputData?.[`${keyPrefix}price`],
            'sale_price': bundle.inputData?.[`${keyPrefix}sale_price`],
        }
    },
}
