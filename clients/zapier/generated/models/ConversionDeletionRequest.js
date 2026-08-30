const utils = require('../utils/utils');
const ConversionDeletionRequestStatus = require('../models/ConversionDeletionRequestStatus');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}created_time`,
                label: `Timestamp when the conversion deletion request was succesfully created. - [${labelPrefix}created_time]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}processed_time`,
                label: `Timestamp when the conversion deletion request was processed. - [${labelPrefix}processed_time]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}request_id`,
                label: `Unique identifier of the conversion deletion request - [${labelPrefix}request_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}status`,
                ...ConversionDeletionRequestStatus.fields(`${keyPrefix}status`, isInput),
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'created_time': bundle.inputData?.[`${keyPrefix}created_time`],
            'processed_time': bundle.inputData?.[`${keyPrefix}processed_time`],
            'request_id': bundle.inputData?.[`${keyPrefix}request_id`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
        }
    },
}
