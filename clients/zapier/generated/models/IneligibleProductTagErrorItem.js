const utils = require('../utils/utils');
const IneligibleProductTagReason = require('../models/IneligibleProductTagReason');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}error_message`,
                ...IneligibleProductTagReason.fields(`${keyPrefix}error_message`, isInput),
            },
            {
                key: `${keyPrefix}pin_id`,
                label: `Pin ID that failed eligibility check. - [${labelPrefix}pin_id]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'error_message': bundle.inputData?.[`${keyPrefix}error_message`],
            'pin_id': bundle.inputData?.[`${keyPrefix}pin_id`],
        }
    },
}
