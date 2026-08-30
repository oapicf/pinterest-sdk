const utils = require('../utils/utils');
const CatalogsProductGroupMultipleStringCriteria = require('../models/CatalogsProductGroupMultipleStringCriteria');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...CatalogsProductGroupMultipleStringCriteria.fields(`${keyPrefix}CREATIVE_ASSETS_ID`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'CREATIVE_ASSETS_ID': utils.removeIfEmpty(CatalogsProductGroupMultipleStringCriteria.mapping(bundle, `${keyPrefix}CREATIVE_ASSETS_ID`)),
        }
    },
}
