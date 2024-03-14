const utils = require('../utils/utils');
const CatalogsProductGroupFilterKeys = require('../models/CatalogsProductGroupFilterKeys');
const CatalogsProductGroupFiltersAllOf = require('../models/CatalogsProductGroupFiltersAllOf');
const CatalogsProductGroupFiltersAnyOf = require('../models/CatalogsProductGroupFiltersAnyOf');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}any_of`,
                label: `[${labelPrefix}any_of]`,
                children: CatalogsProductGroupFilterKeys.fields(`${keyPrefix}any_of${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}all_of`,
                label: `[${labelPrefix}all_of]`,
                children: CatalogsProductGroupFilterKeys.fields(`${keyPrefix}all_of${!isInput ? '[]' : ''}`, isInput, true), 
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'any_of': utils.childMapping(bundle.inputData?.[`${keyPrefix}any_of`], `${keyPrefix}any_of`, CatalogsProductGroupFilterKeys),
            'all_of': utils.childMapping(bundle.inputData?.[`${keyPrefix}all_of`], `${keyPrefix}all_of`, CatalogsProductGroupFilterKeys),
        }
    },
}
