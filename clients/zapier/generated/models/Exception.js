const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}code`,
                label: `Exception error code. - [${labelPrefix}code]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}message`,
                label: `Exception message. - [${labelPrefix}message]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'code': bundle.inputData?.[`${keyPrefix}code`],
            'message': bundle.inputData?.[`${keyPrefix}message`],
        }
    },
}
