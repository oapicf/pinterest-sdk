const utils = require('../utils/utils');
const NonNullableCatalogsCurrency = require('../models/NonNullableCatalogsCurrency');
const NonNullableProductAvailabilityType = require('../models/NonNullableProductAvailabilityType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}item_id`,
                label: `The user-created unique ID that represents the product. - [${labelPrefix}item_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}item_group_id`,
                label: `The parent ID of the product. - [${labelPrefix}item_group_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}availability`,
                ...NonNullableProductAvailabilityType.fields(`${keyPrefix}availability`, isInput),
            },
            {
                key: `${keyPrefix}price`,
                label: `The price of the product. - [${labelPrefix}price]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}sale_price`,
                label: `The discounted price of the product. - [${labelPrefix}sale_price]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}currency`,
                ...NonNullableCatalogsCurrency.fields(`${keyPrefix}currency`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'item_id': bundle.inputData?.[`${keyPrefix}item_id`],
            'item_group_id': bundle.inputData?.[`${keyPrefix}item_group_id`],
            'availability': bundle.inputData?.[`${keyPrefix}availability`],
            'price': bundle.inputData?.[`${keyPrefix}price`],
            'sale_price': bundle.inputData?.[`${keyPrefix}sale_price`],
            'currency': bundle.inputData?.[`${keyPrefix}currency`],
        }
    },
}
