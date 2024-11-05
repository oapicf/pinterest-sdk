const utils = require('../utils/utils');
const CatalogsItemsPostFilters = require('../models/CatalogsItemsPostFilters');
const CatalogsItemsRequest_language = require('../models/CatalogsItemsRequest_language');
const Country = require('../models/Country');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}country`,
                ...Country.fields(`${keyPrefix}country`, isInput),
            },
            ...CatalogsItemsRequest_language.fields(`${keyPrefix}language`, isInput),
            ...CatalogsItemsPostFilters.fields(`${keyPrefix}filters`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'country': bundle.inputData?.[`${keyPrefix}country`],
            'language': utils.removeIfEmpty(CatalogsItemsRequest_language.mapping(bundle, `${keyPrefix}language`)),
            'filters': utils.removeIfEmpty(CatalogsItemsPostFilters.mapping(bundle, `${keyPrefix}filters`)),
        }
    },
}
