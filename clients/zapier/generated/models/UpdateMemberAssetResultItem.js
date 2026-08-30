const utils = require('../utils/utils');
const UsersForIndividualAssetResponse = require('../models/UsersForIndividualAssetResponse');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...UsersForIndividualAssetResponse.fields(`${keyPrefix}response`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'response': utils.removeIfEmpty(UsersForIndividualAssetResponse.mapping(bundle, `${keyPrefix}response`)),
        }
    },
}
