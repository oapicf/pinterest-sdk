const utils = require('../utils/utils');
const CatalogsProductGroupMultipleStringListCriteria = require('../models/CatalogsProductGroupMultipleStringListCriteria');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...CatalogsProductGroupMultipleStringListCriteria.fields(`${keyPrefix}PRODUCT_TYPE_4`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'PRODUCT_TYPE_4': utils.removeIfEmpty(CatalogsProductGroupMultipleStringListCriteria.mapping(bundle, `${keyPrefix}PRODUCT_TYPE_4`)),
        }
    },
}
