const utils = require('../utils/utils');
const ProductGroupPromotion = require('../models/ProductGroupPromotion');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}ad_group_id`,
                label: `ID of the ad group the product group belongs to. - [${labelPrefix}ad_group_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}product_group_promotion`,
                label: `[${labelPrefix}product_group_promotion]`,
                children: ProductGroupPromotion.fields(`${keyPrefix}product_group_promotion${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ad_group_id': bundle.inputData?.[`${keyPrefix}ad_group_id`],
            'product_group_promotion': utils.childMapping(bundle.inputData?.[`${keyPrefix}product_group_promotion`], `${keyPrefix}product_group_promotion`, ProductGroupPromotion),
        }
    },
}
