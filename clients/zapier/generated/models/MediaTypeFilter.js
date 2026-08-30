const utils = require('../utils/utils');
const CatalogsProductGroupMultipleMediaTypesCriteria = require('../models/CatalogsProductGroupMultipleMediaTypesCriteria');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...CatalogsProductGroupMultipleMediaTypesCriteria.fields(`${keyPrefix}MEDIA_TYPE`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'MEDIA_TYPE': utils.removeIfEmpty(CatalogsProductGroupMultipleMediaTypesCriteria.mapping(bundle, `${keyPrefix}MEDIA_TYPE`)),
        }
    },
}
