const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}code`,
                label: `Error code associated with the error editing asset group. - [${labelPrefix}code]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}message`,
                label: `Error message associated with the error editing asset group. - [${labelPrefix}message]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}asset_group_id`,
                label: `Asset group id of the exception. - [${labelPrefix}asset_group_id]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'code': bundle.inputData?.[`${keyPrefix}code`],
            'message': bundle.inputData?.[`${keyPrefix}message`],
            'asset_group_id': bundle.inputData?.[`${keyPrefix}asset_group_id`],
        }
    },
}
