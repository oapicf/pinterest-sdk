const utils = require('../utils/utils');
const CatalogsCreativeAssetsProductGroupFilters = require('../models/CatalogsCreativeAssetsProductGroupFilters');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}catalog_type`,
                label: `[${labelPrefix}catalog_type]`,
                type: 'string',
                choices: [
                    'CREATIVE_ASSETS',
                ],
            },
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
            ...CatalogsCreativeAssetsProductGroupFilters.fields(`${keyPrefix}filters`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'catalog_type': bundle.inputData?.[`${keyPrefix}catalog_type`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'filters': utils.removeIfEmpty(CatalogsCreativeAssetsProductGroupFilters.mapping(bundle, `${keyPrefix}filters`)),
        }
    },
}
