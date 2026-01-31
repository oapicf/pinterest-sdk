const utils = require('../utils/utils');
const CatalogsCreativeAssetsProductGroup = require('../models/CatalogsCreativeAssetsProductGroup');
const CatalogsCreativeAssetsProductGroupFilters = require('../models/CatalogsCreativeAssetsProductGroupFilters');
const CatalogsHotelProductGroup = require('../models/CatalogsHotelProductGroup');
const CatalogsHotelProductGroupType = require('../models/CatalogsHotelProductGroupType');
const CatalogsProductGroupStatus = require('../models/CatalogsProductGroupStatus');
const CatalogsRetailProductGroup = require('../models/CatalogsRetailProductGroup');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}catalog_id`,
                label: `Catalog id pertaining to the creative assets product group. - [${labelPrefix}catalog_id]`,
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
                key: `${keyPrefix}country`,
                label: `[${labelPrefix}country]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}created_at`,
                label: `Unix timestamp in seconds of when catalog product group was created. - [${labelPrefix}created_at]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}description`,
                label: `[${labelPrefix}description]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}feed_id`,
                label: `id of the catalogs feed belonging to this catalog product group - [${labelPrefix}feed_id]`,
                required: true,
                type: 'string',
            },
            ...CatalogsCreativeAssetsProductGroupFilters.fields(`${keyPrefix}filters`, isInput),
            {
                key: `${keyPrefix}id`,
                label: `ID of the creative assets product group. - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}is_featured`,
                label: `boolean indicator of whether the product group is being featured or not - [${labelPrefix}is_featured]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}locale`,
                label: `[${labelPrefix}locale]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `Name of creative assets product group - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}status`,
                ...CatalogsProductGroupStatus.fields(`${keyPrefix}status`, isInput),
            },
            {
                key: `${keyPrefix}type`,
                ...CatalogsHotelProductGroupType.fields(`${keyPrefix}type`, isInput),
            },
            {
                key: `${keyPrefix}updated_at`,
                label: `Unix timestamp in seconds of last time catalog product group was updated. - [${labelPrefix}updated_at]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'catalog_id': bundle.inputData?.[`${keyPrefix}catalog_id`],
            'catalog_type': bundle.inputData?.[`${keyPrefix}catalog_type`],
            'country': bundle.inputData?.[`${keyPrefix}country`],
            'created_at': bundle.inputData?.[`${keyPrefix}created_at`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'feed_id': bundle.inputData?.[`${keyPrefix}feed_id`],
            'filters': utils.removeIfEmpty(CatalogsCreativeAssetsProductGroupFilters.mapping(bundle, `${keyPrefix}filters`)),
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'is_featured': bundle.inputData?.[`${keyPrefix}is_featured`],
            'locale': bundle.inputData?.[`${keyPrefix}locale`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'updated_at': bundle.inputData?.[`${keyPrefix}updated_at`],
        }
    },
}
