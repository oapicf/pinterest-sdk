const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}count`,
                label: `Number of records with this error - [${labelPrefix}count]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}error_code`,
                label: `Numeric error code - [${labelPrefix}error_code]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}message`,
                label: `Error message description - [${labelPrefix}message]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'count': bundle.inputData?.[`${keyPrefix}count`],
            'error_code': bundle.inputData?.[`${keyPrefix}error_code`],
            'message': bundle.inputData?.[`${keyPrefix}message`],
        }
    },
}
