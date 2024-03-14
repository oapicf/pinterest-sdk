const utils = require('../utils/utils');
const CatalogsProductGroupFiltersAllOfRequest = require('../models/CatalogsProductGroupFiltersAllOfRequest');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}name`,
                label: `[${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}description`,
                label: `[${labelPrefix}description]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}is_featured`,
                label: `boolean indicator of whether the product group is being featured or not - [${labelPrefix}is_featured]`,
                type: 'boolean',
            },
            ...CatalogsProductGroupFiltersAllOfRequest.fields(`${keyPrefix}filters`, isInput),
            {
                key: `${keyPrefix}feed_id`,
                label: `Catalog Feed id pertaining to the catalog product group. - [${labelPrefix}feed_id]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'is_featured': bundle.inputData?.[`${keyPrefix}is_featured`],
            'filters': utils.removeIfEmpty(CatalogsProductGroupFiltersAllOfRequest.mapping(bundle, `${keyPrefix}filters`)),
            'feed_id': bundle.inputData?.[`${keyPrefix}feed_id`],
        }
    },
}
