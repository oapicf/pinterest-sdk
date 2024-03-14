const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}status`,
                label: `Whether the event was processed successfully. - [${labelPrefix}status]`,
                required: true,
                type: 'string',
                choices: [
                    'failed',
                    'processed',
                ],
            },
            {
                key: `${keyPrefix}error_message`,
                label: `Error message containing more information about why the event failed to be processed. - [${labelPrefix}error_message]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}warning_message`,
                label: `Warning messages about any fields in the event which are not standard. These are not critical to event processing. - [${labelPrefix}warning_message]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'error_message': bundle.inputData?.[`${keyPrefix}error_message`],
            'warning_message': bundle.inputData?.[`${keyPrefix}warning_message`],
        }
    },
}
