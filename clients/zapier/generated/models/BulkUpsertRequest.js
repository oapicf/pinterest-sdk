const utils = require('../utils/utils');
const BulkUpsertRequestCreate = require('../models/BulkUpsertRequestCreate');
const BulkUpsertRequestUpdate = require('../models/BulkUpsertRequestUpdate');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...BulkUpsertRequestCreate.fields(`${keyPrefix}create`, isInput),
            ...BulkUpsertRequestUpdate.fields(`${keyPrefix}update`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'create': utils.removeIfEmpty(BulkUpsertRequestCreate.mapping(bundle, `${keyPrefix}create`)),
            'update': utils.removeIfEmpty(BulkUpsertRequestUpdate.mapping(bundle, `${keyPrefix}update`)),
        }
    },
}
