const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}APP_TYPE`,
                label: `[${labelPrefix}APP_TYPE]`,
                type: 'string',
                choices: [
                    'android_mobile',
                    'android_tablet',
                    'ipad',
                    'iphone',
                    'web',
                    'web_mobile',
                ],
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'APP_TYPE': bundle.inputData?.[`${keyPrefix}APP_TYPE`],
        }
    },
}
