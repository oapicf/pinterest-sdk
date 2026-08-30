const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}lead_form_id`,
                label: `Lead form ID. - [${labelPrefix}lead_form_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}webhook_url`,
                label: `Standard HTTPS webhook URL. - [${labelPrefix}webhook_url]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'lead_form_id': bundle.inputData?.[`${keyPrefix}lead_form_id`],
            'webhook_url': bundle.inputData?.[`${keyPrefix}webhook_url`],
        }
    },
}
