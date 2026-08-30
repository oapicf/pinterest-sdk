const utils = require('../utils/utils');
const CatalogsHotelFilterValuesMap = require('../models/CatalogsHotelFilterValuesMap');

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
            ...CatalogsHotelFilterValuesMap.fields(`${keyPrefix}filter_values`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'catalog_type': bundle.inputData?.[`${keyPrefix}catalog_type`],
            'filter_values': utils.removeIfEmpty(CatalogsHotelFilterValuesMap.mapping(bundle, `${keyPrefix}filter_values`)),
        }
    },
}
