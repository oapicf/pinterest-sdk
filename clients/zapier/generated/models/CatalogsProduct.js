const utils = require('../utils/utils');
const CatalogsCreativeAssetsProduct = require('../models/CatalogsCreativeAssetsProduct');
const CatalogsCreativeAssetsProductMetadata = require('../models/CatalogsCreativeAssetsProductMetadata');
const CatalogsHotelProduct = require('../models/CatalogsHotelProduct');
const CatalogsRetailProduct = require('../models/CatalogsRetailProduct');
const CatalogsType = require('../models/CatalogsType');
const Pin = require('../models/Pin');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}catalog_type`,
                ...CatalogsType.fields(`${keyPrefix}catalog_type`, isInput),
            },
            ...CatalogsCreativeAssetsProductMetadata.fields(`${keyPrefix}metadata`, isInput),
            ...Pin.fields(`${keyPrefix}pin`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'catalog_type': bundle.inputData?.[`${keyPrefix}catalog_type`],
            'metadata': utils.removeIfEmpty(CatalogsCreativeAssetsProductMetadata.mapping(bundle, `${keyPrefix}metadata`)),
            'pin': utils.removeIfEmpty(Pin.mapping(bundle, `${keyPrefix}pin`)),
        }
    },
}
