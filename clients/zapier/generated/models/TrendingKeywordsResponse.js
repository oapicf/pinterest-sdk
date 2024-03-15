const utils = require('../utils/utils');
const TrendingKeywordsResponse_trends_inner = require('../models/TrendingKeywordsResponse_trends_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}trends`,
                label: `[${labelPrefix}trends]`,
                children: TrendingKeywordsResponse_trends_inner.fields(`${keyPrefix}trends${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'trends': utils.childMapping(bundle.inputData?.[`${keyPrefix}trends`], `${keyPrefix}trends`, TrendingKeywordsResponse_trends_inner),
        }
    },
}
