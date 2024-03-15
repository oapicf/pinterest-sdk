const utils = require('../utils/utils');
const CatalogsHotelAddress = require('../models/CatalogsHotelAddress');
const CatalogsHotelGuestRatings = require('../models/CatalogsHotelGuestRatings');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}name`,
                label: `The hotel's name. - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}link`,
                label: `Link to the product page - [${labelPrefix}link]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}description`,
                label: `Brief description of the hotel. - [${labelPrefix}description]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}brand`,
                label: `The brand to which this hotel belongs to. - [${labelPrefix}brand]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}latitude`,
                label: `Latitude of the hotel. - [${labelPrefix}latitude]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}longitude`,
                label: `Longitude of the hotel. - [${labelPrefix}longitude]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}neighborhood`,
                label: `A list of neighborhoods where the hotel is located - [${labelPrefix}neighborhood]`,
                list: true,
                type: 'string',
            },
            ...CatalogsHotelAddress.fields(`${keyPrefix}address`, isInput),
            {
                key: `${keyPrefix}custom_label_0`,
                label: `Custom grouping of hotels - [${labelPrefix}custom_label_0]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}custom_label_1`,
                label: `Custom grouping of hotels - [${labelPrefix}custom_label_1]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}custom_label_2`,
                label: `Custom grouping of hotels - [${labelPrefix}custom_label_2]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}custom_label_3`,
                label: `Custom grouping of hotels - [${labelPrefix}custom_label_3]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}custom_label_4`,
                label: `Custom grouping of hotels - [${labelPrefix}custom_label_4]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}category`,
                label: `The type of property. The category can be any type of internal description desired. - [${labelPrefix}category]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}base_price`,
                label: `Base price of the hotel room per night followed by the ISO currency code - [${labelPrefix}base_price]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}sale_price`,
                label: `Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel. - [${labelPrefix}sale_price]`,
                type: 'string',
            },
            ...CatalogsHotelGuestRatings.fields(`${keyPrefix}guest_ratings`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'link': bundle.inputData?.[`${keyPrefix}link`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'brand': bundle.inputData?.[`${keyPrefix}brand`],
            'latitude': bundle.inputData?.[`${keyPrefix}latitude`],
            'longitude': bundle.inputData?.[`${keyPrefix}longitude`],
            'neighborhood': bundle.inputData?.[`${keyPrefix}neighborhood`],
            'address': utils.removeIfEmpty(CatalogsHotelAddress.mapping(bundle, `${keyPrefix}address`)),
            'custom_label_0': bundle.inputData?.[`${keyPrefix}custom_label_0`],
            'custom_label_1': bundle.inputData?.[`${keyPrefix}custom_label_1`],
            'custom_label_2': bundle.inputData?.[`${keyPrefix}custom_label_2`],
            'custom_label_3': bundle.inputData?.[`${keyPrefix}custom_label_3`],
            'custom_label_4': bundle.inputData?.[`${keyPrefix}custom_label_4`],
            'category': bundle.inputData?.[`${keyPrefix}category`],
            'base_price': bundle.inputData?.[`${keyPrefix}base_price`],
            'sale_price': bundle.inputData?.[`${keyPrefix}sale_price`],
            'guest_ratings': utils.removeIfEmpty(CatalogsHotelGuestRatings.mapping(bundle, `${keyPrefix}guest_ratings`)),
        }
    },
}
