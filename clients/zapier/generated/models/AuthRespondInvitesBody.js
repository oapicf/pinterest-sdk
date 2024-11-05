const utils = require('../utils/utils');
const AuthRespondInvitesBody_invites_inner = require('../models/AuthRespondInvitesBody_invites_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}invites`,
                label: `[${labelPrefix}invites]`,
                children: AuthRespondInvitesBody_invites_inner.fields(`${keyPrefix}invites${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'invites': utils.childMapping(bundle.inputData?.[`${keyPrefix}invites`], `${keyPrefix}invites`, AuthRespondInvitesBody_invites_inner),
        }
    },
}
