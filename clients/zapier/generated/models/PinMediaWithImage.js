const utils = require('../utils/utils');
const ImageSize = require('../models/ImageSize');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...ImageSize.fields(`${keyPrefix}images`, isInput),
            {
                key: `${keyPrefix}media_type`,
                label: `[${labelPrefix}media_type]`,
                required: true,
                type: 'string',
                choices: [
                    'image',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'images': utils.removeIfEmpty(ImageSize.mapping(bundle, `${keyPrefix}images`)),
            'media_type': bundle.inputData?.[`${keyPrefix}media_type`],
        }
    },
}
