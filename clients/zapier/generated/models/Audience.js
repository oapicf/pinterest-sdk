const utils = require('../utils/utils');
const AudienceRule = require('../models/AudienceRule');

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
                key: `${keyPrefix}id`,
                label: `Audience ID. - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `Audience name. - [${labelPrefix}name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}audience_type`,
                label: `<a href=\"/docs/reference/glossary/#Audience Types\">Audience types</a>: ACTALIKE, ENGAGEMENT, CUSTOMER_LIST and VISITOR - [${labelPrefix}audience_type]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}description`,
                label: `Audience description. - [${labelPrefix}description]`,
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
                label: `Audience status. READY, INITIALIZING, TOO_SMALL - Each audience list needs to have at least 100 people with Pinterest accounts before you can start using it. - [${labelPrefix}status]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}type`,
                label: `Always \"audience\". - [${labelPrefix}type]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}created_timestamp`,
                label: `Creation time. Unix timestamp in seconds. - [${labelPrefix}created_timestamp]`,
                type: 'integer',
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
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'audience_type': bundle.inputData?.[`${keyPrefix}audience_type`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'rule': utils.removeIfEmpty(AudienceRule.mapping(bundle, `${keyPrefix}rule`)),
            'size': bundle.inputData?.[`${keyPrefix}size`],
            'status': bundle.inputData?.[`${keyPrefix}status`],
            'type': bundle.inputData?.[`${keyPrefix}type`],
            'created_timestamp': bundle.inputData?.[`${keyPrefix}created_timestamp`],
            'updated_timestamp': bundle.inputData?.[`${keyPrefix}updated_timestamp`],
        }
    },
}
