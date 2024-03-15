const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}addr1`,
                label: `Primary street address of hotel. - [${labelPrefix}addr1]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}city`,
                label: `City where the hotel is located. - [${labelPrefix}city]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}region`,
                label: `State, county, province, where the hotel is located. - [${labelPrefix}region]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}country`,
                label: `Country where the hotel is located. - [${labelPrefix}country]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}postal_code`,
                label: `Required for countries with a postal code system. Postal or zip code of the hotel. - [${labelPrefix}postal_code]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'addr1': bundle.inputData?.[`${keyPrefix}addr1`],
            'city': bundle.inputData?.[`${keyPrefix}city`],
            'region': bundle.inputData?.[`${keyPrefix}region`],
            'country': bundle.inputData?.[`${keyPrefix}country`],
            'postal_code': bundle.inputData?.[`${keyPrefix}postal_code`],
        }
    },
}
