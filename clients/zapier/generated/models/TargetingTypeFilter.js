const utils = require('../utils/utils');
const AdsAnalyticsTargetingType = require('../models/AdsAnalyticsTargetingType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}targeting_types`,
                list: true,
                type: 'string',
                ...AdsAnalyticsTargetingType.fields(`${keyPrefix}targeting_types`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'targeting_types': utils.childMapping(bundle.inputData?.[`${keyPrefix}targeting_types`], `${keyPrefix}targeting_types`, AdsAnalyticsTargetingType),
        }
    },
}
