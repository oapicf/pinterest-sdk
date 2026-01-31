const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}app_id`,
                label: `App ID in Google Play Store, AppStore or other stores. - [${labelPrefix}app_id]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}app_name`,
                label: `Name of the app. Primarily used for Mobile Apps. - [${labelPrefix}app_name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}app_package_name`,
                label: `App package name - [${labelPrefix}app_package_name]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}app_store`,
                label: `The name of the app distributor or store from which the app was installed. Some options: Samsung Galaxy Store, Google Play Store, Amazon Store, Apple App Store, F-Droid, Aptoide, Obtanium, Huawei AppGallery, Xiaomi Mi GetApps - [${labelPrefix}app_store]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}app_version`,
                label: `App version. Primarily used for mobile apps - [${labelPrefix}app_version]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}install_time`,
                label: `App install time. Unix timestamp in seconds - [${labelPrefix}install_time]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}user_agent`,
                label: `User Agent request header. Primarily used for Web events - [${labelPrefix}user_agent]`,
                type: 'string',
            },
            {
                key: `${keyPrefix}window_height`,
                label: `Inner height of the window or viewport. - [${labelPrefix}window_height]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}window_width`,
                label: `Inner width of the window or viewport. - [${labelPrefix}window_width]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'app_id': bundle.inputData?.[`${keyPrefix}app_id`],
            'app_name': bundle.inputData?.[`${keyPrefix}app_name`],
            'app_package_name': bundle.inputData?.[`${keyPrefix}app_package_name`],
            'app_store': bundle.inputData?.[`${keyPrefix}app_store`],
            'app_version': bundle.inputData?.[`${keyPrefix}app_version`],
            'install_time': bundle.inputData?.[`${keyPrefix}install_time`],
            'user_agent': bundle.inputData?.[`${keyPrefix}user_agent`],
            'window_height': bundle.inputData?.[`${keyPrefix}window_height`],
            'window_width': bundle.inputData?.[`${keyPrefix}window_width`],
        }
    },
}
