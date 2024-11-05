const utils = require('../utils/utils');
const OperationType = require('../models/OperationType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}audience_id`,
                label: `Unique identifier of an audience - [${labelPrefix}audience_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}operation_type`,
                ...OperationType.fields(`${keyPrefix}operation_type`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'audience_id': bundle.inputData?.[`${keyPrefix}audience_id`],
            'operation_type': bundle.inputData?.[`${keyPrefix}operation_type`],
        }
    },
}
