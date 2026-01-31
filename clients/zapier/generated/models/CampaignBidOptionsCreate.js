const utils = require('../utils/utils');
const AppTypeMultipliers = require('../models/AppTypeMultipliers');
const CampaignAudienceMultipliers = require('../models/CampaignAudienceMultipliers');
const PlacementMultipliers = require('../models/PlacementMultipliers');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...AppTypeMultipliers.fields(`${keyPrefix}app_type_multipliers`, isInput),
            ...CampaignAudienceMultipliers.fields(`${keyPrefix}audience_multipliers`, isInput),
            ...PlacementMultipliers.fields(`${keyPrefix}placement_multipliers`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'app_type_multipliers': utils.removeIfEmpty(AppTypeMultipliers.mapping(bundle, `${keyPrefix}app_type_multipliers`)),
            'audience_multipliers': utils.removeIfEmpty(CampaignAudienceMultipliers.mapping(bundle, `${keyPrefix}audience_multipliers`)),
            'placement_multipliers': utils.removeIfEmpty(PlacementMultipliers.mapping(bundle, `${keyPrefix}placement_multipliers`)),
        }
    },
}
