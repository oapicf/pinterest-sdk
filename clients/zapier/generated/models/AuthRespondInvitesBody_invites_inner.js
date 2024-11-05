const utils = require('../utils/utils');
const AuthRespondInvitesBody_invites_inner_action = require('../models/AuthRespondInvitesBody_invites_inner_action');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...AuthRespondInvitesBody_invites_inner_action.fields(`${keyPrefix}action`, isInput),
            {
                key: `${keyPrefix}invite_id`,
                label: `Unique identifier of an invite. - [${labelPrefix}invite_id]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'action': utils.removeIfEmpty(AuthRespondInvitesBody_invites_inner_action.mapping(bundle, `${keyPrefix}action`)),
            'invite_id': bundle.inputData?.[`${keyPrefix}invite_id`],
        }
    },
}
