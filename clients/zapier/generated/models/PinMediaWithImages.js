const utils = require('../utils/utils');
const ImageMetadata = require('../models/ImageMetadata');
const PinMedia = require('../models/PinMedia');

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
                children: ImageMetadata.fields(`${keyPrefix}items${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'media_type': bundle.inputData?.[`${keyPrefix}media_type`],
            'items': utils.childMapping(bundle.inputData?.[`${keyPrefix}items`], `${keyPrefix}items`, ImageMetadata),
        }
    },
}
