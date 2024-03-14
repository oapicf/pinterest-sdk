const utils = require('../utils/utils');
const CatalogsProductGroupMultipleStringListCriteria = require('../models/CatalogsProductGroupMultipleStringListCriteria');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'GOOGLE_PRODUCT_CATEGORY_6': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}GOOGLE_PRODUCT_CATEGORY_6`)),
        }
    },
}
