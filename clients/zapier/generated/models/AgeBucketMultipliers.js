const utils = require('../utils/utils');
const TargetingSpecAgeBucket = require('../models/TargetingSpecAgeBucket');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}AGE_BUCKET`,
                ...TargetingSpecAgeBucket.fields(`${keyPrefix}AGE_BUCKET`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'AGE_BUCKET': bundle.inputData?.[`${keyPrefix}AGE_BUCKET`],
        }
    },
}
