const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}email`,
                label: `Email of the business member/partner. - [${labelPrefix}email]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}id`,
                label: `Unique identifier of the business member/partner. - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}username`,
                label: `Username of the business member/partner. - [${labelPrefix}username]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'email': bundle.inputData?.[`${keyPrefix}email`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'username': bundle.inputData?.[`${keyPrefix}username`],
        }
    },
}
