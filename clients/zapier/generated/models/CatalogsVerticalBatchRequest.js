const utils = require('../utils/utils');
const CatalogsHotelBatchItem = require('../models/CatalogsHotelBatchItem');
const CatalogsHotelBatchRequest = require('../models/CatalogsHotelBatchRequest');
const CatalogsRetailBatchRequest = require('../models/CatalogsRetailBatchRequest');
const CatalogsType = require('../models/CatalogsType');
const Country = require('../models/Country');
const Language = require('../models/Language');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}catalog_type`,
                ...CatalogsType.fields(`${keyPrefix}catalog_type`, isInput),
            },
            {
                key: `${keyPrefix}country`,
                ...Country.fields(`${keyPrefix}country`, isInput),
            },
            {
                key: `${keyPrefix}language`,
                ...Language.fields(`${keyPrefix}language`, isInput),
            },
            {
                key: `${keyPrefix}items`,
                label: `[${labelPrefix}items]`,
                children: CatalogsHotelBatchItem.fields(`${keyPrefix}items${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}catalog_id`,
                label: `Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog - [${labelPrefix}catalog_id]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'catalog_type': bundle.inputData?.[`${keyPrefix}catalog_type`],
            'country': bundle.inputData?.[`${keyPrefix}country`],
            'language': bundle.inputData?.[`${keyPrefix}language`],
            'items': utils.childMapping(bundle.inputData?.[`${keyPrefix}items`], `${keyPrefix}items`, CatalogsHotelBatchItem),
            'catalog_id': bundle.inputData?.[`${keyPrefix}catalog_id`],
        }
    },
}
