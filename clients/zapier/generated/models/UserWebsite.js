const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}status`,
                label: `Status of the verification process - [${labelPrefix}status]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}verified_at`,
                label: `UTC timestamp when the verification happened - sometimes missing - [${labelPrefix}verified_at]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}website`,
                label: `Website with path or domain only - [${labelPrefix}website]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'verified_at': bundle.inputData?.[`${keyPrefix}verified_at`],
            'website': bundle.inputData?.[`${keyPrefix}website`],
        }
    },
}
