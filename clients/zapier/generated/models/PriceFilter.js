const utils = require('../utils/utils');
const PriceFilterPrice = require('../models/PriceFilterPrice');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...PriceFilterPrice.fields(`${keyPrefix}PRICE`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'PRICE': utils.removeIfEmpty(PriceFilterPrice.mapping(bundle, `${keyPrefix}PRICE`)),
        }
    },
}
