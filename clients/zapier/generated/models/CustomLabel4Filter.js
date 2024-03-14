const utils = require('../utils/utils');
const CatalogsProductGroupMultipleStringCriteria = require('../models/CatalogsProductGroupMultipleStringCriteria');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'CUSTOM_LABEL_4': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}CUSTOM_LABEL_4`)),
        }
    },
}
