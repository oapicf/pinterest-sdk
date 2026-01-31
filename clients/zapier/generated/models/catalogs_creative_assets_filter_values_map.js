const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}custom_label_0`,
                label: `[${labelPrefix}custom_label_0]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}custom_label_1`,
                label: `[${labelPrefix}custom_label_1]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}custom_label_2`,
                label: `[${labelPrefix}custom_label_2]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}custom_label_3`,
                label: `[${labelPrefix}custom_label_3]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}custom_label_4`,
                label: `[${labelPrefix}custom_label_4]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}google_product_category_0`,
                label: `[${labelPrefix}google_product_category_0]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}google_product_category_1`,
                label: `[${labelPrefix}google_product_category_1]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}google_product_category_2`,
                label: `[${labelPrefix}google_product_category_2]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}google_product_category_3`,
                label: `[${labelPrefix}google_product_category_3]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}google_product_category_4`,
                label: `[${labelPrefix}google_product_category_4]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}google_product_category_5`,
                label: `[${labelPrefix}google_product_category_5]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}google_product_category_6`,
                label: `[${labelPrefix}google_product_category_6]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}media_type`,
                label: `[${labelPrefix}media_type]`,
                list: true,
                type: 'string',
                choices: [
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'custom_label_0': bundle.inputData?.[`${keyPrefix}custom_label_0`],
            'custom_label_1': bundle.inputData?.[`${keyPrefix}custom_label_1`],
            'custom_label_2': bundle.inputData?.[`${keyPrefix}custom_label_2`],
            'custom_label_3': bundle.inputData?.[`${keyPrefix}custom_label_3`],
            'custom_label_4': bundle.inputData?.[`${keyPrefix}custom_label_4`],
            'google_product_category_0': bundle.inputData?.[`${keyPrefix}google_product_category_0`],
            'google_product_category_1': bundle.inputData?.[`${keyPrefix}google_product_category_1`],
            'google_product_category_2': bundle.inputData?.[`${keyPrefix}google_product_category_2`],
            'google_product_category_3': bundle.inputData?.[`${keyPrefix}google_product_category_3`],
            'google_product_category_4': bundle.inputData?.[`${keyPrefix}google_product_category_4`],
            'google_product_category_5': bundle.inputData?.[`${keyPrefix}google_product_category_5`],
            'google_product_category_6': bundle.inputData?.[`${keyPrefix}google_product_category_6`],
            'media_type': bundle.inputData?.[`${keyPrefix}media_type`],
        }
    },
}
