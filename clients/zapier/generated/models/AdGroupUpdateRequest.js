const utils = require('../utils/utils');
const ActionType = require('../models/ActionType');
const AdGroupCommon_tracking_urls = require('../models/AdGroupCommon_tracking_urls');
const BudgetType = require('../models/BudgetType');
const EntityStatus = require('../models/EntityStatus');
const PacingDeliveryType = require('../models/PacingDeliveryType');
const PlacementGroupType = require('../models/PlacementGroupType');

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
            {
                key: `${keyPrefix}bid_strategy_type`,
                label: `[${labelPrefix}bid_strategy_type]`,
                type: 'string',
                choices: [
                    'AUTOMATIC_BID',
                    'MAX_BID',
                    'TARGET_AVG',
                ],
            },
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
            {
                key: `${keyPrefix}targeting_spec`,
                label: `Ad group targeting specification defining the ad group target audience. For example, '{\"APPTYPE\":[\"iphone\"], \"GENDER\":[\"male\"], \"LOCALE\":[\"en-US\"], \"LOCATION\":[\"501\"], \"AGE_BUCKET\":[\"25-34\"]}' - [${labelPrefix}targeting_spec]`,
                type: 'object',
            },
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
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'budget_in_micro_currency': bundle.inputData?.[`${keyPrefix}budget_in_micro_currency`],
            'bid_in_micro_currency': bundle.inputData?.[`${keyPrefix}bid_in_micro_currency`],
            'bid_strategy_type': bundle.inputData?.[`${keyPrefix}bid_strategy_type`],
            'budget_type': bundle.inputData?.[`${keyPrefix}budget_type`],
            'start_time': bundle.inputData?.[`${keyPrefix}start_time`],
            'end_time': bundle.inputData?.[`${keyPrefix}end_time`],
            'targeting_spec': bundle.inputData?.[`${keyPrefix}targeting_spec`],
            'lifetime_frequency_cap': bundle.inputData?.[`${keyPrefix}lifetime_frequency_cap`],
            'tracking_urls': utils.removeIfEmpty(AdGroupCommon_tracking_urls.mapping(bundle, `${keyPrefix}tracking_urls`)),
            'auto_targeting_enabled': bundle.inputData?.[`${keyPrefix}auto_targeting_enabled`],
            'placement_group': bundle.inputData?.[`${keyPrefix}placement_group`],
            'pacing_delivery_type': bundle.inputData?.[`${keyPrefix}pacing_delivery_type`],
            'campaign_id': bundle.inputData?.[`${keyPrefix}campaign_id`],
            'billable_event': bundle.inputData?.[`${keyPrefix}billable_event`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
        }
    },
}
