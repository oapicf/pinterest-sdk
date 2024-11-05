const utils = require('../utils/utils');
const BusinessAccessError = require('../models/BusinessAccessError');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...BusinessAccessError.fields(`${keyPrefix}exception`, isInput),
            {
                key: `${keyPrefix}member_or_partner_id`,
                label: `[${labelPrefix}member_or_partner_id]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'exception': utils.removeIfEmpty(BusinessAccessError.mapping(bundle, `${keyPrefix}exception`)),
            'member_or_partner_id': bundle.inputData?.[`${keyPrefix}member_or_partner_id`],
        }
    },
}
