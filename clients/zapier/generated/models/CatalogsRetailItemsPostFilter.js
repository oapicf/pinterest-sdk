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
                    'RETAIL',
                ],
            },
            {
                key: `${keyPrefix}item_ids`,
                label: `[${labelPrefix}item_ids]`,
                required: true,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}catalog_id`,
                label: `Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog - [${labelPrefix}catalog_id]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'catalog_type': bundle.inputData?.[`${keyPrefix}catalog_type`],
            'item_ids': bundle.inputData?.[`${keyPrefix}item_ids`],
            'catalog_id': bundle.inputData?.[`${keyPrefix}catalog_id`],
        }
    },
}
