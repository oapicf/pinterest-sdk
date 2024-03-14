const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}password`,
                label: `The required password for downloading a feed. - [${labelPrefix}password]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}username`,
                label: `The required username for downloading a feed. - [${labelPrefix}username]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'password': bundle.inputData?.[`${keyPrefix}password`],
            'username': bundle.inputData?.[`${keyPrefix}username`],
        }
    },
}
