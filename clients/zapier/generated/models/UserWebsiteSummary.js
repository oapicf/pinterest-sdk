const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}website`,
                label: `Website with path or domain only - [${labelPrefix}website]`,
                type: 'string',
            },
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
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'website': bundle.inputData?.[`${keyPrefix}website`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'verified_at': bundle.inputData?.[`${keyPrefix}verified_at`],
        }
    },
}
