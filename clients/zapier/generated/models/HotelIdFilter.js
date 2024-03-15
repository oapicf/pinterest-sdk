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
            'HOTEL_ID': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}HOTEL_ID`)),
        }
    },
}
