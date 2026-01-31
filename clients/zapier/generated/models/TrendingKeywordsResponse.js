const utils = require('../utils/utils');
const TrendingKeyword = require('../models/TrendingKeyword');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}trends`,
                label: `[${labelPrefix}trends]`,
                children: TrendingKeyword.fields(`${keyPrefix}trends${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'trends': utils.childMapping(bundle.inputData?.[`${keyPrefix}trends`], `${keyPrefix}trends`, TrendingKeyword),
        }
    },
}
