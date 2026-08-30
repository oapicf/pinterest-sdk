const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}android_mobile`,
                label: `[${labelPrefix}android_mobile]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}android_tablet`,
                label: `[${labelPrefix}android_tablet]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}ipad`,
                label: `[${labelPrefix}ipad]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}iphone`,
                label: `[${labelPrefix}iphone]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}web`,
                label: `[${labelPrefix}web]`,
                type: 'number',
            },
            {
                key: `${keyPrefix}web_mobile`,
                label: `[${labelPrefix}web_mobile]`,
                type: 'number',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'android_mobile': bundle.inputData?.[`${keyPrefix}android_mobile`],
            'android_tablet': bundle.inputData?.[`${keyPrefix}android_tablet`],
            'ipad': bundle.inputData?.[`${keyPrefix}ipad`],
            'iphone': bundle.inputData?.[`${keyPrefix}iphone`],
            'web': bundle.inputData?.[`${keyPrefix}web`],
            'web_mobile': bundle.inputData?.[`${keyPrefix}web_mobile`],
        }
    },
}
