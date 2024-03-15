const utils = require('../utils/utils');
const CatalogsRetailBatchRequest_items_inner = require('../models/CatalogsRetailBatchRequest_items_inner');
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
                children: CatalogsRetailBatchRequest_items_inner.fields(`${keyPrefix}items${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'catalog_type': bundle.inputData?.[`${keyPrefix}catalog_type`],
            'country': bundle.inputData?.[`${keyPrefix}country`],
            'language': bundle.inputData?.[`${keyPrefix}language`],
            'items': utils.childMapping(bundle.inputData?.[`${keyPrefix}items`], `${keyPrefix}items`, CatalogsRetailBatchRequest_items_inner),
        }
    },
}
