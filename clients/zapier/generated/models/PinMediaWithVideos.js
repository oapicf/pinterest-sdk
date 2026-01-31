const utils = require('../utils/utils');
const VideoMetadataWithItemType = require('../models/VideoMetadataWithItemType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}items`,
                label: `[${labelPrefix}items]`,
                children: VideoMetadataWithItemType.fields(`${keyPrefix}items${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}media_type`,
                label: `[${labelPrefix}media_type]`,
                required: true,
                type: 'string',
                choices: [
                    'multiple_videos',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'items': utils.childMapping(bundle.inputData?.[`${keyPrefix}items`], `${keyPrefix}items`, VideoMetadataWithItemType),
            'media_type': bundle.inputData?.[`${keyPrefix}media_type`],
        }
    },
}
