const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}ad_account_id`,
                label: `Associated ad account ID. - [${labelPrefix}ad_account_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}created_time`,
                label: `Creation time. Unix timestamp in seconds. - [${labelPrefix}created_time]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}id`,
                label: `Customer list ID. - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `Customer list name. - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}num_batches`,
                label: `Total number of list updates.  List creation counts as one batch. Each <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append</a> or <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call counts as another. List creation via the Ads Manager UI could result in more than one batch since the UI breaks up large lists. - [${labelPrefix}num_batches]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}num_removed_user_records`,
                label: `Number of removed user records. In a <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call, this counter increases even if the user is not found in the list. - [${labelPrefix}num_removed_user_records]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}num_uploaded_user_records`,
                label: `Number of uploaded user records. In an <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append API</a> call, this counter increases even if the uploaded user is already in the list. - [${labelPrefix}num_uploaded_user_records]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}status`,
                label: `Customer list status. TOO_SMALL - the list has less than 100 Pinterest users. - [${labelPrefix}status]`,
                type: 'string',
                choices: [
                    'PROCESSING',
                    'READY',
                    'TOO_SMALL',
                    'UPLOADING',
                ],
            },
            {
                key: `${keyPrefix}type`,
                label: `Always \"customerlist\". - [${labelPrefix}type]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}updated_time`,
                label: `Last update time. Unix timestamp in seconds. - [${labelPrefix}updated_time]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}exceptions`,
                label: `Customer list errors - [${labelPrefix}exceptions]`,
                dict: true,
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ad_account_id': bundle.inputData?.[`${keyPrefix}ad_account_id`],
            'created_time': bundle.inputData?.[`${keyPrefix}created_time`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'num_batches': bundle.inputData?.[`${keyPrefix}num_batches`],
            'num_removed_user_records': bundle.inputData?.[`${keyPrefix}num_removed_user_records`],
            'num_uploaded_user_records': bundle.inputData?.[`${keyPrefix}num_uploaded_user_records`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'updated_time': bundle.inputData?.[`${keyPrefix}updated_time`],
            'exceptions': bundle.inputData?.[`${keyPrefix}exceptions`],
        }
    },
}
