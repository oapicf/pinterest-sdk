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
                key: `${keyPrefix}in_stock`,
                label: `[${labelPrefix}in_stock]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}out_of_stock`,
                label: `[${labelPrefix}out_of_stock]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}preorder`,
                label: `[${labelPrefix}preorder]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}total`,
                label: `[${labelPrefix}total]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}videos`,
                label: `[${labelPrefix}videos]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'catalog_type': bundle.inputData?.[`${keyPrefix}catalog_type`],
            'in_stock': bundle.inputData?.[`${keyPrefix}in_stock`],
            'out_of_stock': bundle.inputData?.[`${keyPrefix}out_of_stock`],
            'preorder': bundle.inputData?.[`${keyPrefix}preorder`],
            'total': bundle.inputData?.[`${keyPrefix}total`],
            'videos': bundle.inputData?.[`${keyPrefix}videos`],
        }
    },
}
