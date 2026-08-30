const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}catalog_id`,
                label: `Unique identifier of a catalog. If not given, oldest catalog will be used - [${labelPrefix}catalog_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}product_group_id`,
                label: `Optional product group ID. If omitted, all items are included. This feature is only available for allowlisted merchants. Please contact your account manager to enable this feature. - [${labelPrefix}product_group_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}report_type`,
                label: `[${labelPrefix}report_type]`,
                required: true,
                type: 'string',
                choices: [
                    'ALL_ITEMS',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'catalog_id': bundle.inputData?.[`${keyPrefix}catalog_id`],
            'product_group_id': bundle.inputData?.[`${keyPrefix}product_group_id`],
            'report_type': bundle.inputData?.[`${keyPrefix}report_type`],
        }
    },
}
