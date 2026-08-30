const utils = require('../utils/utils');
const BidOptionsAgeBucketMultipliers = require('../models/BidOptionsAgeBucketMultipliers');
const BidOptionsAppTypeMultipliers = require('../models/BidOptionsAppTypeMultipliers');
const BidOptionsAudienceMultipliers = require('../models/BidOptionsAudienceMultipliers');
const BidOptionsGenderMultipliers = require('../models/BidOptionsGenderMultipliers');
const BidOptionsPlacementMultipliers = require('../models/BidOptionsPlacementMultipliers');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...BidOptionsAgeBucketMultipliers.fields(`${keyPrefix}age_bucket_multipliers`, isInput),
            ...BidOptionsAppTypeMultipliers.fields(`${keyPrefix}app_type_multipliers`, isInput),
            {
                key: `${keyPrefix}audience_multipliers`,
                label: `[${labelPrefix}audience_multipliers]`,
                children: BidOptionsAudienceMultipliers.fields(`${keyPrefix}audience_multipliers${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...BidOptionsGenderMultipliers.fields(`${keyPrefix}gender_multipliers`, isInput),
            ...BidOptionsPlacementMultipliers.fields(`${keyPrefix}placement_multipliers`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'age_bucket_multipliers': utils.removeIfEmpty(BidOptionsAgeBucketMultipliers.mapping(bundle, `${keyPrefix}age_bucket_multipliers`)),
            'app_type_multipliers': utils.removeIfEmpty(BidOptionsAppTypeMultipliers.mapping(bundle, `${keyPrefix}app_type_multipliers`)),
            'audience_multipliers': utils.childMapping(bundle.inputData?.[`${keyPrefix}audience_multipliers`], `${keyPrefix}audience_multipliers`, BidOptionsAudienceMultipliers),
            'gender_multipliers': utils.removeIfEmpty(BidOptionsGenderMultipliers.mapping(bundle, `${keyPrefix}gender_multipliers`)),
            'placement_multipliers': utils.removeIfEmpty(BidOptionsPlacementMultipliers.mapping(bundle, `${keyPrefix}placement_multipliers`)),
        }
    },
}
