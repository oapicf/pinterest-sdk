const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}geohash`,
                label: `Geohash of the store location - [${labelPrefix}geohash]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}latitude`,
                label: `Geographic latitude coordinate of the store - [${labelPrefix}latitude]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}longitude`,
                label: `Geographic longitude coordinate of the store - [${labelPrefix}longitude]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}store_code`,
                label: `Merchant provided store code - [${labelPrefix}store_code]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}store_id`,
                label: `Internal store code - [${labelPrefix}store_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}store_name`,
                label: `Store name - [${labelPrefix}store_name]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'geohash': bundle.inputData?.[`${keyPrefix}geohash`],
            'latitude': bundle.inputData?.[`${keyPrefix}latitude`],
            'longitude': bundle.inputData?.[`${keyPrefix}longitude`],
            'store_code': bundle.inputData?.[`${keyPrefix}store_code`],
            'store_id': bundle.inputData?.[`${keyPrefix}store_id`],
            'store_name': bundle.inputData?.[`${keyPrefix}store_name`],
        }
    },
}
