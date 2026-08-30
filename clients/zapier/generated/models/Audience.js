const utils = require('../utils/utils');
const AudienceRule = require('../models/AudienceRule');
const AudienceStatus = require('../models/AudienceStatus');
const PinnerListType = require('../models/PinnerListType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}ad_account_id`,
                label: `Ad account ID. - [${labelPrefix}ad_account_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}audience_type`,
                ...PinnerListType.fields(`${keyPrefix}audience_type`, isInput),
            },
            {
                key: `${keyPrefix}created_by_company_name`,
                label: `The company that created this audience. - [${labelPrefix}created_by_company_name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}created_timestamp`,
                label: `Creation time. Unix timestamp in seconds. - [${labelPrefix}created_timestamp]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}description`,
                label: `Audience description. - [${labelPrefix}description]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}id`,
                label: `Audience ID. - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}is_nca`,
                label: `Whether the audience derives from a new customer acquisition (expanded matching) customer list. Read-only. - [${labelPrefix}is_nca]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}name`,
                label: `Audience name. - [${labelPrefix}name]`,
                type: 'string',
            },
            ...AudienceRule.fields(`${keyPrefix}rule`, isInput),
            {
                key: `${keyPrefix}size`,
                label: `Audience size. - [${labelPrefix}size]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}status`,
                ...AudienceStatus.fields(`${keyPrefix}status`, isInput),
            },
            {
                key: `${keyPrefix}type`,
                label: `Always \"audience\". - [${labelPrefix}type]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}updated_timestamp`,
                label: `Last update time. Unix timestamp in seconds. - [${labelPrefix}updated_timestamp]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ad_account_id': bundle.inputData?.[`${keyPrefix}ad_account_id`],
            'audience_type': bundle.inputData?.[`${keyPrefix}audience_type`],
            'created_by_company_name': bundle.inputData?.[`${keyPrefix}created_by_company_name`],
            'created_timestamp': bundle.inputData?.[`${keyPrefix}created_timestamp`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'is_nca': bundle.inputData?.[`${keyPrefix}is_nca`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'rule': utils.removeIfEmpty(AudienceRule.mapping(bundle, `${keyPrefix}rule`)),
            'size': bundle.inputData?.[`${keyPrefix}size`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'updated_timestamp': bundle.inputData?.[`${keyPrefix}updated_timestamp`],
        }
    },
}
