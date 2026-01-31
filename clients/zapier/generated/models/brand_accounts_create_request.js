const utils = require('../utils/utils');
const Country = require('../models/Country');
const Image_Base64 = require('../models/Image_Base64');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}name`,
                label: `Brand Account name - [${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}username`,
                label: `Brand Account username - [${labelPrefix}username]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}country`,
                ...Country.fields(`${keyPrefix}country`, isInput),
            },
            {
                key: `${keyPrefix}about`,
                label: `Brand Account about information - [${labelPrefix}about]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}website`,
                label: `Brand Account website - [${labelPrefix}website]`,
                type: 'string',
            },
            ...Image_Base64.fields(`${keyPrefix}profile_image`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'username': bundle.inputData?.[`${keyPrefix}username`],
            'country': bundle.inputData?.[`${keyPrefix}country`],
            'about': bundle.inputData?.[`${keyPrefix}about`],
            'website': bundle.inputData?.[`${keyPrefix}website`],
            'profile_image': utils.removeIfEmpty(Image_Base64.mapping(bundle, `${keyPrefix}profile_image`)),
        }
    },
}
