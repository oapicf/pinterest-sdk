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
                key: `${keyPrefix}name`,
                label: `Audience name. - [${labelPrefix}name]`,
                type: 'string',
            },
            ...AudienceRule.fields(`${keyPrefix}rule`, isInput),
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'ad_account_id': bundle.inputData?.[`${keyPrefix}ad_account_id`],
            'name': bundle.inputData?.[`${keyPrefix}name`],
            'rule': utils.removeIfEmpty(AudienceRule.mapping(bundle, `${keyPrefix}rule`)),
        }
    },
}
