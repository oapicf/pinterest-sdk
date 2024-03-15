const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}username`,
                label: `Username - [${labelPrefix}username]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}type`,
                label: `Always \"user\" - [${labelPrefix}type]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'username': bundle.inputData?.[`${keyPrefix}username`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
        }
    },
}
