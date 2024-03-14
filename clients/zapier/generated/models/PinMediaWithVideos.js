const utils = require('../utils/utils');
const PinMedia = require('../models/PinMedia');
const VideoMetadata = require('../models/VideoMetadata');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}media_type`,
                label: `[${labelPrefix}media_type]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}items`,
                label: `[${labelPrefix}items]`,
                children: VideoMetadata.fields(`${keyPrefix}items${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'media_type': bundle.inputData?.[`${keyPrefix}media_type`],
            'items': utils.childMapping(bundle.inputData?.[`${keyPrefix}items`], `${keyPrefix}items`, VideoMetadata),
        }
    },
}
