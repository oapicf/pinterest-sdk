const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}operation_type`,
                label: `[${labelPrefix}operation_type]`,
                required: true,
                type: 'string',
                choices: [
                    'REMOVE',
                ],
            },
            {
                key: `${keyPrefix}id`,
                label: `Targeting template ID - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'operation_type': bundle.inputData?.[`${keyPrefix}operation_type`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
        }
    },
}
