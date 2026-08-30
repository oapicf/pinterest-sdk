const utils = require('../utils/utils');
const AgeBucketMultipliers = require('../models/AgeBucketMultipliers');
const AppTypeMultipliers = require('../models/AppTypeMultipliers');
const CampaignAudienceMultipliers = require('../models/CampaignAudienceMultipliers');
const CampaignBidOptionsUpdateMaskItems = require('../models/CampaignBidOptionsUpdateMaskItems');
const FreqBidMultiplierTimeWindow = require('../models/FreqBidMultiplierTimeWindow');
const FrequencyMultipliers = require('../models/FrequencyMultipliers');
const GenderMultipliers = require('../models/GenderMultipliers');
const PlacementMultipliers = require('../models/PlacementMultipliers');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...AgeBucketMultipliers.fields(`${keyPrefix}age_bucket_multipliers`, isInput),
            ...AppTypeMultipliers.fields(`${keyPrefix}app_type_multipliers`, isInput),
            ...CampaignAudienceMultipliers.fields(`${keyPrefix}audience_multipliers`, isInput),
            {
                key: `${keyPrefix}freq_bid_multiplier_time_window`,
                ...FreqBidMultiplierTimeWindow.fields(`${keyPrefix}freq_bid_multiplier_time_window`, isInput),
            },
            ...FrequencyMultipliers.fields(`${keyPrefix}frequency_multipliers`, isInput),
            ...GenderMultipliers.fields(`${keyPrefix}gender_multipliers`, isInput),
            ...PlacementMultipliers.fields(`${keyPrefix}placement_multipliers`, isInput),
            {
                key: `${keyPrefix}update_mask`,
                list: true,
                type: 'string',
                ...CampaignBidOptionsUpdateMaskItems.fields(`${keyPrefix}update_mask`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'age_bucket_multipliers': utils.removeIfEmpty(AgeBucketMultipliers.mapping(bundle, `${keyPrefix}age_bucket_multipliers`)),
            'app_type_multipliers': utils.removeIfEmpty(AppTypeMultipliers.mapping(bundle, `${keyPrefix}app_type_multipliers`)),
            'audience_multipliers': utils.removeIfEmpty(CampaignAudienceMultipliers.mapping(bundle, `${keyPrefix}audience_multipliers`)),
            'freq_bid_multiplier_time_window': bundle.inputData?.[`${keyPrefix}freq_bid_multiplier_time_window`],
            'frequency_multipliers': utils.removeIfEmpty(FrequencyMultipliers.mapping(bundle, `${keyPrefix}frequency_multipliers`)),
            'gender_multipliers': utils.removeIfEmpty(GenderMultipliers.mapping(bundle, `${keyPrefix}gender_multipliers`)),
            'placement_multipliers': utils.removeIfEmpty(PlacementMultipliers.mapping(bundle, `${keyPrefix}placement_multipliers`)),
            'update_mask': utils.childMapping(bundle.inputData?.[`${keyPrefix}update_mask`], `${keyPrefix}update_mask`, CampaignBidOptionsUpdateMaskItems),
        }
    },
}
