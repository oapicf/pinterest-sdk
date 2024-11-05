const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}invite_or_request_id`,
                label: `Unique identifier of the invite/request. - [${labelPrefix}invite_or_request_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}code`,
                label: `Error code associated with the error in performing the action on the invite/request. - [${labelPrefix}code]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}message`,
                label: `Error message associated with the error in performing the action on the invite/request. - [${labelPrefix}message]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}users_or_partner_ids`,
                label: `A list of users' usernames or emails OR a list of partner ids that caused the error. - [${labelPrefix}users_or_partner_ids]`,
                list: true,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'invite_or_request_id': bundle.inputData?.[`${keyPrefix}invite_or_request_id`],
            'code': bundle.inputData?.[`${keyPrefix}code`],
            'message': bundle.inputData?.[`${keyPrefix}message`],
            'users_or_partner_ids': bundle.inputData?.[`${keyPrefix}users_or_partner_ids`],
        }
    },
}
