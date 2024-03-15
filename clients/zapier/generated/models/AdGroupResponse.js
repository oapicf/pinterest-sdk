const utils = require('../utils/utils');
const ActionType = require('../models/ActionType');
const AdGroupCommon_optimization_goal_metadata = require('../models/AdGroupCommon_optimization_goal_metadata');
const AdGroupCommon_tracking_urls = require('../models/AdGroupCommon_tracking_urls');
const AdGroupSummaryStatus = require('../models/AdGroupSummaryStatus');
const AnyType = require('../models/AnyType');
const BudgetType = require('../models/BudgetType');
const EntityStatus = require('../models/EntityStatus');
const PacingDeliveryType = require('../models/PacingDeliveryType');
const PlacementGroupType = require('../models/PlacementGroupType');
const TargetingSpec = require('../models/TargetingSpec');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}name`,
                label: `Ad group name. - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}status`,
                ...EntityStatus.fields(`${keyPrefix}status`, isInput),
            },
            {
                key: `${keyPrefix}budget_in_micro_currency`,
                label: `Budget in micro currency. This field is **REQUIRED** for non-CBO (campaign budget optimization) campaigns.  A CBO campaign automatically generates ad group budgets from its campaign budget to maximize campaign outcome. A CBO campaign is limited to 70 or less ad groups. - [${labelPrefix}budget_in_micro_currency]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}bid_in_micro_currency`,
                label: `Bid price in micro currency. This field is **REQUIRED** for the following campaign objective_type/billable_event combinations: AWARENESS/IMPRESSION, CONSIDERATION/CLICKTHROUGH, CATALOG_SALES/CLICKTHROUGH, VIDEO_VIEW/VIDEO_V_50_MRC. - [${labelPrefix}bid_in_micro_currency]`,
                type: 'integer',
            },
            ...AdGroupCommon_optimization_goal_metadata.fields(`${keyPrefix}optimization_goal_metadata`, isInput),
            {
                key: `${keyPrefix}budget_type`,
                ...BudgetType.fields(`${keyPrefix}budget_type`, isInput),
            },
            {
                key: `${keyPrefix}start_time`,
                label: `Ad group start time. Unix timestamp in seconds. Defaults to current time. - [${labelPrefix}start_time]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}end_time`,
                label: `Ad group end time. Unix timestamp in seconds. - [${labelPrefix}end_time]`,
                type: 'integer',
            },
            ...TargetingSpec.fields(`${keyPrefix}targeting_spec`, isInput),
            {
                key: `${keyPrefix}lifetime_frequency_cap`,
                label: `Set a limit to the number of times a promoted pin from this campaign can be impressed by a pinner within the past rolling 30 days. Only available for CPM (cost per mille (1000 impressions))  ad groups. A CPM ad group has an IMPRESSION <a href=\"https://developers.pinterest.com/docs/redoc/#section/Billable-event\">billable_event</a> value. This field **REQUIRES** the `end_time` field. - [${labelPrefix}lifetime_frequency_cap]`,
                type: 'integer',
            },
            ...AdGroupCommon_tracking_urls.fields(`${keyPrefix}tracking_urls`, isInput),
            {
                key: `${keyPrefix}auto_targeting_enabled`,
                label: `Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>. - [${labelPrefix}auto_targeting_enabled]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}placement_group`,
                ...PlacementGroupType.fields(`${keyPrefix}placement_group`, isInput),
            },
            {
                key: `${keyPrefix}pacing_delivery_type`,
                ...PacingDeliveryType.fields(`${keyPrefix}pacing_delivery_type`, isInput),
            },
            {
                key: `${keyPrefix}campaign_id`,
                label: `Campaign ID of the ad group. - [${labelPrefix}campaign_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}billable_event`,
                ...ActionType.fields(`${keyPrefix}billable_event`, isInput),
            },
            {
                key: `${keyPrefix}bid_strategy_type`,
                label: `Bid strategy type - [${labelPrefix}bid_strategy_type]`,
                type: 'string',
                choices: [
                    'AUTOMATIC_BID',
                    'MAX_BID',
                    'TARGET_AVG',
                    'null',
                ],
            },
            {
                key: `${keyPrefix}id`,
                label: `Ad group ID. - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}ad_account_id`,
                label: `Advertiser ID. - [${labelPrefix}ad_account_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}created_time`,
                label: `Ad group creation time. Unix timestamp in seconds. - [${labelPrefix}created_time]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}updated_time`,
                label: `Ad group last update time. Unix timestamp in seconds. - [${labelPrefix}updated_time]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}type`,
                label: `Always \"adgroup\". - [${labelPrefix}type]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}conversion_learning_mode_type`,
                label: `oCPM learn mode - [${labelPrefix}conversion_learning_mode_type]`,
                type: 'string',
                choices: [
                    'NOT_ACTIVE',
                    'ACTIVE',
                    'null',
                ],
            },
            {
                key: `${keyPrefix}summary_status`,
                ...AdGroupSummaryStatus.fields(`${keyPrefix}summary_status`, isInput),
            },
            {
                key: `${keyPrefix}feed_profile_id`,
                label: `Feed Profile ID associated to the adgroup. - [${labelPrefix}feed_profile_id]`,
                type: 'string',
            },
            ....fields(`${keyPrefix}dca_assets`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'budget_in_micro_currency': bundle.inputData?.[`${keyPrefix}budget_in_micro_currency`],
            'bid_in_micro_currency': bundle.inputData?.[`${keyPrefix}bid_in_micro_currency`],
            'optimization_goal_metadata': utils.removeIfEmpty(AdGroupCommon_optimization_goal_metadata.mapping(bundle, `${keyPrefix}optimization_goal_metadata`)),
            'budget_type': bundle.inputData?.[`${keyPrefix}budget_type`],
            'start_time': bundle.inputData?.[`${keyPrefix}start_time`],
            'end_time': bundle.inputData?.[`${keyPrefix}end_time`],
            'targeting_spec': utils.removeIfEmpty(TargetingSpec.mapping(bundle, `${keyPrefix}targeting_spec`)),
            'lifetime_frequency_cap': bundle.inputData?.[`${keyPrefix}lifetime_frequency_cap`],
            'tracking_urls': utils.removeIfEmpty(AdGroupCommon_tracking_urls.mapping(bundle, `${keyPrefix}tracking_urls`)),
            'auto_targeting_enabled': bundle.inputData?.[`${keyPrefix}auto_targeting_enabled`],
            'placement_group': bundle.inputData?.[`${keyPrefix}placement_group`],
            'pacing_delivery_type': bundle.inputData?.[`${keyPrefix}pacing_delivery_type`],
            'campaign_id': bundle.inputData?.[`${keyPrefix}campaign_id`],
            'billable_event': bundle.inputData?.[`${keyPrefix}billable_event`],
            'bid_strategy_type': bundle.inputData?.[`${keyPrefix}bid_strategy_type`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'ad_account_id': bundle.inputData?.[`${keyPrefix}ad_account_id`],
            'created_time': bundle.inputData?.[`${keyPrefix}created_time`],
            'updated_time': bundle.inputData?.[`${keyPrefix}updated_time`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'conversion_learning_mode_type': bundle.inputData?.[`${keyPrefix}conversion_learning_mode_type`],
            'summary_status': bundle.inputData?.[`${keyPrefix}summary_status`],
            'feed_profile_id': bundle.inputData?.[`${keyPrefix}feed_profile_id`],
            'dca_assets': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}dca_assets`)),
        }
    },
}
