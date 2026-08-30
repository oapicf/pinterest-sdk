const utils = require('../utils/utils');
const CatalogsProductGroupMultipleStringCriteria = require('../models/CatalogsProductGroupMultipleStringCriteria');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...CatalogsProductGroupMultipleStringCriteria.fields(`${keyPrefix}ITEM_ID`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ITEM_ID': utils.removeIfEmpty(CatalogsProductGroupMultipleStringCriteria.mapping(bundle, `${keyPrefix}ITEM_ID`)),
        }
    },
}
