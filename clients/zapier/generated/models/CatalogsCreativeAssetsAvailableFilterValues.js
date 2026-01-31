const utils = require('../utils/utils');
const catalogs_creative_assets_filter_values_map = require('../models/catalogs_creative_assets_filter_values_map');

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
                    'CREATIVE_ASSETS',
                ],
            },
            ...catalogs_creative_assets_filter_values_map.fields(`${keyPrefix}filter_values`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'catalog_type': bundle.inputData?.[`${keyPrefix}catalog_type`],
            'filter_values': utils.removeIfEmpty(catalogs_creative_assets_filter_values_map.mapping(bundle, `${keyPrefix}filter_values`)),
        }
    },
}
