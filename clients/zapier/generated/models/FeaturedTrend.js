const utils = require('../utils/utils');
const InterestsEnum = require('../models/InterestsEnum');
const ProductCategoryRegion = require('../models/ProductCategoryRegion');
const TrendingTopic = require('../models/TrendingTopic');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}interest`,
                ...InterestsEnum.fields(`${keyPrefix}interest`, isInput),
            },
            {
                key: `${keyPrefix}market`,
                ...ProductCategoryRegion.fields(`${keyPrefix}market`, isInput),
            },
            {
                key: `${keyPrefix}trends`,
                label: `[${labelPrefix}trends]`,
                children: TrendingTopic.fields(`${keyPrefix}trends${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'interest': bundle.inputData?.[`${keyPrefix}interest`],
            'market': bundle.inputData?.[`${keyPrefix}market`],
            'trends': utils.childMapping(bundle.inputData?.[`${keyPrefix}trends`], `${keyPrefix}trends`, TrendingTopic),
        }
    },
}
