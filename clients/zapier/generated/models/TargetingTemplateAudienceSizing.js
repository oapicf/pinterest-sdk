const utils = require('../utils/utils');
const TargetingTemplateAudienceSizing_reach_estimate = require('../models/TargetingTemplateAudienceSizing_reach_estimate');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...TargetingTemplateAudienceSizing_reach_estimate.fields(`${keyPrefix}reach_estimate`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'reach_estimate': utils.removeIfEmpty(TargetingTemplateAudienceSizing_reach_estimate.mapping(bundle, `${keyPrefix}reach_estimate`)),
        }
    },
}
