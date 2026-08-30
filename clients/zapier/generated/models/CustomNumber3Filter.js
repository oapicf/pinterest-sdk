const utils = require('../utils/utils');
const CatalogsProductGroupUint32Criteria = require('../models/CatalogsProductGroupUint32Criteria');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...CatalogsProductGroupUint32Criteria.fields(`${keyPrefix}CUSTOM_NUMBER_3`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'CUSTOM_NUMBER_3': utils.removeIfEmpty(CatalogsProductGroupUint32Criteria.mapping(bundle, `${keyPrefix}CUSTOM_NUMBER_3`)),
        }
    },
}
