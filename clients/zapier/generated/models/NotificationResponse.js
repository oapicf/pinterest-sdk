const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}error_msg`,
                label: `error message when success is false - [${labelPrefix}error_msg]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}received_at`,
                label: `Received time. Unix timestamp in seconds. - [${labelPrefix}received_at]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}success`,
                label: `Returns true if the notification accepted. - [${labelPrefix}success]`,
                type: 'boolean',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'error_msg': bundle.inputData?.[`${keyPrefix}error_msg`],
            'received_at': bundle.inputData?.[`${keyPrefix}received_at`],
            'success': bundle.inputData?.[`${keyPrefix}success`],
        }
    },
}
