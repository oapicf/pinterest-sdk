const utils = require('../utils/utils');
const BaseInviteDataResponse_invite_data = require('../models/BaseInviteDataResponse_invite_data');
const BusinessAccessUserSummary = require('../models/BusinessAccessUserSummary');
const InviteAssetsSummary = require('../models/InviteAssetsSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...InviteAssetsSummary.fields(`${keyPrefix}assets_summary`, isInput),
            {
                key: `${keyPrefix}business_roles`,
                label: `The access level a user would be granted on the business if the invite/request is accepted. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. - [${labelPrefix}business_roles]`,
                list: true,
                type: 'string',
            },
            ...BusinessAccessUserSummary.fields(`${keyPrefix}created_by_business`, isInput),
            ...BusinessAccessUserSummary.fields(`${keyPrefix}created_by_user`, isInput),
            {
                key: `${keyPrefix}created_time`,
                label: `The time the invite/request was created. Returned in milliseconds. - [${labelPrefix}created_time]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}id`,
                label: `Unique identifier of the invite/request. - [${labelPrefix}id]`,
                type: 'string',
            },
            ...BaseInviteDataResponse_invite_data.fields(`${keyPrefix}invite_data`, isInput),
            {
                key: `${keyPrefix}is_received_invite`,
                label: `Indicates whether the invite/request was received. - [${labelPrefix}is_received_invite]`,
                type: 'boolean',
            },
            ...BusinessAccessUserSummary.fields(`${keyPrefix}user`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'assets_summary': utils.removeIfEmpty(InviteAssetsSummary.mapping(bundle, `${keyPrefix}assets_summary`)),
            'business_roles': bundle.inputData?.[`${keyPrefix}business_roles`],
            'created_by_business': utils.removeIfEmpty(BusinessAccessUserSummary.mapping(bundle, `${keyPrefix}created_by_business`)),
            'created_by_user': utils.removeIfEmpty(BusinessAccessUserSummary.mapping(bundle, `${keyPrefix}created_by_user`)),
            'created_time': bundle.inputData?.[`${keyPrefix}created_time`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'invite_data': utils.removeIfEmpty(BaseInviteDataResponse_invite_data.mapping(bundle, `${keyPrefix}invite_data`)),
            'is_received_invite': bundle.inputData?.[`${keyPrefix}is_received_invite`],
            'user': utils.removeIfEmpty(BusinessAccessUserSummary.mapping(bundle, `${keyPrefix}user`)),
        }
    },
}
