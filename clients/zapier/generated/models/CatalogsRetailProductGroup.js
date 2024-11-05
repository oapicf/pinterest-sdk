const utils = require('../utils/utils');
const CatalogsProductGroupFilters = require('../models/CatalogsProductGroupFilters');
const CatalogsProductGroupStatus = require('../models/CatalogsProductGroupStatus');
const CatalogsProductGroupType = require('../models/CatalogsProductGroupType');

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
                    'RETAIL',
                ],
            },
            {
                key: `${keyPrefix}id`,
                label: `ID of the catalog product group. - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `Name of catalog product group - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}description`,
                label: `[${labelPrefix}description]`,
                type: 'string',
            },
            ...CatalogsProductGroupFilters.fields(`${keyPrefix}filters`, isInput),
            {
                key: `${keyPrefix}is_featured`,
                label: `boolean indicator of whether the product group is being featured or not - [${labelPrefix}is_featured]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}type`,
                ...CatalogsProductGroupType.fields(`${keyPrefix}type`, isInput),
            },
            {
                key: `${keyPrefix}status`,
                ...CatalogsProductGroupStatus.fields(`${keyPrefix}status`, isInput),
            },
            {
                key: `${keyPrefix}created_at`,
                label: `Unix timestamp in seconds of when catalog product group was created. - [${labelPrefix}created_at]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}updated_at`,
                label: `Unix timestamp in seconds of last time catalog product group was updated. - [${labelPrefix}updated_at]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}catalog_id`,
                label: `Catalog id pertaining to the retail product group. - [${labelPrefix}catalog_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}feed_id`,
                label: `id of the catalogs feed belonging to this catalog product group - [${labelPrefix}feed_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}country`,
                label: `[${labelPrefix}country]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}locale`,
                label: `[${labelPrefix}locale]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'catalog_type': bundle.inputData?.[`${keyPrefix}catalog_type`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'filters': utils.removeIfEmpty(CatalogsProductGroupFilters.mapping(bundle, `${keyPrefix}filters`)),
            'is_featured': bundle.inputData?.[`${keyPrefix}is_featured`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'created_at': bundle.inputData?.[`${keyPrefix}created_at`],
            'updated_at': bundle.inputData?.[`${keyPrefix}updated_at`],
            'catalog_id': bundle.inputData?.[`${keyPrefix}catalog_id`],
            'feed_id': bundle.inputData?.[`${keyPrefix}feed_id`],
            'country': bundle.inputData?.[`${keyPrefix}country`],
            'locale': bundle.inputData?.[`${keyPrefix}locale`],
        }
    },
}
