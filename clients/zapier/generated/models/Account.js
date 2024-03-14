const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}account_type`,
                label: `Type of account - [${labelPrefix}account_type]`,
                type: 'string',
                choices: [
                    'PINNER',
                    'BUSINESS',
                ],
            },
            {
                key: `${keyPrefix}profile_image`,
                label: `[${labelPrefix}profile_image]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}website_url`,
                label: `[${labelPrefix}website_url]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}username`,
                label: `[${labelPrefix}username]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'account_type': bundle.inputData?.[`${keyPrefix}account_type`],
            'profile_image': bundle.inputData?.[`${keyPrefix}profile_image`],
            'website_url': bundle.inputData?.[`${keyPrefix}website_url`],
            'username': bundle.inputData?.[`${keyPrefix}username`],
        }
    },
}
