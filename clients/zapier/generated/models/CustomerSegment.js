const utils = require('../utils/utils');
const TargetingTemplateStatus = require('../models/TargetingTemplateStatus');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}ad_account_id`,
                label: `The ID of the ad account that this customer segment belongs to. - [${labelPrefix}ad_account_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}audience_ids`,
                label: `Audience IDs included in the customer segment. - [${labelPrefix}audience_ids]`,
                required: true,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}created_time`,
                label: `Customer segment created time. Unix timestamp in seconds. - [${labelPrefix}created_time]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}id`,
                label: `Customer segment ID. - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `Customer segment name. - [${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}status`,
                ...TargetingTemplateStatus.fields(`${keyPrefix}status`, isInput),
            },
            {
                key: `${keyPrefix}updated_time`,
                label: `Customer segment updated time. Unix timestamp in seconds. - [${labelPrefix}updated_time]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ad_account_id': bundle.inputData?.[`${keyPrefix}ad_account_id`],
            'audience_ids': bundle.inputData?.[`${keyPrefix}audience_ids`],
            'created_time': bundle.inputData?.[`${keyPrefix}created_time`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'updated_time': bundle.inputData?.[`${keyPrefix}updated_time`],
        }
    },
}
