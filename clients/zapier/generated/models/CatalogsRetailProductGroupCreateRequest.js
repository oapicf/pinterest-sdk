const utils = require('../utils/utils');
const CatalogsLocale = require('../models/CatalogsLocale');
const CatalogsProductGroupFiltersRequest = require('../models/CatalogsProductGroupFiltersRequest');
const Country = require('../models/Country');

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
                label: `Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. - [${labelPrefix}catalog_type]`,
                required: true,
                type: 'string',
                choices: [
                    'RETAIL',
                ],
            },
            {
                key: `${keyPrefix}country`,
                ...Country.fields(`${keyPrefix}country`, isInput),
            },
            {
                key: `${keyPrefix}description`,
                label: `[${labelPrefix}description]`,
                type: 'string',
            },
            ...CatalogsProductGroupFiltersRequest.fields(`${keyPrefix}filters`, isInput),
            {
                key: `${keyPrefix}locale`,
                ...CatalogsLocale.fields(`${keyPrefix}locale`, isInput),
            },
            {
                key: `${keyPrefix}name`,
                label: `[${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'catalog_id': bundle.inputData?.[`${keyPrefix}catalog_id`],
            'catalog_type': bundle.inputData?.[`${keyPrefix}catalog_type`],
            'country': bundle.inputData?.[`${keyPrefix}country`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'filters': utils.removeIfEmpty(CatalogsProductGroupFiltersRequest.mapping(bundle, `${keyPrefix}filters`)),
            'locale': bundle.inputData?.[`${keyPrefix}locale`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
        }
    },
}
