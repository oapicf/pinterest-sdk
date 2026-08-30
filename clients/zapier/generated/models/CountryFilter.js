const utils = require('../utils/utils');
const CatalogsProductGroupMultipleCountriesCriteria = require('../models/CatalogsProductGroupMultipleCountriesCriteria');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...CatalogsProductGroupMultipleCountriesCriteria.fields(`${keyPrefix}COUNTRY`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'COUNTRY': utils.removeIfEmpty(CatalogsProductGroupMultipleCountriesCriteria.mapping(bundle, `${keyPrefix}COUNTRY`)),
        }
    },
}
