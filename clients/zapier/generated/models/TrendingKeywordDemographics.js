const utils = require('../utils/utils');
const TrendsAgeDistribution = require('../models/TrendsAgeDistribution');
const TrendsGenderDistribution = require('../models/TrendsGenderDistribution');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...TrendsAgeDistribution.fields(`${keyPrefix}age_distribution`, isInput),
            ...TrendsGenderDistribution.fields(`${keyPrefix}gender_distribution`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'age_distribution': utils.removeIfEmpty(TrendsAgeDistribution.mapping(bundle, `${keyPrefix}age_distribution`)),
            'gender_distribution': utils.removeIfEmpty(TrendsGenderDistribution.mapping(bundle, `${keyPrefix}gender_distribution`)),
        }
    },
}
