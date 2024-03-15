const utils = require('../utils/utils');
const CatalogsType = require('../models/CatalogsType');
const ItemAttributes = require('../models/ItemAttributes');
const Pin = require('../models/Pin');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}catalog_type`,
                ...CatalogsType.fields(`${keyPrefix}catalog_type`, isInput),
            },
            {
                key: `${keyPrefix}item_id`,
                label: `The catalog retail item id in the merchant namespace - [${labelPrefix}item_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}pins`,
                label: `[${labelPrefix}pins]`,
                children: Pin.fields(`${keyPrefix}pins${!isInput ? '[]' : ''}`, isInput, true), 
            },
            ...ItemAttributes.fields(`${keyPrefix}attributes`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'catalog_type': bundle.inputData?.[`${keyPrefix}catalog_type`],
            'item_id': bundle.inputData?.[`${keyPrefix}item_id`],
            'pins': utils.childMapping(bundle.inputData?.[`${keyPrefix}pins`], `${keyPrefix}pins`, Pin),
            'attributes': utils.removeIfEmpty(ItemAttributes.mapping(bundle, `${keyPrefix}attributes`)),
        }
    },
}
