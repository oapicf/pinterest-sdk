const utils = require('../utils/utils');
const CatalogsProductGroupUint32Criteria = require('../models/CatalogsProductGroupUint32Criteria');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'CUSTOM_NUMBER_2': utils.removeIfEmpty(.mapping(bundle, `${keyPrefix}CUSTOM_NUMBER_2`)),
        }
    },
}
