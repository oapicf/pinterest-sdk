const utils = require('../utils/utils');
const SupplementalItemBatchOperationStatus = require('../models/SupplementalItemBatchOperationStatus');
const SupplementalOperationResult = require('../models/SupplementalOperationResult');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}batch_id`,
                label: `Id of the batch operation - [${labelPrefix}batch_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}completed_time`,
                label: `Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss - [${labelPrefix}completed_time]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}created_time`,
                label: `Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss - [${labelPrefix}created_time]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}operation_results`,
                label: `[${labelPrefix}operation_results]`,
                children: SupplementalOperationResult.fields(`${keyPrefix}operation_results${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}status`,
                ...SupplementalItemBatchOperationStatus.fields(`${keyPrefix}status`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'batch_id': bundle.inputData?.[`${keyPrefix}batch_id`],
            'completed_time': bundle.inputData?.[`${keyPrefix}completed_time`],
            'created_time': bundle.inputData?.[`${keyPrefix}created_time`],
            'operation_results': utils.childMapping(bundle.inputData?.[`${keyPrefix}operation_results`], `${keyPrefix}operation_results`, SupplementalOperationResult),
            'status': bundle.inputData?.[`${keyPrefix}status`],
        }
    },
}
