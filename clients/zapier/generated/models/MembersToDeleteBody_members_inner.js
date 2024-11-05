const utils = require('../utils/utils');
const BusinessRoleForMembers = require('../models/BusinessRoleForMembers');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}member_id`,
                label: `Unique identifier of the member - [${labelPrefix}member_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}business_role`,
                ...BusinessRoleForMembers.fields(`${keyPrefix}business_role`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'member_id': bundle.inputData?.[`${keyPrefix}member_id`],
            'business_role': bundle.inputData?.[`${keyPrefix}business_role`],
        }
    },
}
