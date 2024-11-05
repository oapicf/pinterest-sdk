const utils = require('../utils/utils');
const CatalogsProductGroupMultipleMediaTypesCriteria = require('../models/CatalogsProductGroupMultipleMediaTypesCriteria');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'MEDIA_TYPE': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}MEDIA_TYPE`)),
        }
    },
}
