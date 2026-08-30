const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}field`,
                label: `The field name containing an invalid value. - [${labelPrefix}field]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}log_index`,
                label: `Index of the log in the batch. - [${labelPrefix}log_index]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}reason`,
                label: `The reason the value is invalid. - [${labelPrefix}reason]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}value`,
                label: `The value that is invalid. - [${labelPrefix}value]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'field': bundle.inputData?.[`${keyPrefix}field`],
            'log_index': bundle.inputData?.[`${keyPrefix}log_index`],
            'reason': bundle.inputData?.[`${keyPrefix}reason`],
            'value': bundle.inputData?.[`${keyPrefix}value`],
        }
    },
}
