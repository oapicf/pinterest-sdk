const utils = require('../utils/utils');
const CatalogsProductGroupMultipleGenderCriteria = require('../models/CatalogsProductGroupMultipleGenderCriteria');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...CatalogsProductGroupMultipleGenderCriteria.fields(`${keyPrefix}GENDER`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'GENDER': utils.removeIfEmpty(CatalogsProductGroupMultipleGenderCriteria.mapping(bundle, `${keyPrefix}GENDER`)),
        }
    },
}
