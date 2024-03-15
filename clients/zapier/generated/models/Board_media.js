const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}image_cover_url`,
                label: `Board cover image. - [${labelPrefix}image_cover_url]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}pin_thumbnail_urls`,
                label: `Board pin thumbnail urls. - [${labelPrefix}pin_thumbnail_urls]`,
                list: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'image_cover_url': bundle.inputData?.[`${keyPrefix}image_cover_url`],
            'pin_thumbnail_urls': bundle.inputData?.[`${keyPrefix}pin_thumbnail_urls`],
        }
    },
}
