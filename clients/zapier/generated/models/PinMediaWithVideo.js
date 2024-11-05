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
            {
                key: `${keyPrefix}cover_image_url`,
                label: `[${labelPrefix}cover_image_url]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}video_url`,
                label: `Video url (720p). </p><strong>Note:</strong> This field is limited and not available to all apps. - [${labelPrefix}video_url]`,
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
            'images': utils.removeIfEmpty(PinMediaWithImage_allOf_images.mapping(bundle, `${keyPrefix}images`)),
            'cover_image_url': bundle.inputData?.[`${keyPrefix}cover_image_url`],
            'video_url': bundle.inputData?.[`${keyPrefix}video_url`],
            'duration': bundle.inputData?.[`${keyPrefix}duration`],
            'height': bundle.inputData?.[`${keyPrefix}height`],
            'width': bundle.inputData?.[`${keyPrefix}width`],
        }
    },
}
