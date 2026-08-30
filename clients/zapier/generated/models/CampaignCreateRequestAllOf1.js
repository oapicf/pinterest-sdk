const utils = require('../utils/utils');
const CampaignBidOptionsCreate = require('../models/CampaignBidOptionsCreate');
const EntityStatus = require('../models/EntityStatus');
const IntendedPromotionType = require('../models/IntendedPromotionType');
const ObjectiveType = require('../models/ObjectiveType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...CampaignBidOptionsCreate.fields(`${keyPrefix}bid_options`, isInput),
            {
                key: `${keyPrefix}intended_promotion_type`,
                ...IntendedPromotionType.fields(`${keyPrefix}intended_promotion_type`, isInput),
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
                key: `${keyPrefix}is_ltv_optimized`,
                label: `Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers. - [${labelPrefix}is_ltv_optimized]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}is_performance_plus`,
                label: `Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>. - [${labelPrefix}is_performance_plus]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}is_top_of_search`,
                label: `<a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank\" target=\"blank\">Restricted</a>  Have your ads and content appear at the top of search result lists in Pinterest.  You can only use this feature with the following objectives: `CONSIDERATION` `WEB_CONVERSION` `CATALOG_SALES`  You cannot use this feature with Pinterest Performance+ or Premiere Spotlight enabled.  You cannot change your `true` or `false` selection of this campaign if you <a href=\"https://developer.pinterest.com/docs/api/v5/campaigns-update\" target=\"blank\">update it</a>. - [${labelPrefix}is_top_of_search]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}objective_type`,
                ...ObjectiveType.fields(`${keyPrefix}objective_type`, isInput),
            },
            {
                key: `${keyPrefix}status`,
                ...EntityStatus.fields(`${keyPrefix}status`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'bid_options': utils.removeIfEmpty(CampaignBidOptionsCreate.mapping(bundle, `${keyPrefix}bid_options`)),
            'intended_promotion_type': bundle.inputData?.[`${keyPrefix}intended_promotion_type`],
            'is_automated_campaign': bundle.inputData?.[`${keyPrefix}is_automated_campaign`],
            'is_campaign_budget_optimization': bundle.inputData?.[`${keyPrefix}is_campaign_budget_optimization`],
            'is_flexible_daily_budgets': bundle.inputData?.[`${keyPrefix}is_flexible_daily_budgets`],
            'is_ltv_optimized': bundle.inputData?.[`${keyPrefix}is_ltv_optimized`],
            'is_performance_plus': bundle.inputData?.[`${keyPrefix}is_performance_plus`],
            'is_top_of_search': bundle.inputData?.[`${keyPrefix}is_top_of_search`],
            'objective_type': bundle.inputData?.[`${keyPrefix}objective_type`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
        }
    },
}
