const utils = require('../utils/utils');
const Role = require('../models/Role');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}audience_id`,
                label: `Unique identifier of an audience - [${labelPrefix}audience_id]`,
                required: true,
                type: 'string',
            },
            {
                key: `${keyPrefix}permissions`,
                list: true,
                type: 'string',
                ...Role.fields(`${keyPrefix}permissions`, isInput),
            },
            {
                key: `${keyPrefix}recipient_account_ids`,
                label: `Ad account IDs to share with or revoke from (request) / that received the audience (response). - [${labelPrefix}recipient_account_ids]`,
                required: true,
                list: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'audience_id': bundle.inputData?.[`${keyPrefix}audience_id`],
            'permissions': utils.childMapping(bundle.inputData?.[`${keyPrefix}permissions`], `${keyPrefix}permissions`, Role),
            'recipient_account_ids': bundle.inputData?.[`${keyPrefix}recipient_account_ids`],
        }
    },
}
