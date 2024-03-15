const utils = require('../utils/utils');
const CatalogsProductGroupMultipleCountriesCriteria = require('../models/CatalogsProductGroupMultipleCountriesCriteria');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'COUNTRY': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}COUNTRY`)),
        }
    },
}
