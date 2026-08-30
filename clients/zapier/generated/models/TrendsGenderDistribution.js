const utils = require('../utils/utils');
const TrendsGender = require('../models/TrendsGender');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}gender_distribution`,
                ...TrendsGender.fields(`${keyPrefix}gender_distribution`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'gender_distribution': bundle.inputData?.[`${keyPrefix}gender_distribution`],
        }
    },
}
