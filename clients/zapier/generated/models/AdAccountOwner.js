const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `The owning account's user ID. - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}username`,
                label: `Public username for the user account - [${labelPrefix}username]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'username': bundle.inputData?.[`${keyPrefix}username`],
        }
    },
}
