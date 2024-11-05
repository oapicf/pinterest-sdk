const utils = require('../utils/utils');
const InviteBusinessRoleBinding = require('../models/InviteBusinessRoleBinding');
const InviteExceptionResponse = require('../models/InviteExceptionResponse');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...InviteExceptionResponse.fields(`${keyPrefix}exception`, isInput),
            ...InviteBusinessRoleBinding.fields(`${keyPrefix}invite`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'exception': utils.removeIfEmpty(InviteExceptionResponse.mapping(bundle, `${keyPrefix}exception`)),
            'invite': utils.removeIfEmpty(InviteBusinessRoleBinding.mapping(bundle, `${keyPrefix}invite`)),
        }
    },
}
