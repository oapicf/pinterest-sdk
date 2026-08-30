const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}18-24`,
                label: `[${labelPrefix}18-24]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}25-34`,
                label: `[${labelPrefix}25-34]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}35-44`,
                label: `[${labelPrefix}35-44]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}45-49`,
                label: `[${labelPrefix}45-49]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}50-54`,
                label: `[${labelPrefix}50-54]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}55-64`,
                label: `[${labelPrefix}55-64]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}65+`,
                label: `[${labelPrefix}65+]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            '18-24': bundle.inputData?.[`${keyPrefix}18-24`],
            '25-34': bundle.inputData?.[`${keyPrefix}25-34`],
            '35-44': bundle.inputData?.[`${keyPrefix}35-44`],
            '45-49': bundle.inputData?.[`${keyPrefix}45-49`],
            '50-54': bundle.inputData?.[`${keyPrefix}50-54`],
            '55-64': bundle.inputData?.[`${keyPrefix}55-64`],
            '65+': bundle.inputData?.[`${keyPrefix}65+`],
        }
    },
}
