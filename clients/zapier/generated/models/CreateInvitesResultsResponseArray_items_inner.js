const utils = require('../utils/utils');
const CreateInvitesResultsResponseArray_items_inner_invite = require('../models/CreateInvitesResultsResponseArray_items_inner_invite');
const InviteExceptionResponse = require('../models/InviteExceptionResponse');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...InviteExceptionResponse.fields(`${keyPrefix}exception`, isInput),
            ...CreateInvitesResultsResponseArray_items_inner_invite.fields(`${keyPrefix}invite`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'exception': utils.removeIfEmpty(InviteExceptionResponse.mapping(bundle, `${keyPrefix}exception`)),
            'invite': utils.removeIfEmpty(CreateInvitesResultsResponseArray_items_inner_invite.mapping(bundle, `${keyPrefix}invite`)),
        }
    },
}
