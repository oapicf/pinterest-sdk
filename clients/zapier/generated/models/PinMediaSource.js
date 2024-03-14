const utils = require('../utils/utils');
const PinMediaSourceImageBase64 = require('../models/PinMediaSourceImageBase64');
const PinMediaSourceImageURL = require('../models/PinMediaSourceImageURL');
const PinMediaSourceVideoID = require('../models/PinMediaSourceVideoID');

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
                key: `${keyPrefix}content_type`,
                label: `[${labelPrefix}content_type]`,
                required: true,
                type: 'string',
                choices: [
                    'image/jpeg',
                    'image/png',
                ],
            },
            {
                key: `${keyPrefix}data`,
                label: `[${labelPrefix}data]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}url`,
                label: `[${labelPrefix}url]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}cover_image_url`,
                label: `[${labelPrefix}cover_image_url]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}media_id`,
                label: `[${labelPrefix}media_id]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'source_type': bundle.inputData?.[`${keyPrefix}source_type`],
            'content_type': bundle.inputData?.[`${keyPrefix}content_type`],
            'data': bundle.inputData?.[`${keyPrefix}data`],
            'url': bundle.inputData?.[`${keyPrefix}url`],
            'cover_image_url': bundle.inputData?.[`${keyPrefix}cover_image_url`],
            'media_id': bundle.inputData?.[`${keyPrefix}media_id`],
        }
    },
}
