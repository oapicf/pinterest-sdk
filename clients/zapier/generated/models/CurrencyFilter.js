const utils = require('../utils/utils');
const CatalogsProductGroupCurrencyCriteria = require('../models/CatalogsProductGroupCurrencyCriteria');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...CatalogsProductGroupCurrencyCriteria.fields(`${keyPrefix}CURRENCY`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'CURRENCY': utils.removeIfEmpty(CatalogsProductGroupCurrencyCriteria.mapping(bundle, `${keyPrefix}CURRENCY`)),
        }
    },
}
