const utils = require('../utils/utils');
const MediaUploadType = require('../models/MediaUploadType');
const MediaUpload_allOf_upload_parameters = require('../models/MediaUpload_allOf_upload_parameters');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}media_id`,
                label: `Unique identifier for this media upload. Used to track status and for attaching during Pin creation. - [${labelPrefix}media_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}media_type`,
                ...MediaUploadType.fields(`${keyPrefix}media_type`, isInput),
            },
            {
                key: `${keyPrefix}upload_url`,
                label: `The URL where you will POST your media file. - [${labelPrefix}upload_url]`,
                type: 'string',
            },
            ...MediaUpload_allOf_upload_parameters.fields(`${keyPrefix}upload_parameters`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'media_id': bundle.inputData?.[`${keyPrefix}media_id`],
            'media_type': bundle.inputData?.[`${keyPrefix}media_type`],
            'upload_url': bundle.inputData?.[`${keyPrefix}upload_url`],
            'upload_parameters': utils.removeIfEmpty(MediaUpload_allOf_upload_parameters.mapping(bundle, `${keyPrefix}upload_parameters`)),
        }
    },
}
