const utils = require('../utils/utils');
const Currency = require('../models/Currency');
const LineItem = require('../models/LineItem');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}currency`,
                ...Currency.fields(`${keyPrefix}currency`, isInput),
            },
            {
                key: `${keyPrefix}lead_type`,
                label: `Promotion code. For example, \"Newsletter\". - [${labelPrefix}lead_type]`,
                type: 'string',
            },
            ...LineItem.fields(`${keyPrefix}line_items`, isInput),
            {
                key: `${keyPrefix}order_id`,
                label: `Order ID. For example, \"X-151481\". - [${labelPrefix}order_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}order_quantity`,
                label: `Order quantity. For example, 1. - [${labelPrefix}order_quantity]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}page_name`,
                label: `Page name. For example, \"Our Favorite Pins on Pinterest\". - [${labelPrefix}page_name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}promo_code`,
                label: `Promotion code. For example, \"WINTER10\". - [${labelPrefix}promo_code]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}property`,
                label: `Property. For example, \"Athleta\". - [${labelPrefix}property]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}search_query`,
                label: `Search query string. For example, \"boots\". - [${labelPrefix}search_query]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}value`,
                label: `Product value. For example, \"199.98\" - [${labelPrefix}value]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}video_title`,
                label: `Video title. For example, \"How to style your Parker Boots\". - [${labelPrefix}video_title]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'currency': bundle.inputData?.[`${keyPrefix}currency`],
            'lead_type': bundle.inputData?.[`${keyPrefix}lead_type`],
            'line_items': utils.removeIfEmpty(LineItem.mapping(bundle, `${keyPrefix}line_items`)),
            'order_id': bundle.inputData?.[`${keyPrefix}order_id`],
            'order_quantity': bundle.inputData?.[`${keyPrefix}order_quantity`],
            'page_name': bundle.inputData?.[`${keyPrefix}page_name`],
            'promo_code': bundle.inputData?.[`${keyPrefix}promo_code`],
            'property': bundle.inputData?.[`${keyPrefix}property`],
            'search_query': bundle.inputData?.[`${keyPrefix}search_query`],
            'value': bundle.inputData?.[`${keyPrefix}value`],
            'video_title': bundle.inputData?.[`${keyPrefix}video_title`],
        }
    },
}
