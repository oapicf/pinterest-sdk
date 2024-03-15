const utils = require('../utils/utils');
const NonNullableCatalogsCurrency = require('../models/NonNullableCatalogsCurrency');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}operator`,
                label: `[${labelPrefix}operator]`,
                required: true,
                type: 'string',
                choices: [
                    'GREATER_THAN',
                    'GREATER_THAN_OR_EQUALS',
                    'LESS_THAN',
                    'LESS_THAN_OR_EQUALS',
                ],
            },
            {
                key: `${keyPrefix}value`,
                label: `[${labelPrefix}value]`,
                required: true,
                type: 'number',
            },
            {
                key: `${keyPrefix}currency`,
                ...NonNullableCatalogsCurrency.fields(`${keyPrefix}currency`, isInput),
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
            'operator': bundle.inputData?.[`${keyPrefix}operator`],
            'value': bundle.inputData?.[`${keyPrefix}value`],
            'currency': bundle.inputData?.[`${keyPrefix}currency`],
            'negated': bundle.inputData?.[`${keyPrefix}negated`],
        }
    },
}
