const utils = require('../utils/utils');
const BusinessAccessUserSummary = require('../models/BusinessAccessUserSummary');
const InviteDataResponse = require('../models/InviteDataResponse');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Unique identifier of the invite/request. - [${labelPrefix}id]`,
                type: 'string',
            },
            ...InviteDataResponse.fields(`${keyPrefix}invite_data`, isInput),
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
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'invite_data': utils.removeIfEmpty(InviteDataResponse.mapping(bundle, `${keyPrefix}invite_data`)),
            'is_received_invite': bundle.inputData?.[`${keyPrefix}is_received_invite`],
            'user': utils.removeIfEmpty(BusinessAccessUserSummary.mapping(bundle, `${keyPrefix}user`)),
        }
    },
}
