const utils = require('../utils/utils');
const CatalogsHotelAttributes = require('../models/CatalogsHotelAttributes');
const CatalogsHotelItemResponse = require('../models/CatalogsHotelItemResponse');
const CatalogsRetailItemResponse = require('../models/CatalogsRetailItemResponse');
const CatalogsType = require('../models/CatalogsType');
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
            ...CatalogsHotelAttributes.fields(`${keyPrefix}attributes`, isInput),
            {
                key: `${keyPrefix}hotel_id`,
                label: `The catalog hotel id in the merchant namespace - [${labelPrefix}hotel_id]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'catalog_type': bundle.inputData?.[`${keyPrefix}catalog_type`],
            'item_id': bundle.inputData?.[`${keyPrefix}item_id`],
            'pins': utils.childMapping(bundle.inputData?.[`${keyPrefix}pins`], `${keyPrefix}pins`, Pin),
            'attributes': utils.removeIfEmpty(CatalogsHotelAttributes.mapping(bundle, `${keyPrefix}attributes`)),
            'hotel_id': bundle.inputData?.[`${keyPrefix}hotel_id`],
        }
    },
}
