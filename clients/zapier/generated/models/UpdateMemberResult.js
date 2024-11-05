const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}business_role`,
                label: `The access level a member has to the business. Values are case-sensitive. <br> - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. <br> - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - [${labelPrefix}business_role]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}member_id`,
                label: `Unique identifier of the business member. - [${labelPrefix}member_id]`,
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
