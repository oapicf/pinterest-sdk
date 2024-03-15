const utils = require('../utils/utils');
const catalogs_product_group_pricing_currency_criteria = require('../models/catalogs_product_group_pricing_currency_criteria');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...catalogs_product_group_pricing_currency_criteria.fields(`${keyPrefix}PRICE`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'PRICE': utils.removeIfEmpty(catalogs_product_group_pricing_currency_criteria.mapping(bundle, `${keyPrefix}PRICE`)),
        }
    },
}
