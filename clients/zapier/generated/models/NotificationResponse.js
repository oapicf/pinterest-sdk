const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}success`,
                label: `Returns true if the notification accepted. - [${labelPrefix}success]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}received_at`,
                label: `Received time. Unix timestamp in seconds. - [${labelPrefix}received_at]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}error_msg`,
                label: `error message when success is false - [${labelPrefix}error_msg]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'success': bundle.inputData?.[`${keyPrefix}success`],
            'received_at': bundle.inputData?.[`${keyPrefix}received_at`],
            'error_msg': bundle.inputData?.[`${keyPrefix}error_msg`],
        }
    },
}
