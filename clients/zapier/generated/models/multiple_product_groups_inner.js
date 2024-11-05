const utils = require('../utils/utils');
const CatalogsCreativeAssetsProductGroupFilters = require('../models/CatalogsCreativeAssetsProductGroupFilters');
const CatalogsLocale = require('../models/CatalogsLocale');
const CatalogsProductGroupCreateRequest = require('../models/CatalogsProductGroupCreateRequest');
const CatalogsVerticalProductGroupCreateRequest = require('../models/CatalogsVerticalProductGroupCreateRequest');
const Country = require('../models/Country');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}name`,
                label: `[${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}description`,
                label: `[${labelPrefix}description]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}is_featured`,
                label: `boolean indicator of whether the product group is being featured or not - [${labelPrefix}is_featured]`,
                type: 'boolean',
            },
            ...CatalogsCreativeAssetsProductGroupFilters.fields(`${keyPrefix}filters`, isInput),
            {
                key: `${keyPrefix}feed_id`,
                label: `Catalog Feed id pertaining to the catalog product group. - [${labelPrefix}feed_id]`,
                required: true,
                type: 'string',
            },
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
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'is_featured': bundle.inputData?.[`${keyPrefix}is_featured`],
            'filters': utils.removeIfEmpty(CatalogsCreativeAssetsProductGroupFilters.mapping(bundle, `${keyPrefix}filters`)),
            'feed_id': bundle.inputData?.[`${keyPrefix}feed_id`],
            'catalog_type': bundle.inputData?.[`${keyPrefix}catalog_type`],
            'catalog_id': bundle.inputData?.[`${keyPrefix}catalog_id`],
            'country': bundle.inputData?.[`${keyPrefix}country`],
            'locale': bundle.inputData?.[`${keyPrefix}locale`],
        }
    },
}
