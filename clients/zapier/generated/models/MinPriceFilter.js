const utils = require('../utils/utils');
const CatalogsProductGroupPricingCriteria = require('../models/CatalogsProductGroupPricingCriteria');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...CatalogsProductGroupPricingCriteria.fields(`${keyPrefix}MIN_PRICE`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'MIN_PRICE': utils.removeIfEmpty(CatalogsProductGroupPricingCriteria.mapping(bundle, `${keyPrefix}MIN_PRICE`)),
        }
    },
}
