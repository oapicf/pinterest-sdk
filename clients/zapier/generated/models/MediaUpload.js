const utils = require('../utils/utils');
const MediaUploadParameters = require('../models/MediaUploadParameters');
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
            ...MediaUploadParameters.fields(`${keyPrefix}upload_parameters`, isInput),
            {
                key: `${keyPrefix}upload_url`,
                label: `The URL where you will POST your media file. - [${labelPrefix}upload_url]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'media_id': bundle.inputData?.[`${keyPrefix}media_id`],
            'media_type': bundle.inputData?.[`${keyPrefix}media_type`],
            'upload_parameters': utils.removeIfEmpty(MediaUploadParameters.mapping(bundle, `${keyPrefix}upload_parameters`)),
            'upload_url': bundle.inputData?.[`${keyPrefix}upload_url`],
        }
    },
}
