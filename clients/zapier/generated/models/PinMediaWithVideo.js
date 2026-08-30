const utils = require('../utils/utils');
const ImageSize = require('../models/ImageSize');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}cover_image_url`,
                label: `[${labelPrefix}cover_image_url]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}duration`,
                label: `Duration (in miliseconds). Field maybe null after creation due to video processing time. - [${labelPrefix}duration]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}height`,
                label: `Height (in pixels). Field maybe null after creation due to video processing time. - [${labelPrefix}height]`,
                type: 'integer',
            },
            ...ImageSize.fields(`${keyPrefix}images`, isInput),
            {
                key: `${keyPrefix}media_type`,
                label: `[${labelPrefix}media_type]`,
                required: true,
                type: 'string',
                choices: [
                    'video',
                ],
            },
            {
                key: `${keyPrefix}video_url`,
                label: `Video url (720p).  **Note:** This field is limited and not available to all apps. - [${labelPrefix}video_url]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}video_url_hls`,
                label: `Video url (HLS).  **Note:** This field is limited and not available to all apps. - [${labelPrefix}video_url_hls]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}width`,
                label: `Width (in pixels). Field maybe null after creation due to video processing time. - [${labelPrefix}width]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'cover_image_url': bundle.inputData?.[`${keyPrefix}cover_image_url`],
            'duration': bundle.inputData?.[`${keyPrefix}duration`],
            'height': bundle.inputData?.[`${keyPrefix}height`],
            'images': utils.removeIfEmpty(ImageSize.mapping(bundle, `${keyPrefix}images`)),
            'media_type': bundle.inputData?.[`${keyPrefix}media_type`],
            'video_url': bundle.inputData?.[`${keyPrefix}video_url`],
            'video_url_hls': bundle.inputData?.[`${keyPrefix}video_url_hls`],
            'width': bundle.inputData?.[`${keyPrefix}width`],
        }
    },
}
