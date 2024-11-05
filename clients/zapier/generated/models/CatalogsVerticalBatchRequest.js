const utils = require('../utils/utils');
const CatalogsCreativeAssetsBatchItem = require('../models/CatalogsCreativeAssetsBatchItem');
const CatalogsCreativeAssetsBatchRequest = require('../models/CatalogsCreativeAssetsBatchRequest');
const CatalogsHotelBatchRequest = require('../models/CatalogsHotelBatchRequest');
const CatalogsItemsRequest_language = require('../models/CatalogsItemsRequest_language');
const CatalogsRetailBatchRequest = require('../models/CatalogsRetailBatchRequest');
const Country = require('../models/Country');

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
            {
                key: `${keyPrefix}country`,
                ...Country.fields(`${keyPrefix}country`, isInput),
            },
            ...CatalogsItemsRequest_language.fields(`${keyPrefix}language`, isInput),
            {
                key: `${keyPrefix}items`,
                label: `[${labelPrefix}items]`,
                children: CatalogsCreativeAssetsBatchItem.fields(`${keyPrefix}items${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}catalog_id`,
                label: `Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog - [${labelPrefix}catalog_id]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'catalog_type': bundle.inputData?.[`${keyPrefix}catalog_type`],
            'country': bundle.inputData?.[`${keyPrefix}country`],
            'language': utils.removeIfEmpty(CatalogsItemsRequest_language.mapping(bundle, `${keyPrefix}language`)),
            'items': utils.childMapping(bundle.inputData?.[`${keyPrefix}items`], `${keyPrefix}items`, CatalogsCreativeAssetsBatchItem),
            'catalog_id': bundle.inputData?.[`${keyPrefix}catalog_id`],
        }
    },
}
