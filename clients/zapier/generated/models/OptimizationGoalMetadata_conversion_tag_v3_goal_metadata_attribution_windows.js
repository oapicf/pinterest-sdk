const utils = require('../utils/utils');

module.exports = {
    fields: (prefix = '', isInput = true, isArrayChild = false) => {
        const {keyPrefix, labelPrefix} = utils.buildKeyAndLabel(prefix, isInput, isArrayChild)
        return [
            {
                key: `${keyPrefix}click_window_days`,
                label: `[${labelPrefix}click_window_days]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}engagement_window_days`,
                label: `[${labelPrefix}engagement_window_days]`,
                type: 'integer',
            },
            {
                key: `${keyPrefix}view_window_days`,
                label: `[${labelPrefix}view_window_days]`,
                type: 'integer',
            },
        ]
    },
    mapping: (bundle, prefix = '') => {
        const {keyPrefix} = utils.buildKeyAndLabel(prefix)
        return {
            'click_window_days': bundle.inputData?.[`${keyPrefix}click_window_days`],
            'engagement_window_days': bundle.inputData?.[`${keyPrefix}engagement_window_days`],
            'view_window_days': bundle.inputData?.[`${keyPrefix}view_window_days`],
        }
    },
}
