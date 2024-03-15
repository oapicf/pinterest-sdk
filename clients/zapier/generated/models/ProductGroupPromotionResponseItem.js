const utils = require('../utils/utils');
const Exception = require('../models/Exception');
const ProductGroupPromotion = require('../models/ProductGroupPromotion');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...ProductGroupPromotion.fields(`${keyPrefix}data`, isInput),
            {
                key: `${keyPrefix}exceptions`,
                label: `[${labelPrefix}exceptions]`,
                children: Exception.fields(`${keyPrefix}exceptions${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'data': utils.removeIfEmpty(ProductGroupPromotion.mapping(bundle, `${keyPrefix}data`)),
            'exceptions': utils.childMapping(bundle.inputData?.[`${keyPrefix}exceptions`], `${keyPrefix}exceptions`, Exception),
        }
    },
}
