const utils = require('../utils/utils');
const CampaignBidOptionsUpdate = require('../models/CampaignBidOptionsUpdate');
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
        }
    },
}
