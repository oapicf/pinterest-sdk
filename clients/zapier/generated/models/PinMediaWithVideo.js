const utils = require('../utils/utils');
const ImageDetails = require('../models/ImageDetails');
const PinMedia = require('../models/PinMedia');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}media_type`,
                label: `[${labelPrefix}media_type]`,
                type: 'string',
            },
            ...ImageDetails.fields(`${keyPrefix}images`, isInput),
            {
                key: `${keyPrefix}cover_image_url`,
                label: `[${labelPrefix}cover_image_url]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}duration`,
                label: `Duration (in milliseconds) - [${labelPrefix}duration]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}height`,
                label: `Height (in pixels) - [${labelPrefix}height]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}width`,
                label: `Width (in pixels) - [${labelPrefix}width]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'media_type': bundle.inputData?.[`${keyPrefix}media_type`],
            'images': utils.removeIfEmpty(ImageDetails.mapping(bundle, `${keyPrefix}images`)),
            'cover_image_url': bundle.inputData?.[`${keyPrefix}cover_image_url`],
            'duration': bundle.inputData?.[`${keyPrefix}duration`],
            'height': bundle.inputData?.[`${keyPrefix}height`],
            'width': bundle.inputData?.[`${keyPrefix}width`],
        }
    },
}
