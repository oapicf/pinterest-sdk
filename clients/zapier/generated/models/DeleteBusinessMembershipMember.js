const utils = require('../utils/utils');
const BusinessRoleForMembers = require('../models/BusinessRoleForMembers');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}business_role`,
                ...BusinessRoleForMembers.fields(`${keyPrefix}business_role`, isInput),
            },
            {
                key: `${keyPrefix}member_id`,
                label: `Unique identifier of the member - [${labelPrefix}member_id]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'business_role': bundle.inputData?.[`${keyPrefix}business_role`],
            'member_id': bundle.inputData?.[`${keyPrefix}member_id`],
        }
    },
}
