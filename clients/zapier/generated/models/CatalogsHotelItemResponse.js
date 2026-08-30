const utils = require('../utils/utils');
const CatalogsHotelAttributes = require('../models/CatalogsHotelAttributes');
const Pin = require('../models/Pin');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...CatalogsHotelAttributes.fields(`${keyPrefix}attributes`, isInput),
            {
                key: `${keyPrefix}catalog_type`,
                label: `[${labelPrefix}catalog_type]`,
                required: true,
                type: 'string',
                choices: [
                    'HOTEL',
                ],
            },
            {
                key: `${keyPrefix}hotel_id`,
                label: `The catalog hotel id in the merchant namespace - [${labelPrefix}hotel_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}item_response_kind`,
                label: `Discriminator literal identifying this leaf inside an `ItemResponse` payload. - [${labelPrefix}item_response_kind]`,
                required: true,
                type: 'string',
                choices: [
                    'hotel_item',
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
            'attributes': utils.removeIfEmpty(CatalogsHotelAttributes.mapping(bundle, `${keyPrefix}attributes`)),
            'catalog_type': bundle.inputData?.[`${keyPrefix}catalog_type`],
            'hotel_id': bundle.inputData?.[`${keyPrefix}hotel_id`],
            'item_response_kind': bundle.inputData?.[`${keyPrefix}item_response_kind`],
            'pins': utils.childMapping(bundle.inputData?.[`${keyPrefix}pins`], `${keyPrefix}pins`, Pin),
        }
    },
}
