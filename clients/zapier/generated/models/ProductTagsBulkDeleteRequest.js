const utils = require('../utils/utils');
const ProductTagItem = require('../models/ProductTagItem');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}product_tags`,
                label: `[${labelPrefix}product_tags]`,
                children: ProductTagItem.fields(`${keyPrefix}product_tags${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'product_tags': utils.childMapping(bundle.inputData?.[`${keyPrefix}product_tags`], `${keyPrefix}product_tags`, ProductTagItem),
        }
    },
}
