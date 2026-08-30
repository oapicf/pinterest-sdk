const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}error_type`,
                label: `The type of validation error: INVALID_FILE or ROW_VALIDATION_FAILED. - [${labelPrefix}error_type]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}row_number`,
                label: `The row number with a validation error. -1 indicates a file-level error. - [${labelPrefix}row_number]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'error_type': bundle.inputData?.[`${keyPrefix}error_type`],
            'row_number': bundle.inputData?.[`${keyPrefix}row_number`],
        }
    },
}
