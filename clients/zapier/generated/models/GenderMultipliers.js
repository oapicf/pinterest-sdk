const utils = require('../utils/utils');
const TargetingSpecGender = require('../models/TargetingSpecGender');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}GENDER`,
                ...TargetingSpecGender.fields(`${keyPrefix}GENDER`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'GENDER': bundle.inputData?.[`${keyPrefix}GENDER`],
        }
    },
}
