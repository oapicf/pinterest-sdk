const utils = require('../utils/utils');
const CatalogsProductGroupMultipleStringCriteria = require('../models/CatalogsProductGroupMultipleStringCriteria');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...CatalogsProductGroupMultipleStringCriteria.fields(`${keyPrefix}TITLE_KEYWORDS`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'TITLE_KEYWORDS': utils.removeIfEmpty(CatalogsProductGroupMultipleStringCriteria.mapping(bundle, `${keyPrefix}TITLE_KEYWORDS`)),
        }
    },
}
