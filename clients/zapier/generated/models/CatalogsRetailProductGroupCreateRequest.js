const utils = require('../utils/utils');
const CatalogsLocale = require('../models/CatalogsLocale');
const CatalogsProductGroupFiltersRequest = require('../models/CatalogsProductGroupFiltersRequest');
const Country = require('../models/Country');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
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
            ...CatalogsProductGroupFiltersRequest.fields(`${keyPrefix}filters`, isInput),
            {
                key: `${keyPrefix}catalog_id`,
                label: `Catalog id pertaining to the retail product group. - [${labelPrefix}catalog_id]`,
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
            'catalog_type': bundle.inputData?.[`${keyPrefix}catalog_type`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'filters': utils.removeIfEmpty(CatalogsProductGroupFiltersRequest.mapping(bundle, `${keyPrefix}filters`)),
            'catalog_id': bundle.inputData?.[`${keyPrefix}catalog_id`],
            'country': bundle.inputData?.[`${keyPrefix}country`],
            'locale': bundle.inputData?.[`${keyPrefix}locale`],
        }
    },
}
