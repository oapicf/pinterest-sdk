const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}report_status`,
                label: `[${labelPrefix}report_status]`,
                type: 'string',
                choices: [
                    'DOES_NOT_EXIST',
                    'FINISHED',
                    'IN_PROGRESS',
                    'EXPIRED',
                    'FAILED',
                    'CANCELLED',
                ],
            },
            {
                key: `${keyPrefix}url`,
                label: `[${labelPrefix}url]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}size`,
                label: `[${labelPrefix}size]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'report_status': bundle.inputData?.[`${keyPrefix}report_status`],
            'url': bundle.inputData?.[`${keyPrefix}url`],
            'size': bundle.inputData?.[`${keyPrefix}size`],
        }
    },
}
