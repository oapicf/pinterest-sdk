const utils = require('../utils/utils');
const NonNullableCatalogsCurrency = require('../models/NonNullableCatalogsCurrency');
const NumericFilterOperatorType = require('../models/NumericFilterOperatorType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}currency`,
                ...NonNullableCatalogsCurrency.fields(`${keyPrefix}currency`, isInput),
            },
            {
                key: `${keyPrefix}negated`,
                label: `[${labelPrefix}negated]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}operator`,
                ...NumericFilterOperatorType.fields(`${keyPrefix}operator`, isInput),
            },
            {
                key: `${keyPrefix}value`,
                label: `[${labelPrefix}value]`,
                required: true,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'currency': bundle.inputData?.[`${keyPrefix}currency`],
            'negated': bundle.inputData?.[`${keyPrefix}negated`],
            'operator': bundle.inputData?.[`${keyPrefix}operator`],
            'value': bundle.inputData?.[`${keyPrefix}value`],
        }
    },
}
