const utils = require('../utils/utils');
const BrandAccountProfileImage = require('../models/BrandAccountProfileImage');
const Country = require('../models/Country');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}about`,
                label: `Brand Account about information - [${labelPrefix}about]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}country`,
                ...Country.fields(`${keyPrefix}country`, isInput),
            },
            {
                key: `${keyPrefix}name`,
                label: `Brand Account name - [${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            ...BrandAccountProfileImage.fields(`${keyPrefix}profile_image`, isInput),
            {
                key: `${keyPrefix}username`,
                label: `Brand Account username - [${labelPrefix}username]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}website`,
                label: `Brand Account website - [${labelPrefix}website]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'about': bundle.inputData?.[`${keyPrefix}about`],
            'country': bundle.inputData?.[`${keyPrefix}country`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'profile_image': utils.removeIfEmpty(BrandAccountProfileImage.mapping(bundle, `${keyPrefix}profile_image`)),
            'username': bundle.inputData?.[`${keyPrefix}username`],
            'website': bundle.inputData?.[`${keyPrefix}website`],
        }
    },
}
