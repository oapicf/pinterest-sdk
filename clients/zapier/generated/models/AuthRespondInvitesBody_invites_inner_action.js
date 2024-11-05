const utils = require('../utils/utils');
const Permissions = require('../models/Permissions');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}accept_invite`,
                label: `Whether the invite/request is accepted. - [${labelPrefix}accept_invite]`,
                required: true,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}asset_id_to_permissions`,
                label: `An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.  - [${labelPrefix}asset_id_to_permissions]`,
                type: 'object',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'accept_invite': bundle.inputData?.[`${keyPrefix}accept_invite`],
            'asset_id_to_permissions': bundle.inputData?.[`${keyPrefix}asset_id_to_permissions`],
        }
    },
}
