const utils = require('../utils/utils');
const CatalogsCreativeAssetsProductGroupProductCounts = require('../models/CatalogsCreativeAssetsProductGroupProductCounts');
const CatalogsHotelProductGroupProductCounts = require('../models/CatalogsHotelProductGroupProductCounts');
const CatalogsRetailProductGroupProductCounts = require('../models/CatalogsRetailProductGroupProductCounts');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}catalog_type`,
                label: `[${labelPrefix}catalog_type]`,
                required: true,
                type: 'string',
                choices: [
                    'CREATIVE_ASSETS',
                ],
            },
            {
                key: `${keyPrefix}in_stock`,
                label: `[${labelPrefix}in_stock]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}out_of_stock`,
                label: `[${labelPrefix}out_of_stock]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}preorder`,
                label: `[${labelPrefix}preorder]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}total`,
                label: `[${labelPrefix}total]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}videos`,
                label: `[${labelPrefix}videos]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}app_links`,
                label: `[${labelPrefix}app_links]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}images`,
                label: `[${labelPrefix}images]`,
                required: true,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'catalog_type': bundle.inputData?.[`${keyPrefix}catalog_type`],
            'in_stock': bundle.inputData?.[`${keyPrefix}in_stock`],
            'out_of_stock': bundle.inputData?.[`${keyPrefix}out_of_stock`],
            'preorder': bundle.inputData?.[`${keyPrefix}preorder`],
            'total': bundle.inputData?.[`${keyPrefix}total`],
            'videos': bundle.inputData?.[`${keyPrefix}videos`],
            'app_links': bundle.inputData?.[`${keyPrefix}app_links`],
            'images': bundle.inputData?.[`${keyPrefix}images`],
        }
    },
}
