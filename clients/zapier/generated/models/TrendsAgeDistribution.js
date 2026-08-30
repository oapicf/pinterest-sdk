const utils = require('../utils/utils');
const TrendsAgeBucket = require('../models/TrendsAgeBucket');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}age_distribution`,
                ...TrendsAgeBucket.fields(`${keyPrefix}age_distribution`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'age_distribution': bundle.inputData?.[`${keyPrefix}age_distribution`],
        }
    },
}
