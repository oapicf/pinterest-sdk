const utils = require('../utils/utils');
const ScheduleAgeBucketMultipliers = require('../models/ScheduleAgeBucketMultipliers');
const ScheduleAppTypeMultipliers = require('../models/ScheduleAppTypeMultipliers');
const ScheduleAudienceMultipliers = require('../models/ScheduleAudienceMultipliers');
const ScheduleBidOptions_gender_multipliers = require('../models/ScheduleBidOptions_gender_multipliers');
const ScheduleBidOptions_placement_multipliers = require('../models/ScheduleBidOptions_placement_multipliers');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...ScheduleAgeBucketMultipliers.fields(`${keyPrefix}age_bucket_multipliers`, isInput),
            ...ScheduleAppTypeMultipliers.fields(`${keyPrefix}app_type_multipliers`, isInput),
            ...ScheduleAudienceMultipliers.fields(`${keyPrefix}audience_multipliers`, isInput),
            ...ScheduleBidOptions_gender_multipliers.fields(`${keyPrefix}gender_multipliers`, isInput),
            ...ScheduleBidOptions_placement_multipliers.fields(`${keyPrefix}placement_multipliers`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'age_bucket_multipliers': utils.removeIfEmpty(ScheduleAgeBucketMultipliers.mapping(bundle, `${keyPrefix}age_bucket_multipliers`)),
            'app_type_multipliers': utils.removeIfEmpty(ScheduleAppTypeMultipliers.mapping(bundle, `${keyPrefix}app_type_multipliers`)),
            'audience_multipliers': utils.removeIfEmpty(ScheduleAudienceMultipliers.mapping(bundle, `${keyPrefix}audience_multipliers`)),
            'gender_multipliers': utils.removeIfEmpty(ScheduleBidOptions_gender_multipliers.mapping(bundle, `${keyPrefix}gender_multipliers`)),
            'placement_multipliers': utils.removeIfEmpty(ScheduleBidOptions_placement_multipliers.mapping(bundle, `${keyPrefix}placement_multipliers`)),
        }
    },
}
