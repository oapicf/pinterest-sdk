const utils = require('../utils/utils');
const AuthRespondInviteAction = require('../models/AuthRespondInviteAction');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...AuthRespondInviteAction.fields(`${keyPrefix}action`, isInput),
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
            'action': utils.removeIfEmpty(AuthRespondInviteAction.mapping(bundle, `${keyPrefix}action`)),
            'invite_id': bundle.inputData?.[`${keyPrefix}invite_id`],
        }
    },
}
