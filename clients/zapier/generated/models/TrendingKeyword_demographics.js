const utils = require('../utils/utils');
const TrendingKeyword_demographics_age_distribution = require('../models/TrendingKeyword_demographics_age_distribution');
const TrendingKeyword_demographics_gender_distribution = require('../models/TrendingKeyword_demographics_gender_distribution');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...TrendingKeyword_demographics_age_distribution.fields(`${keyPrefix}age_distribution`, isInput),
            ...TrendingKeyword_demographics_gender_distribution.fields(`${keyPrefix}gender_distribution`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'age_distribution': utils.removeIfEmpty(TrendingKeyword_demographics_age_distribution.mapping(bundle, `${keyPrefix}age_distribution`)),
            'gender_distribution': utils.removeIfEmpty(TrendingKeyword_demographics_gender_distribution.mapping(bundle, `${keyPrefix}gender_distribution`)),
        }
    },
}
