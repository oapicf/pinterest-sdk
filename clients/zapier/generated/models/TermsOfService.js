const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}id`,
                label: `The ID of the terms of service - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}html`,
                label: `The terms of service content - [${labelPrefix}html]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}has_accepted`,
                label: `Whether the ad account has accepted terms of service. - [${labelPrefix}has_accepted]`,
                type: 'boolean',
            },
            {
                key: `${keyPrefix}ad_account_id`,
                label: `The ID of the ad account. - [${labelPrefix}ad_account_id]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'html': bundle.inputData?.[`${keyPrefix}html`],
            'has_accepted': bundle.inputData?.[`${keyPrefix}has_accepted`],
            'ad_account_id': bundle.inputData?.[`${keyPrefix}ad_account_id`],
        }
    },
}
