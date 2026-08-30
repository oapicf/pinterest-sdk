const utils = require('../utils/utils');
const CatalogsCreativeAssetsAttributes = require('../models/CatalogsCreativeAssetsAttributes');
const CatalogsCreativeAssetsItemErrorResponse = require('../models/CatalogsCreativeAssetsItemErrorResponse');
const CatalogsCreativeAssetsItemResponse = require('../models/CatalogsCreativeAssetsItemResponse');
const CatalogsHotelItemErrorResponse = require('../models/CatalogsHotelItemErrorResponse');
const CatalogsHotelItemResponse = require('../models/CatalogsHotelItemResponse');
const CatalogsRetailItemErrorResponse = require('../models/CatalogsRetailItemErrorResponse');
const CatalogsRetailItemResponse = require('../models/CatalogsRetailItemResponse');
const ItemValidationEvent = require('../models/ItemValidationEvent');
const Pin = require('../models/Pin');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...CatalogsCreativeAssetsAttributes.fields(`${keyPrefix}attributes`, isInput),
            {
                key: `${keyPrefix}catalog_type`,
                label: `[${labelPrefix}catalog_type]`,
                required: true,
                type: 'string',
                choices: [
                    'CREATIVE_ASSETS',
                ],
            },
            {
                key: `${keyPrefix}item_id`,
                label: `The catalog item id in the merchant namespace - [${labelPrefix}item_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}item_response_kind`,
                label: `Discriminator literal identifying this leaf inside an `ItemResponse` payload. - [${labelPrefix}item_response_kind]`,
                required: true,
                type: 'string',
                choices: [
                    'creative_assets_item_error',
                ],
            },
            {
                key: `${keyPrefix}pins`,
                label: `[${labelPrefix}pins]`,
                children: Pin.fields(`${keyPrefix}pins${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}hotel_id`,
                label: `The catalog hotel id in the merchant namespace - [${labelPrefix}hotel_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}creative_assets_id`,
                label: `The catalog creative assets id in the merchant namespace - [${labelPrefix}creative_assets_id]`,
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
            'attributes': utils.removeIfEmpty(CatalogsCreativeAssetsAttributes.mapping(bundle, `${keyPrefix}attributes`)),
            'catalog_type': bundle.inputData?.[`${keyPrefix}catalog_type`],
            'item_id': bundle.inputData?.[`${keyPrefix}item_id`],
            'item_response_kind': bundle.inputData?.[`${keyPrefix}item_response_kind`],
            'pins': utils.childMapping(bundle.inputData?.[`${keyPrefix}pins`], `${keyPrefix}pins`, Pin),
            'hotel_id': bundle.inputData?.[`${keyPrefix}hotel_id`],
            'creative_assets_id': bundle.inputData?.[`${keyPrefix}creative_assets_id`],
            'errors': utils.childMapping(bundle.inputData?.[`${keyPrefix}errors`], `${keyPrefix}errors`, ItemValidationEvent),
        }
    },
}
