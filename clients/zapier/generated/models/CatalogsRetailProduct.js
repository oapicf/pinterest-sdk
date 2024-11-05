const utils = require('../utils/utils');
const CatalogsRetailProductMetadata = require('../models/CatalogsRetailProductMetadata');
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
                    'RETAIL',
                ],
            },
            ...CatalogsRetailProductMetadata.fields(`${keyPrefix}metadata`, isInput),
            ...Pin.fields(`${keyPrefix}pin`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'catalog_type': bundle.inputData?.[`${keyPrefix}catalog_type`],
            'metadata': utils.removeIfEmpty(CatalogsRetailProductMetadata.mapping(bundle, `${keyPrefix}metadata`)),
            'pin': utils.removeIfEmpty(Pin.mapping(bundle, `${keyPrefix}pin`)),
        }
    },
}
