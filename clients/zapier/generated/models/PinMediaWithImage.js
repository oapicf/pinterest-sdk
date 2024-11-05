const utils = require('../utils/utils');
const PinMedia = require('../models/PinMedia');
const PinMediaWithImage_allOf_images = require('../models/PinMediaWithImage_allOf_images');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}media_type`,
                label: `[${labelPrefix}media_type]`,
                type: 'string',
            },
            ...PinMediaWithImage_allOf_images.fields(`${keyPrefix}images`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'media_type': bundle.inputData?.[`${keyPrefix}media_type`],
            'images': utils.removeIfEmpty(PinMediaWithImage_allOf_images.mapping(bundle, `${keyPrefix}images`)),
        }
    },
}
