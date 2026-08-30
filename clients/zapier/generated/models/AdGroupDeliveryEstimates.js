const utils = require('../utils/utils');
const AdGroupAudienceSizingCreativeTypes = require('../models/AdGroupAudienceSizingCreativeTypes');
const AdGroupDeliveryEstimatesKeywordsItems = require('../models/AdGroupDeliveryEstimatesKeywordsItems');
const OptimizationGoalMetadata = require('../models/OptimizationGoalMetadata');
const OptimizationType = require('../models/OptimizationType');
const PlacementGroupType = require('../models/PlacementGroupType');
const TargetingSpecOptimal = require('../models/TargetingSpecOptimal');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}auto_targeting_enabled`,
                label: `[${labelPrefix}auto_targeting_enabled]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}creative_types`,
                list: true,
                type: 'string',
                ...AdGroupAudienceSizingCreativeTypes.fields(`${keyPrefix}creative_types`, isInput),
            },
            {
                key: `${keyPrefix}keywords`,
                label: `[${labelPrefix}keywords]`,
                children: AdGroupDeliveryEstimatesKeywordsItems.fields(`${keyPrefix}keywords${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}monthly_frequency_cap`,
                label: `Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. - [${labelPrefix}monthly_frequency_cap]`,
                type: 'integer',
            },
            ...OptimizationGoalMetadata.fields(`${keyPrefix}optimization_goal_metadata`, isInput),
            {
                key: `${keyPrefix}optimization_type`,
                ...OptimizationType.fields(`${keyPrefix}optimization_type`, isInput),
            },
            {
                key: `${keyPrefix}placement_group`,
                ...PlacementGroupType.fields(`${keyPrefix}placement_group`, isInput),
            },
            {
                key: `${keyPrefix}product_group_ids`,
                label: `[Targeted product group IDs](/docs/redoc/#section/AdGroup-Audience-Sizing) **Note:** This can only be combined with shopping/catalog sales campaigns. - [${labelPrefix}product_group_ids]`,
                list: true,
                type: 'string',
            },
            ...TargetingSpecOptimal.fields(`${keyPrefix}targeting_spec`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'auto_targeting_enabled': bundle.inputData?.[`${keyPrefix}auto_targeting_enabled`],
            'creative_types': utils.childMapping(bundle.inputData?.[`${keyPrefix}creative_types`], `${keyPrefix}creative_types`, AdGroupAudienceSizingCreativeTypes),
            'keywords': utils.childMapping(bundle.inputData?.[`${keyPrefix}keywords`], `${keyPrefix}keywords`, AdGroupDeliveryEstimatesKeywordsItems),
            'monthly_frequency_cap': bundle.inputData?.[`${keyPrefix}monthly_frequency_cap`],
            'optimization_goal_metadata': utils.removeIfEmpty(OptimizationGoalMetadata.mapping(bundle, `${keyPrefix}optimization_goal_metadata`)),
            'optimization_type': bundle.inputData?.[`${keyPrefix}optimization_type`],
            'placement_group': bundle.inputData?.[`${keyPrefix}placement_group`],
            'product_group_ids': bundle.inputData?.[`${keyPrefix}product_group_ids`],
            'targeting_spec': utils.removeIfEmpty(TargetingSpecOptimal.mapping(bundle, `${keyPrefix}targeting_spec`)),
        }
    },
}
