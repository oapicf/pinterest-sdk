const utils = require('../utils/utils');
const CatalogsHotelProductGroupFilters = require('../models/CatalogsHotelProductGroupFilters');

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
                    'HOTEL',
                ],
            },
            {
                key: `${keyPrefix}catalog_id`,
                label: `Catalog id pertaining to the hotel product group. - [${labelPrefix}catalog_id]`,
                required: true,
                type: 'string',
            },
            ...CatalogsHotelProductGroupFilters.fields(`${keyPrefix}filters`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'catalog_type': bundle.inputData?.[`${keyPrefix}catalog_type`],
            'catalog_id': bundle.inputData?.[`${keyPrefix}catalog_id`],
            'filters': utils.removeIfEmpty(CatalogsHotelProductGroupFilters.mapping(bundle, `${keyPrefix}filters`)),
        }
    },
}
