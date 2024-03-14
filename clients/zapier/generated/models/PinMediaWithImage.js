const utils = require('../utils/utils');
const ImageDetails = require('../models/ImageDetails');
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
            ...ImageDetails.fields(`${keyPrefix}images`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'media_type': bundle.inputData?.[`${keyPrefix}media_type`],
            'images': utils.removeIfEmpty(ImageDetails.mapping(bundle, `${keyPrefix}images`)),
        }
    },
}
