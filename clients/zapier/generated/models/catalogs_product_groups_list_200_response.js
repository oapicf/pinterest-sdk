const utils = require('../utils/utils');
const catalogs_product_groups_list_200_response_allOf_items_inner = require('../models/catalogs_product_groups_list_200_response_allOf_items_inner');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}items`,
                label: `[${labelPrefix}items]`,
                children: catalogs_product_groups_list_200_response_allOf_items_inner.fields(`${keyPrefix}items${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}bookmark`,
                label: `[${labelPrefix}bookmark]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'items': utils.childMapping(bundle.inputData?.[`${keyPrefix}items`], `${keyPrefix}items`, catalogs_product_groups_list_200_response_allOf_items_inner),
            'bookmark': bundle.inputData?.[`${keyPrefix}bookmark`],
        }
    },
}
