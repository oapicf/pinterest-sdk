const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}username`,
                label: `Username - [${labelPrefix}username]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}image_small_url`,
                label: `image_small_url - [${labelPrefix}image_small_url]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}image_medium_url`,
                label: `image_medium_url - [${labelPrefix}image_medium_url]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}image_large_url`,
                label: `image_large_url - [${labelPrefix}image_large_url]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}image_xlarge_url`,
                label: `image_xlarge_url - [${labelPrefix}image_xlarge_url]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'username': bundle.inputData?.[`${keyPrefix}username`],
            'image_small_url': bundle.inputData?.[`${keyPrefix}image_small_url`],
            'image_medium_url': bundle.inputData?.[`${keyPrefix}image_medium_url`],
            'image_large_url': bundle.inputData?.[`${keyPrefix}image_large_url`],
            'image_xlarge_url': bundle.inputData?.[`${keyPrefix}image_xlarge_url`],
        }
    },
}
