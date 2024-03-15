const utils = require('../utils/utils');
const ImageMetadata_images = require('../models/ImageMetadata_images');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}item_type`,
                label: `[${labelPrefix}item_type]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}title`,
                label: `[${labelPrefix}title]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}description`,
                label: `[${labelPrefix}description]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}link`,
                label: `[${labelPrefix}link]`,
                type: 'string',
            },
            ...ImageMetadata_images.fields(`${keyPrefix}images`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'item_type': bundle.inputData?.[`${keyPrefix}item_type`],
            'title': bundle.inputData?.[`${keyPrefix}title`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'link': bundle.inputData?.[`${keyPrefix}link`],
            'images': utils.removeIfEmpty(ImageMetadata_images.mapping(bundle, `${keyPrefix}images`)),
        }
    },
}
