const utils = require('../utils/utils');
const CatalogsProductGroupFilters = require('../models/CatalogsProductGroupFilters');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}feed_id`,
                label: `Catalog Feed id pertaining to the catalog product group filter. - [${labelPrefix}feed_id]`,
                required: true,
                type: 'string',
            },
            ...CatalogsProductGroupFilters.fields(`${keyPrefix}filters`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'feed_id': bundle.inputData?.[`${keyPrefix}feed_id`],
            'filters': utils.removeIfEmpty(CatalogsProductGroupFilters.mapping(bundle, `${keyPrefix}filters`)),
        }
    },
}
