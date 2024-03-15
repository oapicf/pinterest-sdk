const utils = require('../utils/utils');
const CatalogsProductGroupMultipleGenderCriteria = require('../models/CatalogsProductGroupMultipleGenderCriteria');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'GENDER': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}GENDER`)),
        }
    },
}
