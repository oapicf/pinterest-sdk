const utils = require('../utils/utils');
const CampaignBidOptionsUpdate = require('../models/CampaignBidOptionsUpdate');
const ConversionObjectiveType = require('../models/ConversionObjectiveType');
const EntityStatus = require('../models/EntityStatus');
const IntendedPromotionType = require('../models/IntendedPromotionType');
const MobileAppPlatform = require('../models/MobileAppPlatform');
const PerformancePlusCampaignSettings = require('../models/PerformancePlusCampaignSettings');
const TrackingUrls = require('../models/TrackingUrls');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}ad_account_id`,
                label: `Setting this field does nothing. The ad account ID gets set from the path parameter. - [${labelPrefix}ad_account_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}app_id`,
                label: `[Closed beta](/docs/getting-started/using-beta-and-restricted-features/)  The store ID of the mobile app for `APP_INSTALL` campaigns. - [${labelPrefix}app_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}app_platform`,
                ...MobileAppPlatform.fields(`${keyPrefix}app_platform`, isInput),
            },
            ...CampaignBidOptionsUpdate.fields(`${keyPrefix}bid_options`, isInput),
            {
                key: `${keyPrefix}daily_spend_cap`,
                label: `Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset. - [${labelPrefix}daily_spend_cap]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}default_ad_group_budget_in_micro_currency`,
                label: `Setting this field does nothing. - [${labelPrefix}default_ad_group_budget_in_micro_currency]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}end_time`,
                label: `Note: To clear this field on update, set the end time to -1. Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence. - [${labelPrefix}end_time]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}id`,
                label: `Campaign ID, must be associated with the ad account ID provided in the path. - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}intended_promotion_type`,
                ...IntendedPromotionType.fields(`${keyPrefix}intended_promotion_type`, isInput),
            },
            {
                key: `${keyPrefix}is_automated_campaign`,
                label: `Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES - [${labelPrefix}is_automated_campaign]`,
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
                key: `${keyPrefix}is_ltv_optimized`,
                label: `Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers. - [${labelPrefix}is_ltv_optimized]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}is_performance_plus`,
                label: `Note: This field is immutable unless the campaign is in draft status. You can only use this feature with the following objectives: - CONSIDERATION - WEB\\_CONVERSION - SALES - LEADS - CATALOG\\_SALES - APP\\_INSTALL Enable Pinterest Performance+ for your campaign. To learn more, see [Pinterest Performance+ Setup](https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/) - [${labelPrefix}is_performance_plus]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}is_top_of_search`,
                label: `Note: This field is immutable unless the campaign is in draft status.  [Restricted](/docs/getting-started/using-beta-and-restricted-features/)  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives:  - CONSIDERATION  - WEB\\_CONVERSION  - SALES  - LEADS  - CATALOG\\_SALES  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled. - [${labelPrefix}is_top_of_search]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}lifetime_spend_cap`,
                label: `Note: The default for this field is null, which is treated the same as 0. For campaign budget optimization, a daily or lifetime spend cap must be set, but not both. For ad group level budgets, this field must be 0 or unset. - [${labelPrefix}lifetime_spend_cap]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}name`,
                label: `Campaign name - 255 chars max. - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}objective_type`,
                ...ConversionObjectiveType.fields(`${keyPrefix}objective_type`, isInput),
            },
            {
                key: `${keyPrefix}order_line_id`,
                label: `Note: To clear this field on update, set the order line ID to 0. Order line ID that appears on the invoice. The order line must not be expired. - [${labelPrefix}order_line_id]`,
                type: 'string',
            },
            ...PerformancePlusCampaignSettings.fields(`${keyPrefix}performance_plus_campaign_settings`, isInput),
            {
                key: `${keyPrefix}start_time`,
                label: `Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about [scheduling campaigns](/docs/api-features/managing-campaigns/#campaign-scheduling). Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call [List campaigns](/docs/api/v5/campaigns-list) or [List ad groups](/docs/api/v5/ad_groups-list), the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence. - [${labelPrefix}start_time]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}status`,
                ...EntityStatus.fields(`${keyPrefix}status`, isInput),
            },
            ...TrackingUrls.fields(`${keyPrefix}tracking_urls`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ad_account_id': bundle.inputData?.[`${keyPrefix}ad_account_id`],
            'app_id': bundle.inputData?.[`${keyPrefix}app_id`],
            'app_platform': bundle.inputData?.[`${keyPrefix}app_platform`],
            'bid_options': utils.removeIfEmpty(CampaignBidOptionsUpdate.mapping(bundle, `${keyPrefix}bid_options`)),
            'daily_spend_cap': bundle.inputData?.[`${keyPrefix}daily_spend_cap`],
            'default_ad_group_budget_in_micro_currency': bundle.inputData?.[`${keyPrefix}default_ad_group_budget_in_micro_currency`],
            'end_time': bundle.inputData?.[`${keyPrefix}end_time`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'intended_promotion_type': bundle.inputData?.[`${keyPrefix}intended_promotion_type`],
            'is_automated_campaign': bundle.inputData?.[`${keyPrefix}is_automated_campaign`],
            'is_campaign_budget_optimization': bundle.inputData?.[`${keyPrefix}is_campaign_budget_optimization`],
            'is_flexible_daily_budgets': bundle.inputData?.[`${keyPrefix}is_flexible_daily_budgets`],
            'is_ltv_optimized': bundle.inputData?.[`${keyPrefix}is_ltv_optimized`],
            'is_performance_plus': bundle.inputData?.[`${keyPrefix}is_performance_plus`],
            'is_top_of_search': bundle.inputData?.[`${keyPrefix}is_top_of_search`],
            'lifetime_spend_cap': bundle.inputData?.[`${keyPrefix}lifetime_spend_cap`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'objective_type': bundle.inputData?.[`${keyPrefix}objective_type`],
            'order_line_id': bundle.inputData?.[`${keyPrefix}order_line_id`],
            'performance_plus_campaign_settings': utils.removeIfEmpty(PerformancePlusCampaignSettings.mapping(bundle, `${keyPrefix}performance_plus_campaign_settings`)),
            'start_time': bundle.inputData?.[`${keyPrefix}start_time`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'tracking_urls': utils.removeIfEmpty(TrackingUrls.mapping(bundle, `${keyPrefix}tracking_urls`)),
        }
    },
}
