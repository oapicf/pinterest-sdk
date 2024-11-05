const utils = require('../utils/utils');
const BaseInviteDataResponse_invite_data = require('../models/BaseInviteDataResponse_invite_data');
const BusinessAccessUserSummary = require('../models/BusinessAccessUserSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}created_by_business_id`,
                label: `Unique identifier for the business that created the invite/request. - [${labelPrefix}created_by_business_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}created_by_user_id`,
                label: `Unique identifier for the user that created the invite/request. - [${labelPrefix}created_by_user_id]`,
                type: 'string',
            },
            ...BusinessAccessUserSummary.fields(`${keyPrefix}user`, isInput),
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
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'created_by_business_id': bundle.inputData?.[`${keyPrefix}created_by_business_id`],
            'created_by_user_id': bundle.inputData?.[`${keyPrefix}created_by_user_id`],
            'user': utils.removeIfEmpty(BusinessAccessUserSummary.mapping(bundle, `${keyPrefix}user`)),
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'invite_data': utils.removeIfEmpty(BaseInviteDataResponse_invite_data.mapping(bundle, `${keyPrefix}invite_data`)),
            'is_received_invite': bundle.inputData?.[`${keyPrefix}is_received_invite`],
        }
    },
}
