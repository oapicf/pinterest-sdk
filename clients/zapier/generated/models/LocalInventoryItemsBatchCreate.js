const utils = require('../utils/utils');
const LocalInventoryOperation = require('../models/LocalInventoryOperation');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}operations`,
                label: `[${labelPrefix}operations]`,
                children: LocalInventoryOperation.fields(`${keyPrefix}operations${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'operations': utils.childMapping(bundle.inputData?.[`${keyPrefix}operations`], `${keyPrefix}operations`, LocalInventoryOperation),
        }
    },
}
