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
                    'FINISHED',
                    'IN_PROGRESS',
                ],
            },
            {
                key: `${keyPrefix}url`,
                label: `URL to download the report - [${labelPrefix}url]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}size`,
                label: `Size of the report in bytes - [${labelPrefix}size]`,
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
