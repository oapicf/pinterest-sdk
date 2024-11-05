const utils = require('../utils/utils');
const CatalogsItemsRequest_language = require('../models/CatalogsItemsRequest_language');
const CatalogsRetailBatchRequest_items_inner = require('../models/CatalogsRetailBatchRequest_items_inner');
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
                    'RETAIL',
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
                children: CatalogsRetailBatchRequest_items_inner.fields(`${keyPrefix}items${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'catalog_type': bundle.inputData?.[`${keyPrefix}catalog_type`],
            'country': bundle.inputData?.[`${keyPrefix}country`],
            'language': utils.removeIfEmpty(CatalogsItemsRequest_language.mapping(bundle, `${keyPrefix}language`)),
            'items': utils.childMapping(bundle.inputData?.[`${keyPrefix}items`], `${keyPrefix}items`, CatalogsRetailBatchRequest_items_inner),
        }
    },
}
