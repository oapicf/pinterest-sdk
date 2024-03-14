const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}report_status`,
                label: `[${labelPrefix}report_status]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}token`,
                label: `[${labelPrefix}token]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}message`,
                label: `[${labelPrefix}message]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'report_status': bundle.inputData?.[`${keyPrefix}report_status`],
            'token': bundle.inputData?.[`${keyPrefix}token`],
            'message': bundle.inputData?.[`${keyPrefix}message`],
        }
    },
}
