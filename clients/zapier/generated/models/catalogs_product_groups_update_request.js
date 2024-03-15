const utils = require('../utils/utils');
const CatalogsHotelProductGroupFilters = require('../models/CatalogsHotelProductGroupFilters');
const CatalogsProductGroupUpdateRequest = require('../models/CatalogsProductGroupUpdateRequest');
const CatalogsVerticalProductGroupUpdateRequest = require('../models/CatalogsVerticalProductGroupUpdateRequest');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}name`,
                label: `[${labelPrefix}name]`,
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
            ...CatalogsHotelProductGroupFilters.fields(`${keyPrefix}filters`, isInput),
            {
                key: `${keyPrefix}catalog_type`,
                label: `[${labelPrefix}catalog_type]`,
                type: 'string',
                choices: [
                    'HOTEL',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'is_featured': bundle.inputData?.[`${keyPrefix}is_featured`],
            'filters': utils.removeIfEmpty(CatalogsHotelProductGroupFilters.mapping(bundle, `${keyPrefix}filters`)),
            'catalog_type': bundle.inputData?.[`${keyPrefix}catalog_type`],
        }
    },
}
