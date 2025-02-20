const utils = require('../utils/utils');
const CatalogsProductGroupPricingCriteria = require('../models/CatalogsProductGroupPricingCriteria');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'MAX_PRICE': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}MAX_PRICE`)),
        }
    },
}
