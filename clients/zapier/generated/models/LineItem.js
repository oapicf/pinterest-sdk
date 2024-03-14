const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}product_brand`,
                label: `Product brand. For example, \"Parker\". - [${labelPrefix}product_brand]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}product_category`,
                label: `Product category. For example, \"Shoes\". - [${labelPrefix}product_category]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}product_id`,
                label: `Product ID. For example, 1414. - [${labelPrefix}product_id]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}product_name`,
                label: `Product name. For example, \"Parker Boots\". - [${labelPrefix}product_name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}product_price`,
                label: `Product price. For example, \"99.99\". - [${labelPrefix}product_price]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}product_quantity`,
                label: `Product quantity. For example, 2. - [${labelPrefix}product_quantity]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}product_variant`,
                label: `Product variant. For example, \"Red\". - [${labelPrefix}product_variant]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}product_variant_id`,
                label: `Product variant ID. For example, \"1414-34832\". - [${labelPrefix}product_variant_id]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'product_brand': bundle.inputData?.[`${keyPrefix}product_brand`],
            'product_category': bundle.inputData?.[`${keyPrefix}product_category`],
            'product_id': bundle.inputData?.[`${keyPrefix}product_id`],
            'product_name': bundle.inputData?.[`${keyPrefix}product_name`],
            'product_price': bundle.inputData?.[`${keyPrefix}product_price`],
            'product_quantity': bundle.inputData?.[`${keyPrefix}product_quantity`],
            'product_variant': bundle.inputData?.[`${keyPrefix}product_variant`],
            'product_variant_id': bundle.inputData?.[`${keyPrefix}product_variant_id`],
        }
    },
}
