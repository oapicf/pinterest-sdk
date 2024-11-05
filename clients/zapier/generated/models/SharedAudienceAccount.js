const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}account_id`,
                label: `Account ID (ad account or business ID). - [${labelPrefix}account_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}account_name`,
                label: `Account name. - [${labelPrefix}account_name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}account_type`,
                label: `account type - [${labelPrefix}account_type]`,
                required: true,
                type: 'string',
                choices: [
                    'AD_ACCOUNT',
                    'BUSINESS_ACCOUNT',
                ],
            },
            {
                key: `${keyPrefix}shared_on_timestamp`,
                label: `Epoch timestamp in seconds for the shared audience event - [${labelPrefix}shared_on_timestamp]`,
                required: true,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'account_id': bundle.inputData?.[`${keyPrefix}account_id`],
            'account_name': bundle.inputData?.[`${keyPrefix}account_name`],
            'account_type': bundle.inputData?.[`${keyPrefix}account_type`],
            'shared_on_timestamp': bundle.inputData?.[`${keyPrefix}shared_on_timestamp`],
        }
    },
}
