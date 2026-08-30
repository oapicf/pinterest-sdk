const utils = require('../utils/utils');
const CatalogsProductGroupFilterOperatorTypeCriteria = require('../models/CatalogsProductGroupFilterOperatorTypeCriteria');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...CatalogsProductGroupFilterOperatorTypeCriteria.fields(`${keyPrefix}LINK`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'LINK': utils.removeIfEmpty(CatalogsProductGroupFilterOperatorTypeCriteria.mapping(bundle, `${keyPrefix}LINK`)),
        }
    },
}
