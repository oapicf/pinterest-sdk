const utils = require('../utils/utils');
const ActionType = require('../models/ActionType');
const BudgetType = require('../models/BudgetType');
const EntityStatus = require('../models/EntityStatus');
const OptimizationGoalMetadata = require('../models/OptimizationGoalMetadata');
const PacingDeliveryType = require('../models/PacingDeliveryType');
const PlacementGroupType = require('../models/PlacementGroupType');
const TargetingSpec = require('../models/TargetingSpec');
const TrackingUrls = require('../models/TrackingUrls');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}auto_targeting_enabled`,
                label: `Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>. - [${labelPrefix}auto_targeting_enabled]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}bid_in_micro_currency`,
                label: `Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH. - [${labelPrefix}bid_in_micro_currency]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}bid_strategy_type`,
                label: `Bid strategy type. For Campaigns with Video Completion objectives, the only supported bid strategy type is AUTOMATIC_BID, also known as \"Pinterest Performance+ bidding\". - [${labelPrefix}bid_strategy_type]`,
                type: 'string',
                choices: [
                    'AUTOMATIC_BID',
                    'MAX_BID',
                    'TARGET_AVG',
                ],
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
                key: `${keyPrefix}budget_type`,
                ...BudgetType.fields(`${keyPrefix}budget_type`, isInput),
            },
            {
                key: `${keyPrefix}campaign_id`,
                label: `Campaign ID of the ad group. - [${labelPrefix}campaign_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}end_time`,
                label: `Timestamp in Unix format for scheduling when ads in the ad group stop appearing. If not specified, ads run indefinitely unless you update the ad group by changing their status to `paused`. Cannot occur after `end_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO. - [${labelPrefix}end_time]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}is_creative_optimization`,
                label: `Enable creative optimization for the ad group, default value is FALSE. When enabled, you allow Pinterest to automatically turn your product Pins into ads in different formats (collections and shopping) and deliver those ads to users at scale. - [${labelPrefix}is_creative_optimization]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}lifetime_frequency_cap`,
                label: `Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field. - [${labelPrefix}lifetime_frequency_cap]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}name`,
                label: `Ad group name. - [${labelPrefix}name]`,
                type: 'string',
            },
            ...OptimizationGoalMetadata.fields(`${keyPrefix}optimization_goal_metadata`, isInput),
            {
                key: `${keyPrefix}pacing_delivery_type`,
                ...PacingDeliveryType.fields(`${keyPrefix}pacing_delivery_type`, isInput),
            },
            {
                key: `${keyPrefix}placement_group`,
                ...PlacementGroupType.fields(`${keyPrefix}placement_group`, isInput),
            },
            {
                key: `${keyPrefix}promotion_application_level`,
                label: `Specify if the promotion is applied at ad group or item level - [${labelPrefix}promotion_application_level]`,
                type: 'string',
                choices: [
                    'NONE',
                    'ITEM',
                    'AD_GROUP',
                ],
            },
            {
                key: `${keyPrefix}promotion_id`,
                label: `Promotion ID. To clear this field, set to null. - [${labelPrefix}promotion_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}start_time`,
                label: `Timestamp in Unix format for scheduling when ads in the ad group start to appear. If not specified, ads appear during parent campaign's `start_time`. Cannot precede `start_time` for parent campaign (if specified). Learn about <a href=\"/docs/api-features/managing-ads/#step-2-create-an-ad-group\" target=\"blank\">scheduling ads</a>. For certain organizations (<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Closed beta</a>): Supported for campaigns with Campaign Budget Optimization (CBO). For all organizations: Supported for campaigns without CBO. - [${labelPrefix}start_time]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}status`,
                ...EntityStatus.fields(`${keyPrefix}status`, isInput),
            },
            ...TargetingSpec.fields(`${keyPrefix}targeting_spec`, isInput),
            {
                key: `${keyPrefix}targeting_template_ids`,
                label: `Targeting template IDs applied to the ad group. We currently only support 1 targeting template per ad group. To use targeting templates, do not set any other targeting fields: targeting_spec, tracking_urls, auto_targeting_enabled, placement_group. To clear all targeting template IDs, set this field to ['0']. - [${labelPrefix}targeting_template_ids]`,
                list: true,
                type: 'string',
            },
            ...TrackingUrls.fields(`${keyPrefix}tracking_urls`, isInput),
            {
                key: `${keyPrefix}bid_multiplier`,
                label: `<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>. - [${labelPrefix}bid_multiplier]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}id`,
                label: `Ad group ID. - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'auto_targeting_enabled': bundle.inputData?.[`${keyPrefix}auto_targeting_enabled`],
            'bid_in_micro_currency': bundle.inputData?.[`${keyPrefix}bid_in_micro_currency`],
            'bid_strategy_type': bundle.inputData?.[`${keyPrefix}bid_strategy_type`],
            'billable_event': bundle.inputData?.[`${keyPrefix}billable_event`],
            'budget_in_micro_currency': bundle.inputData?.[`${keyPrefix}budget_in_micro_currency`],
            'budget_type': bundle.inputData?.[`${keyPrefix}budget_type`],
            'campaign_id': bundle.inputData?.[`${keyPrefix}campaign_id`],
            'end_time': bundle.inputData?.[`${keyPrefix}end_time`],
            'is_creative_optimization': bundle.inputData?.[`${keyPrefix}is_creative_optimization`],
            'lifetime_frequency_cap': bundle.inputData?.[`${keyPrefix}lifetime_frequency_cap`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'optimization_goal_metadata': utils.removeIfEmpty(OptimizationGoalMetadata.mapping(bundle, `${keyPrefix}optimization_goal_metadata`)),
            'pacing_delivery_type': bundle.inputData?.[`${keyPrefix}pacing_delivery_type`],
            'placement_group': bundle.inputData?.[`${keyPrefix}placement_group`],
            'promotion_application_level': bundle.inputData?.[`${keyPrefix}promotion_application_level`],
            'promotion_id': bundle.inputData?.[`${keyPrefix}promotion_id`],
            'start_time': bundle.inputData?.[`${keyPrefix}start_time`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'targeting_spec': utils.removeIfEmpty(TargetingSpec.mapping(bundle, `${keyPrefix}targeting_spec`)),
            'targeting_template_ids': bundle.inputData?.[`${keyPrefix}targeting_template_ids`],
            'tracking_urls': utils.removeIfEmpty(TrackingUrls.mapping(bundle, `${keyPrefix}tracking_urls`)),
            'bid_multiplier': bundle.inputData?.[`${keyPrefix}bid_multiplier`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
        }
    },
}
