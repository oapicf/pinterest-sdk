const utils = require('../utils/utils');
const AudienceDataParty = require('../models/AudienceDataParty');
const AudienceRule = require('../models/AudienceRule');
const AudienceSharingType = require('../models/AudienceSharingType');

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
                key: `${keyPrefix}name`,
                label: `Audience name. - [${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            ...AudienceRule.fields(`${keyPrefix}rule`, isInput),
            {
                key: `${keyPrefix}sharing_type`,
                ...AudienceSharingType.fields(`${keyPrefix}sharing_type`, isInput),
            },
            {
                key: `${keyPrefix}data_party`,
                ...AudienceDataParty.fields(`${keyPrefix}data_party`, isInput),
            },
            {
                key: `${keyPrefix}category`,
                label: `[${labelPrefix}category]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ad_account_id': bundle.inputData?.[`${keyPrefix}ad_account_id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'rule': utils.removeIfEmpty(AudienceRule.mapping(bundle, `${keyPrefix}rule`)),
            'sharing_type': bundle.inputData?.[`${keyPrefix}sharing_type`],
            'data_party': bundle.inputData?.[`${keyPrefix}data_party`],
            'category': bundle.inputData?.[`${keyPrefix}category`],
        }
    },
}
