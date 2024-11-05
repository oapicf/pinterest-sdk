const utils = require('../utils/utils');
const BusinessAccessUserSummary = require('../models/BusinessAccessUserSummary');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `Asset Group ID. - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}asset_group_name`,
                label: `Asset Group name - [${labelPrefix}asset_group_name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}asset_group_description`,
                label: `Asset group description - [${labelPrefix}asset_group_description]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}asset_group_types`,
                label: `Asset group types - [${labelPrefix}asset_group_types]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}ad_accounts_ids`,
                label: `A list of ad account IDs under the asset group - [${labelPrefix}ad_accounts_ids]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}profiles_ids`,
                label: `A list of profile IDs under asset group - [${labelPrefix}profiles_ids]`,
                list: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}created_time`,
                label: `The creation time of the asset group - [${labelPrefix}created_time]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}updated_time`,
                label: `The last update time of the asset group - [${labelPrefix}updated_time]`,
                type: 'integer',
            },
            ...BusinessAccessUserSummary.fields(`${keyPrefix}owner`, isInput),
            ...BusinessAccessUserSummary.fields(`${keyPrefix}created_by`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'asset_group_name': bundle.inputData?.[`${keyPrefix}asset_group_name`],
            'asset_group_description': bundle.inputData?.[`${keyPrefix}asset_group_description`],
            'asset_group_types': bundle.inputData?.[`${keyPrefix}asset_group_types`],
            'ad_accounts_ids': bundle.inputData?.[`${keyPrefix}ad_accounts_ids`],
            'profiles_ids': bundle.inputData?.[`${keyPrefix}profiles_ids`],
            'created_time': bundle.inputData?.[`${keyPrefix}created_time`],
            'updated_time': bundle.inputData?.[`${keyPrefix}updated_time`],
            'owner': utils.removeIfEmpty(BusinessAccessUserSummary.mapping(bundle, `${keyPrefix}owner`)),
            'created_by': utils.removeIfEmpty(BusinessAccessUserSummary.mapping(bundle, `${keyPrefix}created_by`)),
        }
    },
}
