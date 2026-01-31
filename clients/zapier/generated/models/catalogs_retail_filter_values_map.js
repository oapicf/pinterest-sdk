const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}ad_image_tags`,
                label: `[${labelPrefix}ad_image_tags]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}ad_video_tags`,
                label: `[${labelPrefix}ad_video_tags]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}availability`,
                label: `[${labelPrefix}availability]`,
                list: true,
                type: 'string',
                choices: [
                ],
            },
            {
                key: `${keyPrefix}brand`,
                label: `[${labelPrefix}brand]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}condition`,
                label: `[${labelPrefix}condition]`,
                list: true,
                type: 'string',
                choices: [
                ],
            },
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
                key: `${keyPrefix}gender`,
                label: `[${labelPrefix}gender]`,
                list: true,
                type: 'string',
                choices: [
                ],
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
            {
                key: `${keyPrefix}product_type_0`,
                label: `[${labelPrefix}product_type_0]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}product_type_1`,
                label: `[${labelPrefix}product_type_1]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}product_type_2`,
                label: `[${labelPrefix}product_type_2]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}product_type_3`,
                label: `[${labelPrefix}product_type_3]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}product_type_4`,
                label: `[${labelPrefix}product_type_4]`,
                list: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ad_image_tags': bundle.inputData?.[`${keyPrefix}ad_image_tags`],
            'ad_video_tags': bundle.inputData?.[`${keyPrefix}ad_video_tags`],
            'availability': bundle.inputData?.[`${keyPrefix}availability`],
            'brand': bundle.inputData?.[`${keyPrefix}brand`],
            'condition': bundle.inputData?.[`${keyPrefix}condition`],
            'custom_label_0': bundle.inputData?.[`${keyPrefix}custom_label_0`],
            'custom_label_1': bundle.inputData?.[`${keyPrefix}custom_label_1`],
            'custom_label_2': bundle.inputData?.[`${keyPrefix}custom_label_2`],
            'custom_label_3': bundle.inputData?.[`${keyPrefix}custom_label_3`],
            'custom_label_4': bundle.inputData?.[`${keyPrefix}custom_label_4`],
            'gender': bundle.inputData?.[`${keyPrefix}gender`],
            'google_product_category_0': bundle.inputData?.[`${keyPrefix}google_product_category_0`],
            'google_product_category_1': bundle.inputData?.[`${keyPrefix}google_product_category_1`],
            'google_product_category_2': bundle.inputData?.[`${keyPrefix}google_product_category_2`],
            'google_product_category_3': bundle.inputData?.[`${keyPrefix}google_product_category_3`],
            'google_product_category_4': bundle.inputData?.[`${keyPrefix}google_product_category_4`],
            'google_product_category_5': bundle.inputData?.[`${keyPrefix}google_product_category_5`],
            'google_product_category_6': bundle.inputData?.[`${keyPrefix}google_product_category_6`],
            'media_type': bundle.inputData?.[`${keyPrefix}media_type`],
            'product_type_0': bundle.inputData?.[`${keyPrefix}product_type_0`],
            'product_type_1': bundle.inputData?.[`${keyPrefix}product_type_1`],
            'product_type_2': bundle.inputData?.[`${keyPrefix}product_type_2`],
            'product_type_3': bundle.inputData?.[`${keyPrefix}product_type_3`],
            'product_type_4': bundle.inputData?.[`${keyPrefix}product_type_4`],
        }
    },
}
