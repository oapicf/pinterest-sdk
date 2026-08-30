const utils = require('../utils/utils');
const NumericFilterOperatorType = require('../models/NumericFilterOperatorType');

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
                key: `${keyPrefix}operator`,
                ...NumericFilterOperatorType.fields(`${keyPrefix}operator`, isInput),
            },
            {
                key: `${keyPrefix}value`,
                label: `[${labelPrefix}value]`,
                required: true,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'negated': bundle.inputData?.[`${keyPrefix}negated`],
            'operator': bundle.inputData?.[`${keyPrefix}operator`],
            'value': bundle.inputData?.[`${keyPrefix}value`],
        }
    },
}
