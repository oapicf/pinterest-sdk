const utils = require('../utils/utils');
const ProductCategoryEnum = require('../models/ProductCategoryEnum');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}negated`,
                label: `[${labelPrefix}negated]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}values`,
                list: true,
                type: 'string',
                ...ProductCategoryEnum.fields(`${keyPrefix}values`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'negated': bundle.inputData?.[`${keyPrefix}negated`],
            'values': utils.childMapping(bundle.inputData?.[`${keyPrefix}values`], `${keyPrefix}values`, ProductCategoryEnum),
        }
    },
}
