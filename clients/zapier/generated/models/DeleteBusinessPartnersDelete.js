const utils = require('../utils/utils');
const NullablePartnerType = require('../models/NullablePartnerType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}partner_ids`,
                label: `A list of partner ids to be deleted - [${labelPrefix}partner_ids]`,
                required: true,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}partner_type`,
                ...NullablePartnerType.fields(`${keyPrefix}partner_type`, isInput),
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
