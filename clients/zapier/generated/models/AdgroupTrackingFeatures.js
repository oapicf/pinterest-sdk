const utils = require('../utils/utils');
const AdgroupTrackingFeatureType = require('../models/AdgroupTrackingFeatureType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}enabled`,
                list: true,
                type: 'string',
                ...AdgroupTrackingFeatureType.fields(`${keyPrefix}enabled`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'enabled': utils.childMapping(bundle.inputData?.[`${keyPrefix}enabled`], `${keyPrefix}enabled`, AdgroupTrackingFeatureType),
        }
    },
}
