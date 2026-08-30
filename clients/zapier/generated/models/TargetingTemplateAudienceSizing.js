const utils = require('../utils/utils');
const TargetingTemplateAudienceSizingReachEstimate = require('../models/TargetingTemplateAudienceSizingReachEstimate');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...TargetingTemplateAudienceSizingReachEstimate.fields(`${keyPrefix}reach_estimate`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'reach_estimate': utils.removeIfEmpty(TargetingTemplateAudienceSizingReachEstimate.mapping(bundle, `${keyPrefix}reach_estimate`)),
        }
    },
}
