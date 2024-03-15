const utils = require('../utils/utils');
const ImageMetadata = require('../models/ImageMetadata');
const ImageMetadata_images = require('../models/ImageMetadata_images');
const VideoMetadata = require('../models/VideoMetadata');

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
            'item_type': bundle.inputData?.[`${keyPrefix}item_type`],
            'title': bundle.inputData?.[`${keyPrefix}title`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'link': bundle.inputData?.[`${keyPrefix}link`],
            'images': utils.removeIfEmpty(ImageMetadata_images.mapping(bundle, `${keyPrefix}images`)),
            'cover_image_url': bundle.inputData?.[`${keyPrefix}cover_image_url`],
            'video_url': bundle.inputData?.[`${keyPrefix}video_url`],
            'duration': bundle.inputData?.[`${keyPrefix}duration`],
            'height': bundle.inputData?.[`${keyPrefix}height`],
            'width': bundle.inputData?.[`${keyPrefix}width`],
        }
    },
}
