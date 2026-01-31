const utils = require('../utils/utils');
const MediaUploadStatus = require('../models/MediaUploadStatus');
const MediaUploadType = require('../models/MediaUploadType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}media_id`,
                label: `Unique identifier for this media upload. Used to track status and for attaching during Pin creation. - [${labelPrefix}media_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}media_type`,
                ...MediaUploadType.fields(`${keyPrefix}media_type`, isInput),
            },
            {
                key: `${keyPrefix}status`,
                ...MediaUploadStatus.fields(`${keyPrefix}status`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'media_id': bundle.inputData?.[`${keyPrefix}media_id`],
            'media_type': bundle.inputData?.[`${keyPrefix}media_type`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
        }
    },
}
