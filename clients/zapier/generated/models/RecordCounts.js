const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}invalid`,
                label: `Number of invalid records processed - [${labelPrefix}invalid]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}processed`,
                label: `Number of records processed - [${labelPrefix}processed]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}valid`,
                label: `Number of valid records processed - [${labelPrefix}valid]`,
                required: true,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'invalid': bundle.inputData?.[`${keyPrefix}invalid`],
            'processed': bundle.inputData?.[`${keyPrefix}processed`],
            'valid': bundle.inputData?.[`${keyPrefix}valid`],
        }
    },
}
