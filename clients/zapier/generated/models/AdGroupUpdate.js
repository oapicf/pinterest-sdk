const utils = require('../utils/utils');
const ActionType = require('../models/ActionType');
const AdGroupTrackingURLs = require('../models/AdGroupTrackingURLs');
const AdgroupTrackingFeatures = require('../models/AdgroupTrackingFeatures');
const AnyType = require('../models/AnyType');
const BidStrategyType = require('../models/BidStrategyType');
const BudgetType = require('../models/BudgetType');
const ConversionLearningModeType = require('../models/ConversionLearningModeType');
const EntityStatus = require('../models/EntityStatus');
const NullableOptimizationGoalMetadata = require('../models/NullableOptimizationGoalMetadata');
const PacingDeliveryType = require('../models/PacingDeliveryType');
const PerformancePlusCampaignSettings = require('../models/PerformancePlusCampaignSettings');
const PlacementGroupType = require('../models/PlacementGroupType');
const PlacementTrafficType = require('../models/PlacementTrafficType');
const PromotionApplicationLevel = require('../models/PromotionApplicationLevel');
const SummaryStatus = require('../models/SummaryStatus');
const TargetingSpecOptimal = require('../models/TargetingSpecOptimal');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}ad_account_id`,
                label: `Advertiser ID. - [${labelPrefix}ad_account_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}bid_in_micro_currency`,
                label: `Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. - [${labelPrefix}bid_in_micro_currency]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}bid_strategy_type`,
                ...BidStrategyType.fields(`${keyPrefix}bid_strategy_type`, isInput),
            },
            {
                key: `${keyPrefix}billable_event`,
                ...ActionType.fields(`${keyPrefix}billable_event`, isInput),
            },
            {
                key: `${keyPrefix}budget_in_micro_currency`,
                label: `Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. - [${labelPrefix}budget_in_micro_currency]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}campaign_id`,
                label: `Campaign ID of the ad group. - [${labelPrefix}campaign_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}conversion_learning_mode_type`,
                ...ConversionLearningModeType.fields(`${keyPrefix}conversion_learning_mode_type`, isInput),
            },
            {
                key: `${keyPrefix}created_time`,
                label: `Ad group creation time. Unix timestamp in seconds. - [${labelPrefix}created_time]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}customer_segment_id`,
                label: `Customer segment ID applied to the ad group. We currently only support 1 customer segment per ad group. To use customer segments, do not set the `targeting_template_ids` field as well as the `AUDIENCE_INCLUDE` field of the `targeting_spec`. To clear the customer segment ID, set this field to '0'. - [${labelPrefix}customer_segment_id]`,
                type: 'string',
            },
            ....fields(`${keyPrefix}dca_assets`, isInput),
            {
                key: `${keyPrefix}end_time`,
                label: `Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about [scheduling ads](https://help.pinterest.com/en/business/article/ads-manager-schedule-ads).  For certain organizations ([Closed beta](https://help.pinterest.com/en/business/article/beta-features)): Supported for campaigns with Campaign Budget Optimization (CBO).  For all organizations: Supported for campaigns without CBO. - [${labelPrefix}end_time]`,
                type: 'integer',
            },
            ...AdgroupTrackingFeatures.fields(`${keyPrefix}ext_features`, isInput),
            {
                key: `${keyPrefix}feed_profile_id`,
                label: `Feed Profile ID associated to the adgroup. - [${labelPrefix}feed_profile_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}id`,
                label: `Ad group ID. - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}is_creative_optimization`,
                label: `Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale. - [${labelPrefix}is_creative_optimization]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}is_local_inventory`,
                label: `Indicates whether the ad group should use the local inventory. - [${labelPrefix}is_local_inventory]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}lifetime_frequency_cap`,
                label: `Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION [billable_event](https://help.pinterest.com/en/business/article/billable-events) value. This field **REQUIRES** the `end_time` field. - [${labelPrefix}lifetime_frequency_cap]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}local_inventory_radius_in_miles`,
                label: `The targeting radius of the local inventory ads in miles. - [${labelPrefix}local_inventory_radius_in_miles]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}name`,
                label: `Ad group name. - [${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            ...NullableOptimizationGoalMetadata.fields(`${keyPrefix}optimization_goal_metadata`, isInput),
            ...PerformancePlusCampaignSettings.fields(`${keyPrefix}performance_plus_campaign_settings`, isInput),
            {
                key: `${keyPrefix}placement_group`,
                ...PlacementGroupType.fields(`${keyPrefix}placement_group`, isInput),
            },
            {
                key: `${keyPrefix}placement_traffic_type`,
                ...PlacementTrafficType.fields(`${keyPrefix}placement_traffic_type`, isInput),
            },
            {
                key: `${keyPrefix}promotion_application_level`,
                ...PromotionApplicationLevel.fields(`${keyPrefix}promotion_application_level`, isInput),
            },
            {
                key: `${keyPrefix}promotion_id`,
                label: `Promotion ID. To clear this field, set to null. - [${labelPrefix}promotion_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}promotion_ids`,
                label: `Promotion IDs list. To clear this field, set to an empty array []. - [${labelPrefix}promotion_ids]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}start_time`,
                label: `Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about [scheduling ads](/docs/api-features/managing-ads/#step-2-create-an-ad-group). For certain organizations ([Closed beta](/docs/getting-started/using-beta-and-restricted-features/)): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO. - [${labelPrefix}start_time]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}status`,
                ...EntityStatus.fields(`${keyPrefix}status`, isInput),
            },
            {
                key: `${keyPrefix}summary_status`,
                ...SummaryStatus.fields(`${keyPrefix}summary_status`, isInput),
            },
            ...TargetingSpecOptimal.fields(`${keyPrefix}targeting_spec`, isInput),
            {
                key: `${keyPrefix}targeting_template_ids`,
                label: `Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0']. - [${labelPrefix}targeting_template_ids]`,
                list: true,
                type: 'string',
            },
            ...AdGroupTrackingURLs.fields(`${keyPrefix}tracking_urls`, isInput),
            {
                key: `${keyPrefix}type`,
                label: `Always \"adgroup\". - [${labelPrefix}type]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}updated_time`,
                label: `Ad group last update time. Unix timestamp in seconds. - [${labelPrefix}updated_time]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}auto_targeting_enabled`,
                label: `Enable auto-targeting for ad group. Default value is True. Also known as [\"Performance+ targeting\"](https://help.pinterest.com/en/business/article/performance-plus-targeting). - [${labelPrefix}auto_targeting_enabled]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}bid_multiplier`,
                label: `[Open beta](https://help.pinterest.com/en/business/article/beta-features) Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Not currently supported for [Performance+ campaigns](https://help.pinterest.com/en/business/article/performance-plus-campaigns). - [${labelPrefix}bid_multiplier]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}budget_type`,
                ...BudgetType.fields(`${keyPrefix}budget_type`, isInput),
            },
            {
                key: `${keyPrefix}pacing_delivery_type`,
                ...PacingDeliveryType.fields(`${keyPrefix}pacing_delivery_type`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ad_account_id': bundle.inputData?.[`${keyPrefix}ad_account_id`],
            'bid_in_micro_currency': bundle.inputData?.[`${keyPrefix}bid_in_micro_currency`],
            'bid_strategy_type': bundle.inputData?.[`${keyPrefix}bid_strategy_type`],
            'billable_event': bundle.inputData?.[`${keyPrefix}billable_event`],
            'budget_in_micro_currency': bundle.inputData?.[`${keyPrefix}budget_in_micro_currency`],
            'campaign_id': bundle.inputData?.[`${keyPrefix}campaign_id`],
            'conversion_learning_mode_type': bundle.inputData?.[`${keyPrefix}conversion_learning_mode_type`],
            'created_time': bundle.inputData?.[`${keyPrefix}created_time`],
            'customer_segment_id': bundle.inputData?.[`${keyPrefix}customer_segment_id`],
            'dca_assets': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}dca_assets`)),
            'end_time': bundle.inputData?.[`${keyPrefix}end_time`],
            'ext_features': utils.removeIfEmpty(AdgroupTrackingFeatures.mapping(bundle, `${keyPrefix}ext_features`)),
            'feed_profile_id': bundle.inputData?.[`${keyPrefix}feed_profile_id`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'is_creative_optimization': bundle.inputData?.[`${keyPrefix}is_creative_optimization`],
            'is_local_inventory': bundle.inputData?.[`${keyPrefix}is_local_inventory`],
            'lifetime_frequency_cap': bundle.inputData?.[`${keyPrefix}lifetime_frequency_cap`],
            'local_inventory_radius_in_miles': bundle.inputData?.[`${keyPrefix}local_inventory_radius_in_miles`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'optimization_goal_metadata': utils.removeIfEmpty(NullableOptimizationGoalMetadata.mapping(bundle, `${keyPrefix}optimization_goal_metadata`)),
            'performance_plus_campaign_settings': utils.removeIfEmpty(PerformancePlusCampaignSettings.mapping(bundle, `${keyPrefix}performance_plus_campaign_settings`)),
            'placement_group': bundle.inputData?.[`${keyPrefix}placement_group`],
            'placement_traffic_type': bundle.inputData?.[`${keyPrefix}placement_traffic_type`],
            'promotion_application_level': bundle.inputData?.[`${keyPrefix}promotion_application_level`],
            'promotion_id': bundle.inputData?.[`${keyPrefix}promotion_id`],
            'promotion_ids': bundle.inputData?.[`${keyPrefix}promotion_ids`],
            'start_time': bundle.inputData?.[`${keyPrefix}start_time`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'summary_status': bundle.inputData?.[`${keyPrefix}summary_status`],
            'targeting_spec': utils.removeIfEmpty(TargetingSpecOptimal.mapping(bundle, `${keyPrefix}targeting_spec`)),
            'targeting_template_ids': bundle.inputData?.[`${keyPrefix}targeting_template_ids`],
            'tracking_urls': utils.removeIfEmpty(AdGroupTrackingURLs.mapping(bundle, `${keyPrefix}tracking_urls`)),
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'updated_time': bundle.inputData?.[`${keyPrefix}updated_time`],
            'auto_targeting_enabled': bundle.inputData?.[`${keyPrefix}auto_targeting_enabled`],
            'bid_multiplier': bundle.inputData?.[`${keyPrefix}bid_multiplier`],
            'budget_type': bundle.inputData?.[`${keyPrefix}budget_type`],
            'pacing_delivery_type': bundle.inputData?.[`${keyPrefix}pacing_delivery_type`],
        }
    },
}
