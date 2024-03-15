const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}username`,
                label: `Public username for the user account - [${labelPrefix}username]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}id`,
                label: `The owning account's user ID. - [${labelPrefix}id]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'username': bundle.inputData?.[`${keyPrefix}username`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
        }
    },
}
