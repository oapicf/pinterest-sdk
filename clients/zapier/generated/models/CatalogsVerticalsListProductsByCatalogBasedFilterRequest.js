const utils = require('../utils/utils');
const CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest = require('../models/CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest');
const CatalogsCreativeAssetsProductGroupFilters = require('../models/CatalogsCreativeAssetsProductGroupFilters');
const CatalogsHotelListProductsByCatalogBasedFilterRequest = require('../models/CatalogsHotelListProductsByCatalogBasedFilterRequest');
const CatalogsLocale = require('../models/CatalogsLocale');
const CatalogsRetailListProductsByCatalogBasedFilterRequest = require('../models/CatalogsRetailListProductsByCatalogBasedFilterRequest');
const Country = require('../models/Country');

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
                key: `${keyPrefix}catalog_id`,
                label: `Catalog id pertaining to the creative assets product group. - [${labelPrefix}catalog_id]`,
                required: true,
                type: 'string',
            },
            ...CatalogsCreativeAssetsProductGroupFilters.fields(`${keyPrefix}filters`, isInput),
            {
                key: `${keyPrefix}country`,
                ...Country.fields(`${keyPrefix}country`, isInput),
            },
            {
                key: `${keyPrefix}locale`,
                ...CatalogsLocale.fields(`${keyPrefix}locale`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'catalog_type': bundle.inputData?.[`${keyPrefix}catalog_type`],
            'catalog_id': bundle.inputData?.[`${keyPrefix}catalog_id`],
            'filters': utils.removeIfEmpty(CatalogsCreativeAssetsProductGroupFilters.mapping(bundle, `${keyPrefix}filters`)),
            'country': bundle.inputData?.[`${keyPrefix}country`],
            'locale': bundle.inputData?.[`${keyPrefix}locale`],
        }
    },
}
