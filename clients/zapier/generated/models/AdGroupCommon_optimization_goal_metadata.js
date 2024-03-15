const utils = require('../utils/utils');
const OptimizationGoalMetadata_conversion_tag_v3_goal_metadata = require('../models/OptimizationGoalMetadata_conversion_tag_v3_goal_metadata');
const OptimizationGoalMetadata_frequency_goal_metadata = require('../models/OptimizationGoalMetadata_frequency_goal_metadata');
const OptimizationGoalMetadata_scrollup_goal_metadata = require('../models/OptimizationGoalMetadata_scrollup_goal_metadata');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...OptimizationGoalMetadata_conversion_tag_v3_goal_metadata.fields(`${keyPrefix}conversion_tag_v3_goal_metadata`, isInput),
            ...OptimizationGoalMetadata_frequency_goal_metadata.fields(`${keyPrefix}frequency_goal_metadata`, isInput),
            ...OptimizationGoalMetadata_scrollup_goal_metadata.fields(`${keyPrefix}scrollup_goal_metadata`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'conversion_tag_v3_goal_metadata': utils.removeIfEmpty(OptimizationGoalMetadata_conversion_tag_v3_goal_metadata.mapping(bundle, `${keyPrefix}conversion_tag_v3_goal_metadata`)),
            'frequency_goal_metadata': utils.removeIfEmpty(OptimizationGoalMetadata_frequency_goal_metadata.mapping(bundle, `${keyPrefix}frequency_goal_metadata`)),
            'scrollup_goal_metadata': utils.removeIfEmpty(OptimizationGoalMetadata_scrollup_goal_metadata.mapping(bundle, `${keyPrefix}scrollup_goal_metadata`)),
        }
    },
}
