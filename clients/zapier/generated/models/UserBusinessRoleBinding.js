const utils = require('../utils/utils');
const BusinessAccessUserSummary = require('../models/BusinessAccessUserSummary');
const BusinessMemberAssetsSummary = require('../models/BusinessMemberAssetsSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...BusinessMemberAssetsSummary.fields(`${keyPrefix}assets_summary`, isInput),
            {
                key: `${keyPrefix}business_roles`,
                label: `The access level a user has on the business. This can be EMPLOYEE, BIZ_ADMIN, or PARTNER. - [${labelPrefix}business_roles]`,
                list: true,
                type: 'string',
            },
            ...BusinessAccessUserSummary.fields(`${keyPrefix}created_by_business`, isInput),
            ...BusinessAccessUserSummary.fields(`${keyPrefix}created_by_user`, isInput),
            {
                key: `${keyPrefix}created_time`,
                label: `The time the business relationship was created. Returned in milliseconds. - [${labelPrefix}created_time]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}id`,
                label: `Unique identifier of the business member/business partner/employer. - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}is_shared_partner`,
                label: `This field is only relevant when business_role=\"PARTNER\". <br>If is_shared_partner=FALSE, the partner can access your business assets. If assets_summary is not empty, the assets listed are your business assets the partner has access to. <br>If is_shared_partner=TRUE, you can access the partner's business asset. If assets_summary is not empty, the assets listed are the partner's business assets you have access to. - [${labelPrefix}is_shared_partner]`,
                type: 'boolean',
            },
            ...BusinessAccessUserSummary.fields(`${keyPrefix}user`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'assets_summary': utils.removeIfEmpty(BusinessMemberAssetsSummary.mapping(bundle, `${keyPrefix}assets_summary`)),
            'business_roles': bundle.inputData?.[`${keyPrefix}business_roles`],
            'created_by_business': utils.removeIfEmpty(BusinessAccessUserSummary.mapping(bundle, `${keyPrefix}created_by_business`)),
            'created_by_user': utils.removeIfEmpty(BusinessAccessUserSummary.mapping(bundle, `${keyPrefix}created_by_user`)),
            'created_time': bundle.inputData?.[`${keyPrefix}created_time`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'is_shared_partner': bundle.inputData?.[`${keyPrefix}is_shared_partner`],
            'user': utils.removeIfEmpty(BusinessAccessUserSummary.mapping(bundle, `${keyPrefix}user`)),
        }
    },
}
