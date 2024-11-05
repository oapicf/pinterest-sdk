const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}invite_expiration`,
                label: `The date and time when the invite/request will expire. Returned in milliseconds. - [${labelPrefix}invite_expiration]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}invite_status`,
                label: `The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED. - [${labelPrefix}invite_status]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}invite_type`,
                label: `The type of invite. <br>'MEMBER_INVITE' is to invite a member to access your business assets. <br>'PARTNER_INVITE' is to invite a partner to access your business assets. <br>'PARTNER_REQUEST' is to request access a partner's business assets. - [${labelPrefix}invite_type]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}last_updated_time`,
                label: `The date and time the invite/request was last updated. Returned in milliseconds. - [${labelPrefix}last_updated_time]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}sent_at`,
                label: `The date and time the invite/request was sent/created. Returned in milliseconds. - [${labelPrefix}sent_at]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'invite_expiration': bundle.inputData?.[`${keyPrefix}invite_expiration`],
            'invite_status': bundle.inputData?.[`${keyPrefix}invite_status`],
            'invite_type': bundle.inputData?.[`${keyPrefix}invite_type`],
            'last_updated_time': bundle.inputData?.[`${keyPrefix}last_updated_time`],
            'sent_at': bundle.inputData?.[`${keyPrefix}sent_at`],
        }
    },
}
