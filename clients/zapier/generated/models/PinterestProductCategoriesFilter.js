const utils = require('../utils/utils');
const CatalogsProductGroupMultiplePinterestProductCategoryCriteria = require('../models/CatalogsProductGroupMultiplePinterestProductCategoryCriteria');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...CatalogsProductGroupMultiplePinterestProductCategoryCriteria.fields(`${keyPrefix}PINTEREST_PRODUCT_CATEGORIES`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'PINTEREST_PRODUCT_CATEGORIES': utils.removeIfEmpty(CatalogsProductGroupMultiplePinterestProductCategoryCriteria.mapping(bundle, `${keyPrefix}PINTEREST_PRODUCT_CATEGORIES`)),
        }
    },
}
