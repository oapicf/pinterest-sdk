const utils = require('../utils/utils');
const OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows = require('../models/OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows.fields(`${keyPrefix}attribution_windows`, isInput),
            {
                key: `${keyPrefix}conversion_event`,
                label: `[${labelPrefix}conversion_event]`,
                type: 'string',
                choices: [
                    'PAGE_VISIT',
                    'SIGNUP',
                    'CHECKOUT',
                    'CUSTOM',
                    'VIEW_CATEGORY',
                    'SEARCH',
                    'ADD_TO_CART',
                    'WATCH_VIDEO',
                    'LEAD',
                    'APP_INSTALL',
                ],
            },
            {
                key: `${keyPrefix}conversion_tag_id`,
                label: `[${labelPrefix}conversion_tag_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}cpa_goal_value_in_micro_currency`,
                label: `[${labelPrefix}cpa_goal_value_in_micro_currency]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}is_roas_optimized`,
                label: `Ad group is ROAS optimized - [${labelPrefix}is_roas_optimized]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}learning_mode_type`,
                label: `Conversion learning model type - [${labelPrefix}learning_mode_type]`,
                type: 'string',
                choices: [
                    'NOT_ACTIVE',
                    'ACTIVE',
                    'null',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'attribution_windows': utils.removeIfEmpty(OptimizationGoalMetadata_conversion_tag_v3_goal_metadata_attribution_windows.mapping(bundle, `${keyPrefix}attribution_windows`)),
            'conversion_event': bundle.inputData?.[`${keyPrefix}conversion_event`],
            'conversion_tag_id': bundle.inputData?.[`${keyPrefix}conversion_tag_id`],
            'cpa_goal_value_in_micro_currency': bundle.inputData?.[`${keyPrefix}cpa_goal_value_in_micro_currency`],
            'is_roas_optimized': bundle.inputData?.[`${keyPrefix}is_roas_optimized`],
            'learning_mode_type': bundle.inputData?.[`${keyPrefix}learning_mode_type`],
        }
    },
}
