const utils = require('../utils/utils');
const CancelInviteException = require('../models/CancelInviteException');
const CancelInviteResult = require('../models/CancelInviteResult');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...CancelInviteException.fields(`${keyPrefix}exception`, isInput),
            ...CancelInviteResult.fields(`${keyPrefix}invite`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'exception': utils.removeIfEmpty(CancelInviteException.mapping(bundle, `${keyPrefix}exception`)),
            'invite': utils.removeIfEmpty(CancelInviteResult.mapping(bundle, `${keyPrefix}invite`)),
        }
    },
}
