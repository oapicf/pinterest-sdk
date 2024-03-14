const utils = require('../utils/utils');
const ItemValidationEvent = require('../models/ItemValidationEvent');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}item_id`,
                label: `The catalog item id in the merchant namespace - [${labelPrefix}item_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}errors`,
                label: `[${labelPrefix}errors]`,
                children: ItemValidationEvent.fields(`${keyPrefix}errors${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'item_id': bundle.inputData?.[`${keyPrefix}item_id`],
            'errors': utils.childMapping(bundle.inputData?.[`${keyPrefix}errors`], `${keyPrefix}errors`, ItemValidationEvent),
        }
    },
}
