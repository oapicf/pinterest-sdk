const utils = require('../utils/utils');
const TargetingSpecAppType = require('../models/TargetingSpecAppType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}APP_TYPE`,
                ...TargetingSpecAppType.fields(`${keyPrefix}APP_TYPE`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'APP_TYPE': bundle.inputData?.[`${keyPrefix}APP_TYPE`],
        }
    },
}
