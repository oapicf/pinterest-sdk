const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}code`,
                label: `Error code associated with the error in requesting asset access. - [${labelPrefix}code]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}messages`,
                label: `[${labelPrefix}messages]`,
                list: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'code': bundle.inputData?.[`${keyPrefix}code`],
            'messages': bundle.inputData?.[`${keyPrefix}messages`],
        }
    },
}
