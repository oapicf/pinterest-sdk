const utils = require('../utils/utils');
const CatalogsProductGroupFiltersRequest = require('../models/CatalogsProductGroupFiltersRequest');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}description`,
                label: `[${labelPrefix}description]`,
                type: 'string',
            },
            ...CatalogsProductGroupFiltersRequest.fields(`${keyPrefix}filters`, isInput),
            {
                key: `${keyPrefix}is_featured`,
                label: `boolean indicator of whether the product group is being featured or not - [${labelPrefix}is_featured]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}name`,
                label: `[${labelPrefix}name]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'filters': utils.removeIfEmpty(CatalogsProductGroupFiltersRequest.mapping(bundle, `${keyPrefix}filters`)),
            'is_featured': bundle.inputData?.[`${keyPrefix}is_featured`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
        }
    },
}
