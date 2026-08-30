const utils = require('../utils/utils');
const Country = require('../models/Country');
const LocalStore = require('../models/LocalStore');
const Pinterest.Lib.Error = require('../models/Pinterest.Lib.Error');
const catalogs_local_stores_create_200_response_inner_data_oneOf = require('../models/catalogs_local_stores_create_200_response_inner_data_oneOf');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}address_primary`,
                label: `Primary address line of the store. - [${labelPrefix}address_primary]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}address_secondary`,
                label: `Secondary address line of the store. - [${labelPrefix}address_secondary]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}city`,
                label: `City where the store is located. - [${labelPrefix}city]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}country`,
                ...Country.fields(`${keyPrefix}country`, isInput),
            },
            {
                key: `${keyPrefix}created_at`,
                label: `Creation timestamp - [${labelPrefix}created_at]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}id`,
                label: `The ID of the local store. - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}latitude`,
                label: `Geographic latitude coordinate of the store. - [${labelPrefix}latitude]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}longitude`,
                label: `Geographic longitude coordinate of the store. - [${labelPrefix}longitude]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}name`,
                label: `The name of the local store. - [${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}postal_code`,
                label: `Postal or ZIP code of the store. - [${labelPrefix}postal_code]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}region`,
                label: `State or region code where the store is located. - [${labelPrefix}region]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}store_code`,
                label: `Merchant provided code for the local store. Unique within the merchant's catalog. - [${labelPrefix}store_code]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}updated_at`,
                label: `Last update timestamp - [${labelPrefix}updated_at]`,
                required: true,
                type: 'string',
            },
            ...Pinterest.Lib.Error.fields(`${keyPrefix}exceptions`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'address_primary': bundle.inputData?.[`${keyPrefix}address_primary`],
            'address_secondary': bundle.inputData?.[`${keyPrefix}address_secondary`],
            'city': bundle.inputData?.[`${keyPrefix}city`],
            'country': bundle.inputData?.[`${keyPrefix}country`],
            'created_at': bundle.inputData?.[`${keyPrefix}created_at`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'latitude': bundle.inputData?.[`${keyPrefix}latitude`],
            'longitude': bundle.inputData?.[`${keyPrefix}longitude`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'postal_code': bundle.inputData?.[`${keyPrefix}postal_code`],
            'region': bundle.inputData?.[`${keyPrefix}region`],
            'store_code': bundle.inputData?.[`${keyPrefix}store_code`],
            'updated_at': bundle.inputData?.[`${keyPrefix}updated_at`],
            'exceptions': utils.removeIfEmpty(Pinterest.Lib.Error.mapping(bundle, `${keyPrefix}exceptions`)),
        }
    },
}
