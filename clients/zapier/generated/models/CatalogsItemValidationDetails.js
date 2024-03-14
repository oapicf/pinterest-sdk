const utils = require('../utils/utils');
const NullableCatalogsItemFieldType = require('../models/NullableCatalogsItemFieldType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}attribute_name`,
                ...NullableCatalogsItemFieldType.fields(`${keyPrefix}attribute_name`, isInput),
            },
            {
                key: `${keyPrefix}provided_value`,
                label: `Provided value that caused the validation issue. - [${labelPrefix}provided_value]`,
                required: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'attribute_name': bundle.inputData?.[`${keyPrefix}attribute_name`],
            'provided_value': bundle.inputData?.[`${keyPrefix}provided_value`],
        }
    },
}
