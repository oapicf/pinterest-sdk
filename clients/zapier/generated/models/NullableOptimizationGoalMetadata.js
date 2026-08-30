const utils = require('../utils/utils');
const ConversionTagV3GoalMetadata = require('../models/ConversionTagV3GoalMetadata');
const FrequencyGoalMetadata = require('../models/FrequencyGoalMetadata');
const ScrollupGoalMetadata = require('../models/ScrollupGoalMetadata');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...ConversionTagV3GoalMetadata.fields(`${keyPrefix}conversion_tag_v3_goal_metadata`, isInput),
            ...FrequencyGoalMetadata.fields(`${keyPrefix}frequency_goal_metadata`, isInput),
            ...ScrollupGoalMetadata.fields(`${keyPrefix}scrollup_goal_metadata`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'conversion_tag_v3_goal_metadata': utils.removeIfEmpty(ConversionTagV3GoalMetadata.mapping(bundle, `${keyPrefix}conversion_tag_v3_goal_metadata`)),
            'frequency_goal_metadata': utils.removeIfEmpty(FrequencyGoalMetadata.mapping(bundle, `${keyPrefix}frequency_goal_metadata`)),
            'scrollup_goal_metadata': utils.removeIfEmpty(ScrollupGoalMetadata.mapping(bundle, `${keyPrefix}scrollup_goal_metadata`)),
        }
    },
}
