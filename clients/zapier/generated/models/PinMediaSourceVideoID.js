const utils = require('../utils/utils');
const ContentType = require('../models/ContentType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}cover_image_content_type`,
                ...ContentType.fields(`${keyPrefix}cover_image_content_type`, isInput),
            },
            {
                key: `${keyPrefix}cover_image_data`,
                label: `Cover image Base64. - [${labelPrefix}cover_image_data]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}cover_image_key_frame_time`,
                label: `Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used. - [${labelPrefix}cover_image_key_frame_time]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}cover_image_url`,
                label: `Cover image URL. - [${labelPrefix}cover_image_url]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}is_standard`,
                label: `Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. - [${labelPrefix}is_standard]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}media_id`,
                label: `[${labelPrefix}media_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}source_type`,
                label: `[${labelPrefix}source_type]`,
                required: true,
                type: 'string',
                choices: [
                    'video_id',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'cover_image_content_type': bundle.inputData?.[`${keyPrefix}cover_image_content_type`],
            'cover_image_data': bundle.inputData?.[`${keyPrefix}cover_image_data`],
            'cover_image_key_frame_time': bundle.inputData?.[`${keyPrefix}cover_image_key_frame_time`],
            'cover_image_url': bundle.inputData?.[`${keyPrefix}cover_image_url`],
            'is_standard': bundle.inputData?.[`${keyPrefix}is_standard`],
            'media_id': bundle.inputData?.[`${keyPrefix}media_id`],
            'source_type': bundle.inputData?.[`${keyPrefix}source_type`],
        }
    },
}
