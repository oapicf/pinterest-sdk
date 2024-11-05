const utils = require('../utils/utils');
const InviteType = require('../models/InviteType');
const Permissions = require('../models/Permissions');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}invite_id`,
                label: `Unique identifier of an invite. - [${labelPrefix}invite_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}invite_type`,
                ...InviteType.fields(`${keyPrefix}invite_type`, isInput),
            },
            {
                key: `${keyPrefix}asset_id_to_permissions`,
                label: `An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.  - [${labelPrefix}asset_id_to_permissions]`,
                required: true,
                type: 'object',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'invite_id': bundle.inputData?.[`${keyPrefix}invite_id`],
            'invite_type': bundle.inputData?.[`${keyPrefix}invite_type`],
            'asset_id_to_permissions': bundle.inputData?.[`${keyPrefix}asset_id_to_permissions`],
        }
    },
}
