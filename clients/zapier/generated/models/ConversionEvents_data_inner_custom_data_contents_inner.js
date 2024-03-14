const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}item_price`,
                label: `The price of a product. Accepted as a string in the request; it will be parsed into a double. For example, if there are two products in a checkout event, the value should be the total price - [${labelPrefix}item_price]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}quantity`,
                label: `The amount of a product. - [${labelPrefix}quantity]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'item_price': bundle.inputData?.[`${keyPrefix}item_price`],
            'quantity': bundle.inputData?.[`${keyPrefix}quantity`],
        }
    },
}
