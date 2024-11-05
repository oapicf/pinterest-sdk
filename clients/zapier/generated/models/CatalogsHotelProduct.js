const utils = require('../utils/utils');
const CatalogsHotelProductMetadata = require('../models/CatalogsHotelProductMetadata');
const Pin = require('../models/Pin');

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
            ...CatalogsHotelProductMetadata.fields(`${keyPrefix}metadata`, isInput),
            ...Pin.fields(`${keyPrefix}pin`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'catalog_type': bundle.inputData?.[`${keyPrefix}catalog_type`],
            'metadata': utils.removeIfEmpty(CatalogsHotelProductMetadata.mapping(bundle, `${keyPrefix}metadata`)),
            'pin': utils.removeIfEmpty(Pin.mapping(bundle, `${keyPrefix}pin`)),
        }
    },
}
