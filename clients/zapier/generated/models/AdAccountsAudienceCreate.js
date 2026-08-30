const utils = require('../utils/utils');
const AdAccountsAudienceRule = require('../models/AdAccountsAudienceRule');
const AudienceType = require('../models/AudienceType');

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
                ...AudienceType.fields(`${keyPrefix}audience_type`, isInput),
            },
            {
                key: `${keyPrefix}description`,
                label: `Audience description. - [${labelPrefix}description]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}name`,
                label: `Audience name. - [${labelPrefix}name]`,
                type: 'string',
            },
            ...AdAccountsAudienceRule.fields(`${keyPrefix}rule`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ad_account_id': bundle.inputData?.[`${keyPrefix}ad_account_id`],
            'audience_type': bundle.inputData?.[`${keyPrefix}audience_type`],
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'rule': utils.removeIfEmpty(AdAccountsAudienceRule.mapping(bundle, `${keyPrefix}rule`)),
        }
    },
}
