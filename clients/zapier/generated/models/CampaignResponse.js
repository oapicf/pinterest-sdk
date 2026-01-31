const utils = require('../utils/utils');
const CampaignBidOptions = require('../models/CampaignBidOptions');
const CampaignSummaryStatus = require('../models/CampaignSummaryStatus');
const EntityStatus = require('../models/EntityStatus');
const ObjectiveType = require('../models/ObjectiveType');
const TrackingUrls = require('../models/TrackingUrls');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Campaign ID. - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}ad_account_id`,
                label: `Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. - [${labelPrefix}ad_account_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}daily_spend_cap`,
                label: `Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time. - [${labelPrefix}daily_spend_cap]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}end_time`,
                label: `Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence. - [${labelPrefix}end_time]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}is_automated_campaign`,
                label: `Specifies whether the campaign was created in the automated campaign flow - [${labelPrefix}is_automated_campaign]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}is_flexible_daily_budgets`,
                label: `Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". - [${labelPrefix}is_flexible_daily_budgets]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}lifetime_spend_cap`,
                label: `Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time. - [${labelPrefix}lifetime_spend_cap]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}name`,
                label: `Campaign name. - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}order_line_id`,
                label: `Order line ID that appears on the invoice. - [${labelPrefix}order_line_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}start_time`,
                label: `Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence. - [${labelPrefix}start_time]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}status`,
                ...EntityStatus.fields(`${keyPrefix}status`, isInput),
            },
            ...TrackingUrls.fields(`${keyPrefix}tracking_urls`, isInput),
            ...CampaignBidOptions.fields(`${keyPrefix}bid_options`, isInput),
            {
                key: `${keyPrefix}created_time`,
                label: `Campaign creation time. Unix timestamp in seconds. - [${labelPrefix}created_time]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}is_campaign_budget_optimization`,
                label: `Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared. - [${labelPrefix}is_campaign_budget_optimization]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}is_performance_plus`,
                label: `Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>. - [${labelPrefix}is_performance_plus]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}objective_type`,
                ...ObjectiveType.fields(`${keyPrefix}objective_type`, isInput),
            },
            {
                key: `${keyPrefix}summary_status`,
                ...CampaignSummaryStatus.fields(`${keyPrefix}summary_status`, isInput),
            },
            {
                key: `${keyPrefix}type`,
                label: `Always \"campaign\". - [${labelPrefix}type]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}updated_time`,
                label: `UTC timestamp. Last update time. - [${labelPrefix}updated_time]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'ad_account_id': bundle.inputData?.[`${keyPrefix}ad_account_id`],
            'daily_spend_cap': bundle.inputData?.[`${keyPrefix}daily_spend_cap`],
            'end_time': bundle.inputData?.[`${keyPrefix}end_time`],
            'is_automated_campaign': bundle.inputData?.[`${keyPrefix}is_automated_campaign`],
            'is_flexible_daily_budgets': bundle.inputData?.[`${keyPrefix}is_flexible_daily_budgets`],
            'lifetime_spend_cap': bundle.inputData?.[`${keyPrefix}lifetime_spend_cap`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'order_line_id': bundle.inputData?.[`${keyPrefix}order_line_id`],
            'start_time': bundle.inputData?.[`${keyPrefix}start_time`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'tracking_urls': utils.removeIfEmpty(TrackingUrls.mapping(bundle, `${keyPrefix}tracking_urls`)),
            'bid_options': utils.removeIfEmpty(CampaignBidOptions.mapping(bundle, `${keyPrefix}bid_options`)),
            'created_time': bundle.inputData?.[`${keyPrefix}created_time`],
            'is_campaign_budget_optimization': bundle.inputData?.[`${keyPrefix}is_campaign_budget_optimization`],
            'is_performance_plus': bundle.inputData?.[`${keyPrefix}is_performance_plus`],
            'objective_type': bundle.inputData?.[`${keyPrefix}objective_type`],
            'summary_status': bundle.inputData?.[`${keyPrefix}summary_status`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'updated_time': bundle.inputData?.[`${keyPrefix}updated_time`],
        }
    },
}
