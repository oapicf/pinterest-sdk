const utils = require('../utils/utils');
const CatalogsProductGroupFilterOperatorTypeCriteria = require('../models/CatalogsProductGroupFilterOperatorTypeCriteria');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...CatalogsProductGroupFilterOperatorTypeCriteria.fields(`${keyPrefix}CUSTOM_LABEL_1`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'CUSTOM_LABEL_1': utils.removeIfEmpty(CatalogsProductGroupFilterOperatorTypeCriteria.mapping(bundle, `${keyPrefix}CUSTOM_LABEL_1`)),
        }
    },
}
