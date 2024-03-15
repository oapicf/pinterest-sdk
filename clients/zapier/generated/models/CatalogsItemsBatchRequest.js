const utils = require('../utils/utils');
const BatchOperation = require('../models/BatchOperation');
const CatalogsItemsCreateBatchRequest = require('../models/CatalogsItemsCreateBatchRequest');
const CatalogsItemsDeleteBatchRequest = require('../models/CatalogsItemsDeleteBatchRequest');
const CatalogsItemsDeleteDiscontinuedBatchRequest = require('../models/CatalogsItemsDeleteDiscontinuedBatchRequest');
const CatalogsItemsUpdateBatchRequest = require('../models/CatalogsItemsUpdateBatchRequest');
const CatalogsItemsUpsertBatchRequest = require('../models/CatalogsItemsUpsertBatchRequest');
const Country = require('../models/Country');
const ItemDeleteBatchRecord = require('../models/ItemDeleteBatchRecord');
const Language = require('../models/Language');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}country`,
                ...Country.fields(`${keyPrefix}country`, isInput),
            },
            {
                key: `${keyPrefix}language`,
                ...Language.fields(`${keyPrefix}language`, isInput),
            },
            {
                key: `${keyPrefix}operation`,
                ...BatchOperation.fields(`${keyPrefix}operation`, isInput),
            },
            {
                key: `${keyPrefix}items`,
                label: `[${labelPrefix}items]`,
                children: ItemDeleteBatchRecord.fields(`${keyPrefix}items${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'country': bundle.inputData?.[`${keyPrefix}country`],
            'language': bundle.inputData?.[`${keyPrefix}language`],
            'operation': bundle.inputData?.[`${keyPrefix}operation`],
            'items': utils.childMapping(bundle.inputData?.[`${keyPrefix}items`], `${keyPrefix}items`, ItemDeleteBatchRecord),
        }
    },
}
