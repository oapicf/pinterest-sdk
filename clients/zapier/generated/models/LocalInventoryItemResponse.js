const utils = require('../utils/utils');
const ItemAvailability = require('../models/ItemAvailability');
const StoreMetadata = require('../models/StoreMetadata');

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
                key: `${keyPrefix}created_at`,
                label: `The millisecond timestamp when the local inventory item was created - [${labelPrefix}created_at]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}item_id`,
                label: `The catalog item id in the merchant namespace - [${labelPrefix}item_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}last_updated_time`,
                label: `The millisecond timestamp when the local inventory item was lastly modified by the merchant. - [${labelPrefix}last_updated_time]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}price`,
                label: `The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars. - [${labelPrefix}price]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}sale_price`,
                label: `The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars. - [${labelPrefix}sale_price]`,
                type: 'string',
            },
            ...StoreMetadata.fields(`${keyPrefix}store_metadata`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ad_link': bundle.inputData?.[`${keyPrefix}ad_link`],
            'availability': bundle.inputData?.[`${keyPrefix}availability`],
            'created_at': bundle.inputData?.[`${keyPrefix}created_at`],
            'item_id': bundle.inputData?.[`${keyPrefix}item_id`],
            'last_updated_time': bundle.inputData?.[`${keyPrefix}last_updated_time`],
            'price': bundle.inputData?.[`${keyPrefix}price`],
            'sale_price': bundle.inputData?.[`${keyPrefix}sale_price`],
            'store_metadata': utils.removeIfEmpty(StoreMetadata.mapping(bundle, `${keyPrefix}store_metadata`)),
        }
    },
}
