const utils = require('../utils/utils');
const CatalogsFeedValidationErrors = require('../models/CatalogsFeedValidationErrors');
const CatalogsFeedValidationWarnings = require('../models/CatalogsFeedValidationWarnings');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...CatalogsFeedValidationErrors.fields(`${keyPrefix}errors`, isInput),
            ...CatalogsFeedValidationWarnings.fields(`${keyPrefix}warnings`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'errors': utils.removeIfEmpty(CatalogsFeedValidationErrors.mapping(bundle, `${keyPrefix}errors`)),
            'warnings': utils.removeIfEmpty(CatalogsFeedValidationWarnings.mapping(bundle, `${keyPrefix}warnings`)),
        }
    },
}
