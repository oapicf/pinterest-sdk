const utils = require('../utils/utils');
const NonNullableCatalogsCurrency = require('../models/NonNullableCatalogsCurrency');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}values`,
                ...NonNullableCatalogsCurrency.fields(`${keyPrefix}values`, isInput),
            },
            {
                key: `${keyPrefix}negated`,
                label: `[${labelPrefix}negated]`,
                type: 'boolean',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'values': bundle.inputData?.[`${keyPrefix}values`],
            'negated': bundle.inputData?.[`${keyPrefix}negated`],
        }
    },
}
