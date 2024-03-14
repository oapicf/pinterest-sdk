const utils = require('../utils/utils');
const CatalogsFeedIngestionErrors = require('../models/CatalogsFeedIngestionErrors');
const CatalogsFeedIngestionInfo = require('../models/CatalogsFeedIngestionInfo');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            ...CatalogsFeedIngestionErrors.fields(`${keyPrefix}errors`, isInput),
            ...CatalogsFeedIngestionInfo.fields(`${keyPrefix}info`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'errors': utils.removeIfEmpty(CatalogsFeedIngestionErrors.mapping(bundle, `${keyPrefix}errors`)),
            'info': utils.removeIfEmpty(CatalogsFeedIngestionInfo.mapping(bundle, `${keyPrefix}info`)),
        }
    },
}
