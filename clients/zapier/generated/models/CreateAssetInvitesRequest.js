const utils = require('../utils/utils');
const CreateAssetInvitesRequestItem = require('../models/CreateAssetInvitesRequestItem');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}invites`,
                label: `[${labelPrefix}invites]`,
                children: CreateAssetInvitesRequestItem.fields(`${keyPrefix}invites${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'invites': utils.childMapping(bundle.inputData?.[`${keyPrefix}invites`], `${keyPrefix}invites`, CreateAssetInvitesRequestItem),
        }
    },
}
