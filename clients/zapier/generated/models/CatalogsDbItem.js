const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}created_at`,
                label: `[${labelPrefix}created_at]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}id`,
                label: `[${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}updated_at`,
                label: `[${labelPrefix}updated_at]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'created_at': bundle.inputData?.[`${keyPrefix}created_at`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'updated_at': bundle.inputData?.[`${keyPrefix}updated_at`],
        }
    },
}
