const utils = require('../utils/utils');
const AudienceCreateRequest_1_audience_type = require('../models/AudienceCreateRequest_1_audience_type');
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
                key: `${keyPrefix}name`,
                label: `Audience name. - [${labelPrefix}name]`,
                required: true,
                type: 'string',
            },
            ...AudienceRule.fields(`${keyPrefix}rule`, isInput),
            {
                key: `${keyPrefix}description`,
                label: `Audience description. - [${labelPrefix}description]`,
                type: 'string',
            },
            ...AudienceCreateRequest_1_audience_type.fields(`${keyPrefix}audience_type`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ad_account_id': bundle.inputData?.[`${keyPrefix}ad_account_id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'rule': utils.removeIfEmpty(AudienceRule.mapping(bundle, `${keyPrefix}rule`)),
            'description': bundle.inputData?.[`${keyPrefix}description`],
            'audience_type': utils.removeIfEmpty(AudienceCreateRequest_1_audience_type.mapping(bundle, `${keyPrefix}audience_type`)),
        }
    },
}
