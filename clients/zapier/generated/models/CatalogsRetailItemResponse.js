const utils = require('../utils/utils');
const ItemAttributes = require('../models/ItemAttributes');
const Pin = require('../models/Pin');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...ItemAttributes.fields(`${keyPrefix}attributes`, isInput),
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
                key: `${keyPrefix}item_id`,
                label: `The catalog retail item id in the merchant namespace - [${labelPrefix}item_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}item_response_kind`,
                label: `Discriminator literal identifying this leaf inside an `ItemResponse` payload. - [${labelPrefix}item_response_kind]`,
                required: true,
                type: 'string',
                choices: [
                    'retail_item',
                ],
            },
            {
                key: `${keyPrefix}pins`,
                label: `[${labelPrefix}pins]`,
                children: Pin.fields(`${keyPrefix}pins${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'attributes': utils.removeIfEmpty(ItemAttributes.mapping(bundle, `${keyPrefix}attributes`)),
            'catalog_type': bundle.inputData?.[`${keyPrefix}catalog_type`],
            'item_id': bundle.inputData?.[`${keyPrefix}item_id`],
            'item_response_kind': bundle.inputData?.[`${keyPrefix}item_response_kind`],
            'pins': utils.childMapping(bundle.inputData?.[`${keyPrefix}pins`], `${keyPrefix}pins`, Pin),
        }
    },
}
