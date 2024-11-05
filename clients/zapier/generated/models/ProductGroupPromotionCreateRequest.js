const utils = require('../utils/utils');
const ProductGroupPromotionCreateRequestElement = require('../models/ProductGroupPromotionCreateRequestElement');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}ad_group_id`,
                label: `ID of the Ad Group the Product Group Promotion belongs to. - [${labelPrefix}ad_group_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}product_group_promotion`,
                label: `[${labelPrefix}product_group_promotion]`,
                children: ProductGroupPromotionCreateRequestElement.fields(`${keyPrefix}product_group_promotion${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ad_group_id': bundle.inputData?.[`${keyPrefix}ad_group_id`],
            'product_group_promotion': utils.childMapping(bundle.inputData?.[`${keyPrefix}product_group_promotion`], `${keyPrefix}product_group_promotion`, ProductGroupPromotionCreateRequestElement),
        }
    },
}
