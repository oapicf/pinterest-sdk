const utils = require('../utils/utils');
const UserAccountType = require('../models/UserAccountType');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}about`,
                label: `Profile about description. - [${labelPrefix}about]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}account_type`,
                ...UserAccountType.fields(`${keyPrefix}account_type`, isInput),
            },
            {
                key: `${keyPrefix}board_count`,
                label: `  User account board count.   **Note**: Board count on user account level may differ from counts found elsewhere due to attribution of collaborative Boards. - [${labelPrefix}board_count]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}business_name`,
                label: `[${labelPrefix}business_name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}follower_count`,
                label: `User account follower count. - [${labelPrefix}follower_count]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}following_count`,
                label: `User account following count. - [${labelPrefix}following_count]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}id`,
                label: `User account ID. - [${labelPrefix}id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}monthly_views`,
                label: `User account monthly views. - [${labelPrefix}monthly_views]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}pin_count`,
                label: `User account pin count. This includes both created and saved pins. - [${labelPrefix}pin_count]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}profile_image`,
                label: `[${labelPrefix}profile_image]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}username`,
                label: `[${labelPrefix}username]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}website_url`,
                label: `[${labelPrefix}website_url]`,
                type: 'string',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'about': bundle.inputData?.[`${keyPrefix}about`],
            'account_type': bundle.inputData?.[`${keyPrefix}account_type`],
            'board_count': bundle.inputData?.[`${keyPrefix}board_count`],
            'business_name': bundle.inputData?.[`${keyPrefix}business_name`],
            'follower_count': bundle.inputData?.[`${keyPrefix}follower_count`],
            'following_count': bundle.inputData?.[`${keyPrefix}following_count`],
            'id': bundle.inputData?.[`${keyPrefix}id`],
            'monthly_views': bundle.inputData?.[`${keyPrefix}monthly_views`],
            'pin_count': bundle.inputData?.[`${keyPrefix}pin_count`],
            'profile_image': bundle.inputData?.[`${keyPrefix}profile_image`],
            'username': bundle.inputData?.[`${keyPrefix}username`],
            'website_url': bundle.inputData?.[`${keyPrefix}website_url`],
        }
    },
}
