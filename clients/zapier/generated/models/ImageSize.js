const utils = require('../utils/utils');
const ImageDetails = require('../models/ImageDetails');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...ImageDetails.fields(`${keyPrefix}1200x`, isInput),
            ...ImageDetails.fields(`${keyPrefix}150x150`, isInput),
            ...ImageDetails.fields(`${keyPrefix}400x300`, isInput),
            ...ImageDetails.fields(`${keyPrefix}600x`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            '1200x': utils.removeIfEmpty(ImageDetails.mapping(bundle, `${keyPrefix}1200x`)),
            '150x150': utils.removeIfEmpty(ImageDetails.mapping(bundle, `${keyPrefix}150x150`)),
            '400x300': utils.removeIfEmpty(ImageDetails.mapping(bundle, `${keyPrefix}400x300`)),
            '600x': utils.removeIfEmpty(ImageDetails.mapping(bundle, `${keyPrefix}600x`)),
        }
    },
}
