const utils = require('../utils/utils');
const ConversionDeletionRequestTargets = require('../models/ConversionDeletionRequestTargets');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...ConversionDeletionRequestTargets.fields(`${keyPrefix}deletion_targets`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'deletion_targets': utils.removeIfEmpty(ConversionDeletionRequestTargets.mapping(bundle, `${keyPrefix}deletion_targets`)),
        }
    },
}
