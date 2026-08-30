const utils = require('../utils/utils');
const AuthRespondInvitesBodyItem = require('../models/AuthRespondInvitesBodyItem');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}invites`,
                label: `[${labelPrefix}invites]`,
                children: AuthRespondInvitesBodyItem.fields(`${keyPrefix}invites${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'invites': utils.childMapping(bundle.inputData?.[`${keyPrefix}invites`], `${keyPrefix}invites`, AuthRespondInvitesBodyItem),
        }
    },
}
