const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}type`,
                label: `Always \"user\" - [${labelPrefix}type]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}username`,
                label: `Username - [${labelPrefix}username]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'username': bundle.inputData?.[`${keyPrefix}username`],
        }
    },
}
