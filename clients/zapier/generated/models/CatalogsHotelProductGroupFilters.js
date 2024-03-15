const utils = require('../utils/utils');
const CatalogsHotelProductGroupFilterKeys = require('../models/CatalogsHotelProductGroupFilterKeys');
const CatalogsHotelProductGroupFiltersAllOf = require('../models/CatalogsHotelProductGroupFiltersAllOf');
const CatalogsHotelProductGroupFiltersAnyOf = require('../models/CatalogsHotelProductGroupFiltersAnyOf');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}any_of`,
                label: `[${labelPrefix}any_of]`,
                children: CatalogsHotelProductGroupFilterKeys.fields(`${keyPrefix}any_of${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}all_of`,
                label: `[${labelPrefix}all_of]`,
                children: CatalogsHotelProductGroupFilterKeys.fields(`${keyPrefix}all_of${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'any_of': utils.childMapping(bundle.inputData?.[`${keyPrefix}any_of`], `${keyPrefix}any_of`, CatalogsHotelProductGroupFilterKeys),
            'all_of': utils.childMapping(bundle.inputData?.[`${keyPrefix}all_of`], `${keyPrefix}all_of`, CatalogsHotelProductGroupFilterKeys),
        }
    },
}
