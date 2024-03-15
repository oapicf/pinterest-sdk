const utils = require('../utils/utils');
const ImageDetails = require('../models/ImageDetails');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            '150x150': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}150x150`)),
            '400x300': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}400x300`)),
            '600x': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}600x`)),
            '1200x': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}1200x`)),
        }
    },
}
