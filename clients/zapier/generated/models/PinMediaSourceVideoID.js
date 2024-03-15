const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}source_type`,
                label: `[${labelPrefix}source_type]`,
                required: true,
                type: 'string',
                choices: [
                    'video_id',
                ],
            },
            {
                key: `${keyPrefix}cover_image_url`,
                label: `Cover image url. - [${labelPrefix}cover_image_url]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}cover_image_content_type`,
                label: `Content type for cover image Base64. - [${labelPrefix}cover_image_content_type]`,
                type: 'string',
                choices: [
                    'image/jpeg',
                    'image/png',
                ],
            },
            {
                key: `${keyPrefix}cover_image_data`,
                label: `Cover image Base64. - [${labelPrefix}cover_image_data]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}media_id`,
                label: `[${labelPrefix}media_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}is_standard`,
                label: `Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. - [${labelPrefix}is_standard]`,
                type: 'boolean',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'source_type': bundle.inputData?.[`${keyPrefix}source_type`],
            'cover_image_url': bundle.inputData?.[`${keyPrefix}cover_image_url`],
            'cover_image_content_type': bundle.inputData?.[`${keyPrefix}cover_image_content_type`],
            'cover_image_data': bundle.inputData?.[`${keyPrefix}cover_image_data`],
            'media_id': bundle.inputData?.[`${keyPrefix}media_id`],
            'is_standard': bundle.inputData?.[`${keyPrefix}is_standard`],
        }
    },
}
