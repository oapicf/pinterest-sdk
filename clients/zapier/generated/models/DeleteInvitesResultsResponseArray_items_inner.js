const utils = require('../utils/utils');
const BaseInviteDataResponse = require('../models/BaseInviteDataResponse');
const DeleteInvitesResultsResponseArray_items_inner_exception = require('../models/DeleteInvitesResultsResponseArray_items_inner_exception');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...DeleteInvitesResultsResponseArray_items_inner_exception.fields(`${keyPrefix}exception`, isInput),
            ...BaseInviteDataResponse.fields(`${keyPrefix}invite`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'exception': utils.removeIfEmpty(DeleteInvitesResultsResponseArray_items_inner_exception.mapping(bundle, `${keyPrefix}exception`)),
            'invite': utils.removeIfEmpty(BaseInviteDataResponse.mapping(bundle, `${keyPrefix}invite`)),
        }
    },
}
