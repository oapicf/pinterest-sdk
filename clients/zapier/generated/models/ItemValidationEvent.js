const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}attribute`,
                label: `The attribute that the item validation event references - [${labelPrefix}attribute]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}code`,
                label: `The event code that the item validation event references - [${labelPrefix}code]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}message`,
                label: `Title message describing the item validation event - [${labelPrefix}message]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'attribute': bundle.inputData?.[`${keyPrefix}attribute`],
            'code': bundle.inputData?.[`${keyPrefix}code`],
            'message': bundle.inputData?.[`${keyPrefix}message`],
        }
    },
}
