const utils = require('../utils/utils');
const CatalogsCreativeAssetsProductGroupFilters = require('../models/CatalogsCreativeAssetsProductGroupFilters');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}catalog_id`,
                label: `Catalog ID pertaining to the product group. - [${labelPrefix}catalog_id]`,
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
                key: `${keyPrefix}created_at`,
                label: `Unix timestamp in seconds of when catalog product group was created. - [${labelPrefix}created_at]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}description`,
                label: `[${labelPrefix}description]`,
                type: 'string',
            },
            ...CatalogsCreativeAssetsProductGroupFilters.fields(`${keyPrefix}filters`, isInput),
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
            'created_at': bundle.inputData?.[`${keyPrefix}created_at`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'filters': utils.removeIfEmpty(CatalogsCreativeAssetsProductGroupFilters.mapping(bundle, `${keyPrefix}filters`)),
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'updated_at': bundle.inputData?.[`${keyPrefix}updated_at`],
        }
    },
}
