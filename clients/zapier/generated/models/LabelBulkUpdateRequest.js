const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Label ID. - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}status`,
                label: `Set status to `ARCHIVED` to remove the label from the parent entity. - [${labelPrefix}status]`,
                type: 'string',
                choices: [
                    'ARCHIVED',
                ],
            },
            {
                key: `${keyPrefix}value`,
                label: `</p><strong>Note:</strong> value field will be deprecated. Label name. 100-character limit. - [${labelPrefix}value]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'value': bundle.inputData?.[`${keyPrefix}value`],
        }
    },
}
