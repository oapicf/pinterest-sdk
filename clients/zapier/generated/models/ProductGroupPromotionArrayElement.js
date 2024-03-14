const utils = require('../utils/utils');
const Exception = require('../models/Exception');
const ProductGroupPromotion = require('../models/ProductGroupPromotion');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...ProductGroupPromotion.fields(`${keyPrefix}data`, isInput),
            ...Exception.fields(`${keyPrefix}exceptions`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'data': utils.removeIfEmpty(ProductGroupPromotion.mapping(bundle, `${keyPrefix}data`)),
            'exceptions': utils.removeIfEmpty(Exception.mapping(bundle, `${keyPrefix}exceptions`)),
        }
    },
}
