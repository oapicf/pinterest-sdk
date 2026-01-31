const utils = require('../utils/utils');
const ImageMetadata = require('../models/ImageMetadata');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}items`,
                label: `[${labelPrefix}items]`,
                children: ImageMetadata.fields(`${keyPrefix}items${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}media_type`,
                label: `[${labelPrefix}media_type]`,
                required: true,
                type: 'string',
                choices: [
                    'multiple_images',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'items': utils.childMapping(bundle.inputData?.[`${keyPrefix}items`], `${keyPrefix}items`, ImageMetadata),
            'media_type': bundle.inputData?.[`${keyPrefix}media_type`],
        }
    },
}
