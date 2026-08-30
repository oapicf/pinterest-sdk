const utils = require('../utils/utils');
const ItemIdStoreCodePair = require('../models/ItemIdStoreCodePair');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}item_filters`,
                label: `[${labelPrefix}item_filters]`,
                children: ItemIdStoreCodePair.fields(`${keyPrefix}item_filters${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'item_filters': utils.childMapping(bundle.inputData?.[`${keyPrefix}item_filters`], `${keyPrefix}item_filters`, ItemIdStoreCodePair),
        }
    },
}
