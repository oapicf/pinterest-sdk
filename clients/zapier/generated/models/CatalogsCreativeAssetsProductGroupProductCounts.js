const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}app_links`,
                label: `[${labelPrefix}app_links]`,
                required: true,
                type: 'number',
            },
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
                key: `${keyPrefix}images`,
                label: `[${labelPrefix}images]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}total`,
                label: `[${labelPrefix}total]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}videos`,
                label: `[${labelPrefix}videos]`,
                required: true,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'app_links': bundle.inputData?.[`${keyPrefix}app_links`],
            'catalog_type': bundle.inputData?.[`${keyPrefix}catalog_type`],
            'images': bundle.inputData?.[`${keyPrefix}images`],
            'total': bundle.inputData?.[`${keyPrefix}total`],
            'videos': bundle.inputData?.[`${keyPrefix}videos`],
        }
    },
}
