const utils = require('../utils/utils');
const BaseInviteDataResponse = require('../models/BaseInviteDataResponse');
const InviteExceptionResponse = require('../models/InviteExceptionResponse');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...InviteExceptionResponse.fields(`${keyPrefix}exception`, isInput),
            ...BaseInviteDataResponse.fields(`${keyPrefix}invite`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'exception': utils.removeIfEmpty(InviteExceptionResponse.mapping(bundle, `${keyPrefix}exception`)),
            'invite': utils.removeIfEmpty(BaseInviteDataResponse.mapping(bundle, `${keyPrefix}invite`)),
        }
    },
}
