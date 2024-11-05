const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}partner_ids`,
                label: `[${labelPrefix}partner_ids]`,
                required: true,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}partner_type`,
                label: `[${labelPrefix}partner_type]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'partner_ids': bundle.inputData?.[`${keyPrefix}partner_ids`],
            'partner_type': bundle.inputData?.[`${keyPrefix}partner_type`],
        }
    },
}
