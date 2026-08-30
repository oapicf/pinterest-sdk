const utils = require('../utils/utils');
const FilterOperatorType = require('../models/FilterOperatorType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}filter_operator_type`,
                ...FilterOperatorType.fields(`${keyPrefix}filter_operator_type`, isInput),
            },
            {
                key: `${keyPrefix}negated`,
                label: `[${labelPrefix}negated]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}values`,
                label: `[${labelPrefix}values]`,
                required: true,
                list: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'filter_operator_type': bundle.inputData?.[`${keyPrefix}filter_operator_type`],
            'negated': bundle.inputData?.[`${keyPrefix}negated`],
            'values': bundle.inputData?.[`${keyPrefix}values`],
        }
    },
}
