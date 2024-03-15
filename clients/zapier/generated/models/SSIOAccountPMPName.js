const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}name`,
                label: `Display name - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}id`,
                label: `Salesforce id for PMP - [${labelPrefix}id]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
        }
    },
}
