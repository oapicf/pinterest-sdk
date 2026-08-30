const utils = require('../utils/utils');
const BusinessRoleForInvite = require('../models/BusinessRoleForInvite');
const InviteType = require('../models/InviteType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}business_role`,
                ...BusinessRoleForInvite.fields(`${keyPrefix}business_role`, isInput),
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
