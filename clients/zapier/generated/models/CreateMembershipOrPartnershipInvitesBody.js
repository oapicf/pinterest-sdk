const utils = require('../utils/utils');
const InviteType = require('../models/InviteType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}business_role`,
                label: `The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you. - [${labelPrefix}business_role]`,
                required: true,
                type: 'string',
                choices: [
                    'EMPLOYEE',
                    'BIZ_ADMIN',
                    'PARTNER',
                ],
            },
            {
                key: `${keyPrefix}invite_type`,
                ...InviteType.fields(`${keyPrefix}invite_type`, isInput),
            },
            {
                key: `${keyPrefix}members`,
                label: `A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE - [${labelPrefix}members]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}partners`,
                label: `A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST - [${labelPrefix}partners]`,
                list: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'business_role': bundle.inputData?.[`${keyPrefix}business_role`],
            'invite_type': bundle.inputData?.[`${keyPrefix}invite_type`],
            'members': bundle.inputData?.[`${keyPrefix}members`],
            'partners': bundle.inputData?.[`${keyPrefix}partners`],
        }
    },
}
