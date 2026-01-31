const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}statusCode`,
                label: `[${labelPrefix}statusCode]`,
                required: true,
                type: 'number',
                choices: [
                    '204',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'statusCode': bundle.inputData?.[`${keyPrefix}statusCode`],
        }
    },
}
