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
            'cover_image_url': bundle.inputData?.[`${keyPrefix}cover_image_url`],
            'media_id': bundle.inputData?.[`${keyPrefix}media_id`],
        }
    },
}
