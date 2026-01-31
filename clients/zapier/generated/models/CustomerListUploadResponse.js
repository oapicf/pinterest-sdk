const utils = require('../utils/utils');
const ErrorDetail = require('../models/ErrorDetail');
const RecordCounts = require('../models/RecordCounts');
const UserListOperationType = require('../models/UserListOperationType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}ad_account_id`,
                label: `Advertiser ID. - [${labelPrefix}ad_account_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}creation_time`,
                label: `Customer List Upload creation_time. Epoch (seconds). - [${labelPrefix}creation_time]`,
                required: true,
                type: 'integer',
            },
            {
                key: `${keyPrefix}customer_list_id`,
                label: `ID of the customer list associated with this upload. - [${labelPrefix}customer_list_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}error_counts`,
                label: `[${labelPrefix}error_counts]`,
                children: ErrorDetail.fields(`${keyPrefix}error_counts${!isInput ? '[]' : ''}`, isInput, true), 
            },
            {
                key: `${keyPrefix}id`,
                label: `Customer List Upload ID. - [${labelPrefix}id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}operation`,
                ...UserListOperationType.fields(`${keyPrefix}operation`, isInput),
            },
            ...RecordCounts.fields(`${keyPrefix}record_counts`, isInput),
            {
                key: `${keyPrefix}state`,
                label: `Workload processing state - [${labelPrefix}state]`,
                required: true,
                type: 'string',
                choices: [
                    'NOT_STARTED',
                    'RUNNING',
                    'PAUSED',
                    'SUCCEEDED',
                    'FAILED',
                ],
            },
            {
                key: `${keyPrefix}updated_time`,
                label: `Customer List Upload updated_time. Epoch (seconds). - [${labelPrefix}updated_time]`,
                required: true,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ad_account_id': bundle.inputData?.[`${keyPrefix}ad_account_id`],
            'creation_time': bundle.inputData?.[`${keyPrefix}creation_time`],
            'customer_list_id': bundle.inputData?.[`${keyPrefix}customer_list_id`],
            'error_counts': utils.childMapping(bundle.inputData?.[`${keyPrefix}error_counts`], `${keyPrefix}error_counts`, ErrorDetail),
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'operation': bundle.inputData?.[`${keyPrefix}operation`],
            'record_counts': utils.removeIfEmpty(RecordCounts.mapping(bundle, `${keyPrefix}record_counts`)),
            'state': bundle.inputData?.[`${keyPrefix}state`],
            'updated_time': bundle.inputData?.[`${keyPrefix}updated_time`],
        }
    },
}
