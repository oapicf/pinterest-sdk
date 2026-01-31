const utils = require('../utils/utils');
const PromotionArrayElement = require('../models/PromotionArrayElement');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}promotions`,
                label: `[${labelPrefix}promotions]`,
                children: PromotionArrayElement.fields(`${keyPrefix}promotions${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'promotions': utils.childMapping(bundle.inputData?.[`${keyPrefix}promotions`], `${keyPrefix}promotions`, PromotionArrayElement),
        }
    },
}
