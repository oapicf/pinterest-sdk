const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}catalog_type`,
                label: `[${labelPrefix}catalog_type]`,
                required: true,
                type: 'string',
                choices: [
                    'HOTEL',
                ],
            },
            {
                key: `${keyPrefix}hotel_ids`,
                label: `[${labelPrefix}hotel_ids]`,
                required: true,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}catalog_id`,
                label: `Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog - [${labelPrefix}catalog_id]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'catalog_type': bundle.inputData?.[`${keyPrefix}catalog_type`],
            'hotel_ids': bundle.inputData?.[`${keyPrefix}hotel_ids`],
            'catalog_id': bundle.inputData?.[`${keyPrefix}catalog_id`],
        }
    },
}
