const utils = require('../utils/utils');
const CatalogsFeedIngestionErrors = require('../models/CatalogsFeedIngestionErrors');
const CatalogsFeedIngestionInfo = require('../models/CatalogsFeedIngestionInfo');
const CatalogsFeedIngestionWarnings = require('../models/CatalogsFeedIngestionWarnings');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...CatalogsFeedIngestionErrors.fields(`${keyPrefix}errors`, isInput),
            ...CatalogsFeedIngestionInfo.fields(`${keyPrefix}info`, isInput),
            ...CatalogsFeedIngestionWarnings.fields(`${keyPrefix}warnings`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'errors': utils.removeIfEmpty(CatalogsFeedIngestionErrors.mapping(bundle, `${keyPrefix}errors`)),
            'info': utils.removeIfEmpty(CatalogsFeedIngestionInfo.mapping(bundle, `${keyPrefix}info`)),
            'warnings': utils.removeIfEmpty(CatalogsFeedIngestionWarnings.mapping(bundle, `${keyPrefix}warnings`)),
        }
    },
}
