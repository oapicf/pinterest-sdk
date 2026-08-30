const utils = require('../utils/utils');
const CampaignBidOptionsUpdate = require('../models/CampaignBidOptionsUpdate');
const EntityStatus = require('../models/EntityStatus');
const IntendedPromotionType = require('../models/IntendedPromotionType');
const ObjectiveType = require('../models/ObjectiveType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...CampaignBidOptionsUpdate.fields(`${keyPrefix}bid_options`, isInput),
            {
                key: `${keyPrefix}intended_promotion_type`,
                ...IntendedPromotionType.fields(`${keyPrefix}intended_promotion_type`, isInput),
            },
            {
                key: `${keyPrefix}is_ltv_optimized`,
                label: `Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers. - [${labelPrefix}is_ltv_optimized]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}is_performance_plus`,
                label: `Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>. This field is immutable, except only for campaigns in draft status which may update this field. - [${labelPrefix}is_performance_plus]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}is_top_of_search`,
                label: `Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field. - [${labelPrefix}is_top_of_search]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}objective_type`,
                ...ObjectiveType.fields(`${keyPrefix}objective_type`, isInput),
            },
            {
                key: `${keyPrefix}ad_account_id`,
                label: `Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema. - [${labelPrefix}ad_account_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}daily_spend_cap`,
                label: `Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time. - [${labelPrefix}daily_spend_cap]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}default_ad_group_budget_in_micro_currency`,
                label: `When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account. - [${labelPrefix}default_ad_group_budget_in_micro_currency]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}end_time`,
                label: `Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence. - [${labelPrefix}end_time]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}id`,
                label: `Campaign ID. - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}is_automated_campaign`,
                label: `Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - CATALOG\\_SALES - [${labelPrefix}is_automated_campaign]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}is_campaign_budget_optimization`,
                label: `Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided. - [${labelPrefix}is_campaign_budget_optimization]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}is_flexible_daily_budgets`,
                label: `Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap. - [${labelPrefix}is_flexible_daily_budgets]`,
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
            {
                key: `${keyPrefix}tracking_urls`,
                label: `[${labelPrefix}tracking_urls]`,
                dict: true,
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'bid_options': utils.removeIfEmpty(CampaignBidOptionsUpdate.mapping(bundle, `${keyPrefix}bid_options`)),
            'intended_promotion_type': bundle.inputData?.[`${keyPrefix}intended_promotion_type`],
            'is_ltv_optimized': bundle.inputData?.[`${keyPrefix}is_ltv_optimized`],
            'is_performance_plus': bundle.inputData?.[`${keyPrefix}is_performance_plus`],
            'is_top_of_search': bundle.inputData?.[`${keyPrefix}is_top_of_search`],
            'objective_type': bundle.inputData?.[`${keyPrefix}objective_type`],
            'ad_account_id': bundle.inputData?.[`${keyPrefix}ad_account_id`],
            'daily_spend_cap': bundle.inputData?.[`${keyPrefix}daily_spend_cap`],
            'default_ad_group_budget_in_micro_currency': bundle.inputData?.[`${keyPrefix}default_ad_group_budget_in_micro_currency`],
            'end_time': bundle.inputData?.[`${keyPrefix}end_time`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'is_automated_campaign': bundle.inputData?.[`${keyPrefix}is_automated_campaign`],
            'is_campaign_budget_optimization': bundle.inputData?.[`${keyPrefix}is_campaign_budget_optimization`],
            'is_flexible_daily_budgets': bundle.inputData?.[`${keyPrefix}is_flexible_daily_budgets`],
            'lifetime_spend_cap': bundle.inputData?.[`${keyPrefix}lifetime_spend_cap`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'order_line_id': bundle.inputData?.[`${keyPrefix}order_line_id`],
            'start_time': bundle.inputData?.[`${keyPrefix}start_time`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'tracking_urls': bundle.inputData?.[`${keyPrefix}tracking_urls`],
        }
    },
}
