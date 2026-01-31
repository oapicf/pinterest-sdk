const utils = require('../utils/utils');
const ProductCategoriesEngagementType = require('../models/ProductCategoriesEngagementType');
const VerticalProductCategory = require('../models/VerticalProductCategory');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}engagement_type`,
                ...ProductCategoriesEngagementType.fields(`${keyPrefix}engagement_type`, isInput),
            },
            {
                key: `${keyPrefix}pct_change_mom`,
                label: `Month-over-month change percentage - [${labelPrefix}pct_change_mom]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}percent_relative_volume`,
                label: `Relative volume percentage - [${labelPrefix}percent_relative_volume]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}product_category`,
                label: `Product Category Name - [${labelPrefix}product_category]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}verticals`,
                list: true,
                type: 'string',
                ...VerticalProductCategory.fields(`${keyPrefix}verticals`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'engagement_type': bundle.inputData?.[`${keyPrefix}engagement_type`],
            'pct_change_mom': bundle.inputData?.[`${keyPrefix}pct_change_mom`],
            'percent_relative_volume': bundle.inputData?.[`${keyPrefix}percent_relative_volume`],
            'product_category': bundle.inputData?.[`${keyPrefix}product_category`],
            'verticals': utils.childMapping(bundle.inputData?.[`${keyPrefix}verticals`], `${keyPrefix}verticals`, VerticalProductCategory),
        }
    },
}
