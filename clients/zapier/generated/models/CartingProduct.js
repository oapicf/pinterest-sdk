const utils = require('../utils/utils');
const CartingRetailer = require('../models/CartingRetailer');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}carting_product_id`,
                label: `the internal Pinterest carting product id (different from industry product id) - [${labelPrefix}carting_product_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}display_preferred_retailers_only`,
                label: `Whether to display only the preferred retailers for the carting product - [${labelPrefix}display_preferred_retailers_only]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}display_product_price`,
                label: `Whether to display the price for the carting product - [${labelPrefix}display_product_price]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}preferred_retailers`,
                label: `[${labelPrefix}preferred_retailers]`,
                children: CartingRetailer.fields(`${keyPrefix}preferred_retailers${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}randomize_preferred_retailers`,
                label: `Whether to randomize preferred retailers for the carting product - [${labelPrefix}randomize_preferred_retailers]`,
                type: 'boolean',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'carting_product_id': bundle.inputData?.[`${keyPrefix}carting_product_id`],
            'display_preferred_retailers_only': bundle.inputData?.[`${keyPrefix}display_preferred_retailers_only`],
            'display_product_price': bundle.inputData?.[`${keyPrefix}display_product_price`],
            'preferred_retailers': utils.childMapping(bundle.inputData?.[`${keyPrefix}preferred_retailers`], `${keyPrefix}preferred_retailers`, CartingRetailer),
            'randomize_preferred_retailers': bundle.inputData?.[`${keyPrefix}randomize_preferred_retailers`],
        }
    },
}
