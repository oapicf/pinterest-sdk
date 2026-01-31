const utils = require('../utils/utils');
const ItemAttributesRequest = require('../models/ItemAttributesRequest');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...ItemAttributesRequest.fields(`${keyPrefix}attributes`, isInput),
            {
                key: `${keyPrefix}item_id`,
                label: `The catalog item id in the merchant namespace - [${labelPrefix}item_id]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'attributes': utils.removeIfEmpty(ItemAttributesRequest.mapping(bundle, `${keyPrefix}attributes`)),
            'item_id': bundle.inputData?.[`${keyPrefix}item_id`],
        }
    },
}
