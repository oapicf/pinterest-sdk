const utils = require('../utils/utils');
const CatalogsProductGroupFilterKeys = require('../models/CatalogsProductGroupFilterKeys');
const CatalogsProductGroupFiltersRequest_anyOf = require('../models/CatalogsProductGroupFiltersRequest_anyOf');
const CatalogsProductGroupFiltersRequest_anyOf_1 = require('../models/CatalogsProductGroupFiltersRequest_anyOf_1');

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
