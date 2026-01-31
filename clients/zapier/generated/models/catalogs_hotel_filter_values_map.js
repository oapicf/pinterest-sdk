const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}brand`,
                label: `[${labelPrefix}brand]`,
                list: true,
                type: 'string',
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
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'brand': bundle.inputData?.[`${keyPrefix}brand`],
            'custom_label_0': bundle.inputData?.[`${keyPrefix}custom_label_0`],
            'custom_label_1': bundle.inputData?.[`${keyPrefix}custom_label_1`],
            'custom_label_2': bundle.inputData?.[`${keyPrefix}custom_label_2`],
            'custom_label_3': bundle.inputData?.[`${keyPrefix}custom_label_3`],
            'custom_label_4': bundle.inputData?.[`${keyPrefix}custom_label_4`],
        }
    },
}
